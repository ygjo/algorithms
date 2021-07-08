package programmers;


//보석쇼핑 https://programmers.co.kr/learn/courses/30/lessons/67258

/*
진열대 번호 순서대로 보석들의 이름이 저장된 배열 gems가 매개변수로 주어집니다. 이때 모든 보석을 하나 이상 포함하는 가장 짧은 구간을 찾아서 return 하도록 solution 함수를 완성해주세요.
        가장 짧은 구간의 시작 진열대 번호와 끝 진열대 번호를 차례대로 배열에 담아서 return 하도록 하며, 만약 가장 짧은 구간이 여러 개라면 시작 진열대 번호가 가장 작은 구간을 return 합니다.

        [제한사항]
        gems 배열의 크기는 1 이상 100,000 이하입니다.
        gems 배열의 각 원소는 진열대에 나열된 보석을 나타냅니다.
        gems 배열에는 1번 진열대부터 진열대 번호 순서대로 보석이름이 차례대로 저장되어 있습니다.
        gems 배열의 각 원소는 길이가 1 이상 10 이하인 알파벳 대문자로만 구성된 문자열입니다.
*/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

public class P67258 {
/*    gems	result
["DIA", "RUBY", "RUBY", "DIA", "DIA", "EMERALD", "SAPPHIRE", "DIA"]	[3, 7]
        ["AA", "AB", "AC", "AA", "AC"]	[1, 3]
        ["XYZ", "XYZ", "XYZ"]	[1, 1]
        ["ZZZ", "YYY", "NNNN", "YYY", "BBB"]	[1, 5]*/
    public static void main(String[] args) {
        String[] testCase1 = {"DIA", "RUBY", "RUBY", "DIA", "DIA", "EMERALD", "SAPPHIRE", "DIA"};
        String[] testCase2 = {"AA", "AB", "AC", "AA", "AC"};
        String[] testCase3 = {"XYZ", "XYZ", "XYZ"};
        String[] testCase4 = {"ZZZ", "YYY", "NNNN", "YYY", "BBB"};

        solution(testCase1);
    }
    public static int[] solution(String[] gems) {
        int[] answer = {};
        HashMap<String,Integer> gemsBox = new HashMap<>();
        ArrayList<String> uniqueGems = new ArrayList<>();
        int gemsCount = gems.length; // 보석 개수

        for(String gem:gems){
            if(!uniqueGems.contains(gem)){
                uniqueGems.add(gem);
            }
        }
        System.out.println(uniqueGems);
        //uniqueGems 배열 맨 앞 string index 중 제일 이른 숫자
        //uniqueGems 배열 맨 뒤 string index 숫자
        for (int i=1;i<=gemsCount; i++){
            gemsBox.put(gems[i-1], i);
        }
        System.out.println(gemsBox);


        return answer;
    }
}
