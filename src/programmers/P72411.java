package programmers;

import java.util.*;

public class P72411 {
    private static List<String> combination;

    public static void main(String[] args) {

        String[] order1 = {"ABCFG", "AC", "CDE", "ACDE", "BCFG", "ACDEH"};
        int[] course1 = {2,3,4};

        String[] order2 = {"ABCDE", "AB", "CD", "ADE", "XYZ", "XYZ", "ACD"};
        int[] course2 = {2,3,5};

        solution(order2,course2);
    }

    public static String[] solution(String[] orders, int[] course) {

        String[] answer;
        combination = new ArrayList<>();

        for (int i = 0; i < orders.length; i++) {
            char[] orders_char = orders[i].toCharArray(); // 인당 주문한 조합 메뉴 -> 단품 메뉴로 쪼개기
            Arrays.sort(orders_char); // 단품 메뉴 오름차순 정렬

            for (int index = 0; index < orders_char.length ; index++) { // 조합 내 단품 메뉴 수
                for (int j = 0; j < course.length; j++) { // 조합 수
                    dfs(orders_char, index, 1, course[j], String.valueOf(orders_char[index])); // 각 메뉴 array, 조합 내 메뉴 개수 , 조합 숫자와 비교할 숫자 (종료 시점), 조합 숫자, 조합 메뉴의 단품 메뉴
                }
            }
        }

        //조합 중 같은 조합 개수 카운팅
        Map<String, Integer> map = new HashMap<>();
        for (String key : combination) {
            map.put(key, map.getOrDefault(key, 0) + 1);
        }

        System.out.println(map);//{BC=1, DE=2, XY=2, ABC=1, ADE=2, BD=1, BDE=1, XZ=2, ABD=1, BE=1, ABE=1, CDE=1, AB=2, CD=3, YZ=2, AC=2, ACD=2, BCD=1, CE=1, AD=3, ACE=1, AE=2, BCE=1, ABCDE=1, XYZ=2}
        List<String> keySetList = new ArrayList<>(map.keySet());
        System.out.println(keySetList);//[BC, DE, XY, ABC, ADE, BD, BDE, XZ, ABD, BE, ABE, CDE, AB, CD, YZ, AC, ACD, BCD, CE, AD, ACE, AE, BCE, ABCDE, XYZ]
        Collections.sort(keySetList, (o1, o2) -> (map.get(o2).compareTo(map.get(o1)))); // key 의 value 값 비교 후,  value 값 내림차순 정렬 , 값이 동일한 경우 key index 순으로 정렬
        System.out.println(keySetList);//[CD, AD, DE, XY, ADE, XZ, AB, YZ, AC, ACD, AE, XYZ, BC, ABC, BD, BDE, ABD, BE, ABE, CDE, BCD, CE, ACE, BCE, ABCDE]


        List<String> ansList = new ArrayList<>();
        for (int i = 0; i < course.length; i++) {
            int max_value = 0; // 가장 많이 주문된 횟수

            for (String key : keySetList) {
                if (map.get(key) >= 2 && key.length() == course[i]) { // 메뉴 조합이 2개 이상이고 , course　조합 개수와 동일한 메뉴
                    System.out.println(key);
                    if (map.get(key) >= max_value) {
                        ansList.add(key);
                        max_value = map.get(key);// 가장 많이 주문된 횟수 저장

                    }
                }
            }
        }
        Collections.sort(ansList);
        answer = new String[ansList.size()];
        ansList.toArray(answer);
        return answer;
    }


    //조합 dfs
    public static void dfs(char[] arr, int idx, int length, int course, String str) {
        if (length == course) {   // 조합의 길이가 course 의 조합 수에 도달하면 list에 string 적재
            combination.add(str);
        }

        for (int i = idx + 1; i < arr.length; i++) {
            dfs(arr, i, length + 1, course, str + arr[i]);
        }
    }

}
