package programmers;

import java.util.*;

//프로그래머스-튜플
public class P64065 {
    public static void main(String[] args) {
     /*   "{{2},{2,1},{2,1,3},{2,1,3,4}}"	[2, 1, 3, 4]
        "{{1,2,3},{2,1},{1,2,4,3},{2}}"	[2, 1, 3, 4]
        "{{20,111},{111}}"	[111, 20]
        "{{123}}"	[123]
        "{{4,2,3},{3},{2,3,4,1},{2,3}}"	[3, 2, 4, 1]*/
        String s1 = "{{2},{2,1},{2,1,3},{2,1,3,4}}";
        String s2 = "{{1,2,3},{2,1},{1,2,4,3},{2}}";
        String s3 = "{{20,111},{111}}";
        String s4 = "{{123}}";
        String s5 = "{{4,2,3},{3},{2,3,4,1},{2,3}}";

        solution(s3);
    }
    public static ArrayList<Integer> solution(String s) {
        ArrayList<Integer> answer = new ArrayList<>();
        String[] tuples = s.split("},");
        int tuplesLength = tuples.length;
        String[] sortArrByLength = new String[tuplesLength];
        int index = 0;

        for (String tuple : tuples){
            tuple = tuple.replaceAll("\\{|\\}|","");
            sortArrByLength[index] = tuple;
            index++;
        }

        // 내림차순 정렬(문자열 길이 기준)
        Arrays.sort(sortArrByLength, Comparator.comparingInt(String::length));

        for (String str : sortArrByLength){
            String[] arr = str.split(",");
            for (int i = 0; i < arr.length; i++){
                int n = Integer.parseInt(arr[i]);
                if (!answer.contains(n)){
                    answer.add(n);
                }
            }
        }

        return answer;
    }
}
