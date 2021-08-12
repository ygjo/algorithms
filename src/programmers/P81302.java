package programmers;

//거리두기 https://programmers.co.kr/learn/courses/30/lessons/81302
public class P81302 {
    public static void main(String[] args) {
        //두 테이블 T1, T2가 행렬 (r1, c1), (r2, c2)에 각각 위치하고 있다면, T1, T2 사이의 맨해튼 거리는 |r1 - r2| + |c1 - c2| 입니다.

      /*  대기실은 5개이며, 각 대기실은 5x5 크기입니다.
        거리두기를 위하여 응시자들 끼리는 맨해튼 거리1가 2 이하로 앉지 말아 주세요.
        단 응시자가 앉아있는 자리 사이가 파티션으로 막혀 있을 경우에는 허용합니다.*/

        String[][] places1 = {
          {"POOOP", "OXXOX", "OPXPX", "OOXOX", "POXXP"}
        , {"POOPX", "OXPXP", "PXXXO", "OXXXO", "OOOPP"}
        , {"PXOPX", "OXOXP", "OXPOX", "OXXOP", "PXPOX"}
        , {"OOOXX", "XOOOX", "OOOXX", "OXOOX", "OOOOO"}
        , {"PXPXP", "XPXPX", "PXPXP", "XPXPX", "PXPXP"}};

        solution(places1);//[1, 0, 1, 1, 1]

    }
    public static int[] solution(String[][] places) {
        int[] answer = {};
        int size = places.length;
        //1. 방향 설정
        int[][] dir = {{0,1},{1,0},{-1,0},{0,-1}};










        return answer;
    }
}
