package programmers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static jdk.nashorn.internal.objects.Global.print;

//위장 https://programmers.co.kr/learn/courses/30/lessons/42578
public class P42578 {

    public static void main(String[] args) {
     String[][] testCase1 = {{"yellow_hat", "headgear"},{"blue_sunglasses", "eyewear"},{"green_turban", "headgear"}};
     String[][] testCase2 = {{"crow_mask", "face"},{"blue_sunglasses", "face"},{"smoky_makeup", "face"}};
     String[][] testCase3 = {{"crow_mask", "face"},{"blue_sunglasses", "face"},{"smoky_makeup", "face"},{"yellow_hat", "headgear"},{"blue_sunglasses", "eyewear"},{"green_turban", "headgear"}};

     solution(testCase3);
    }
    public static int solution(String[][] clothes) {

        int answer = 0;
        int testCaseLength = clothes.length;
        Map<String,ArrayList<String>> categorizedClothes = new HashMap<>();
        String[] items = new String[testCaseLength];
        boolean[] visited = new boolean[testCaseLength];


        for (int i =0; i < testCaseLength;i++){
            //아이템 전체 목
            items[i] = clothes[i][0];

           // 카테고리 별로 아이템 저장
          ArrayList<String> current = categorizedClothes.get(clothes[i][1]);
           if (current == null){
               current= new ArrayList<>();
               categorizedClothes.put(clothes[i][1],current);
           }
           current.add(clothes[i][0]);

       }

        System.out.println(categorizedClothes);

        for (int j = 1; j <= testCaseLength; j++) {
            System.out.println("\n" + testCaseLength + " 개 중에서 " + j + " 개 뽑기");
            comb(items, visited, 0, testCaseLength, j);
        }

        if(categorizedClothes.size() == 1){ // 카테고리 다 같을 경우
            answer = testCaseLength;
        }else{
            //2개 이상 조합해서 착용 == nCr
            //카테고리가 같은 것 끼리는 조합 불가

        }

        return answer;
    }
    // 조합 메소드
    static void comb(String[] arr, boolean[] visited, int depth, int n, int r) {
        if (r == 0) {
            print(arr, visited, n);
            return;
        }

        if (depth == n) {
            return;
        }

        visited[depth] = true;
        comb(arr, visited, depth + 1, n, r - 1);

        visited[depth] = false;
        comb(arr, visited, depth + 1, n, r);
    }

    //배열 출력
    static void print(String[] arr, boolean[] visited, int n) {
        for (int i = 0; i < n; i++) {
            if (visited[i]) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }
}
