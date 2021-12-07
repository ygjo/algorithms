package programmers;

import java.util.*;

//https://programmers.co.kr/learn/courses/30/lessons/83201
public class P83201 {
    public static void main(String[] args) {
      /*  90점 이상	A
        80점 이상 90점 미만	B
        70점 이상 80점 미만	C
        50점 이상 70점 미만	D
        50점 미만	F*/

        //return "FBABD"
        int[][] scores1 = {{100, 90, 98, 88, 65}, {50, 45, 99, 85, 77}, {47, 88, 95, 80, 67}, {61, 57, 100, 80, 65}, {24, 90, 94, 75, 65}};
        //return "DA"
        int[][] scores2 = {{50, 90}, {50, 87}};
        //return "CFD"
        int[][] scores3 = {{70, 49, 90}, {68, 50, 38}, {73, 31, 100}};
        solution(scores1);
    }

    public static String solution(int[][] scores) {
        String answer = "";

        int scoresLength = scores.length;
        //List<List<Integer>> list = new ArrayList<>();
        List<Map<Integer,Integer>> list = new ArrayList<>();

        for (int i=0; i < scoresLength; i++){
            //List<Integer> studentScoreList = new ArrayList<>();
            Map<Integer,Integer> studentScoreList = new HashMap<>();
            for (int j=0; j < scoresLength; j++){
                int studentScore = scores[j][i];
                //studentScoreList.add(studentScore);
                studentScoreList.put(j,studentScore);
            }
            list.add(studentScoreList);
            int selfScore = list.get(i).get(i); // 본인이 채점한 본인 점수
            //본인 점수가 유일 최고점, 유일 최저점 일경우 제외

            System.out.println(Collections.max(list.get(i).values()));

        }
        //System.out.println(list);



        return answer;
    }
}
