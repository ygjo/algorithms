package programmers;

import java.util.HashMap;
import java.util.Map;

//위장 https://programmers.co.kr/learn/courses/30/lessons/42578
public class P42578 {
    /*  1. (headgear의 수 + 1) 1을 더 해주는 이유는 headgear를 착용하지 않을 수도 있기 때문입니다.
        2. (eyewear의 수 + 1 ) 1을 더 해주는 이유는 eyewear를 착용하지 않을 수도 있기 때문입니다.
        3. 두 수는 각각 독립적이기 때문에 1번 2번의 수를 곱하고 - 1 (모두 안입는 경우는 존재하지 않으므로)*/
    public static void main(String[] args) {
     String[][] testCase1 = {{"yellow_hat", "headgear"},{"blue_sunglasses", "eyewear"},{"green_turban", "headgear"}};
     String[][] testCase2 = {{"crow_mask", "face"},{"blue_sunglasses", "face"},{"smoky_makeup", "face"}};
     String[][] testCase3 = {{"crow_mask", "face"},{"blue_sunglasses", "face"},{"smoky_makeup", "face"},{"yellow_hat", "headgear"},{"blue_sunglasses", "eyewear"},{"green_turban", "headgear"}};

     solution(testCase1);
    }
    public static int solution(String[][] clothes) {
        int answer = 1;
        int testCaseLength = clothes.length;

        Map<String, Integer> clothesMap = new HashMap<>(); // 종류 : 갯수

        for (int i = 0; i < testCaseLength; i++) {
            // 종류 여부 판단. 같은 종류 일 경우 Value + 1
            clothesMap.put(clothes[i][1], clothesMap.getOrDefault(clothes[i][1], 0)+1);
        }

        System.out.println(clothesMap);

        // 경우의 수 체크 answer *= (옷 가지수 + 안 입을 경우)
        for (int val : clothesMap.values()){ //3 1 2
            answer *= (val+1);;
        }

        // 모두 다 안입는 경우는 존재하지 않으므로 -1
        return answer-1;
    }


}
