package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

//체육복
public class P42862 {

    public static void main(String[] args) {
        int n1 = 5;
        int[] lost1 = {2,4};
        int[] reserve1 = {1,3,5};

        int n2 = 5;
        int[] lost2 = {2,4};
        int[] reserve2 = {3};

        int n3 = 3;
        int[] lost3 = {3};
        int[] reserve3 = {1};

        int n4 = 8;
        int[] lost4 = {1,2,3,6,7,8};
        int[] reserve4 = {2,4,6,9};

        int n5 = 5;
        int[] lost5 = {4,2};
        int[] reserve5 = {3,1};




        solution(n5,lost5,reserve5);
    }

    public static int solution(int n, int[] lost, int[] reserve) {
        //n : 전체 학생수 , lost : 체육복 분실한 학생 번호 배열, reserve : 여분 체육복 소유 학생 번호 배열 , answer : 체육수업에 참가할 수 있는 최대 학생 수
        //바로 앞번호 학생이나 바로 뒷번호 학생한테만 빌려줄 수 있다

        int answer = 0;
        List<Integer> duplication = new ArrayList<>();
        List<Integer> reserveList = Arrays.stream(reserve).boxed().collect(Collectors.toList());
        List<Integer> lostList = Arrays.stream(lost).boxed().collect(Collectors.toList());

        for (int r : reserve){
            for (int l : lost){
                if (r == l){
                    duplication.add(r);
                }
            }
        }

        reserveList.removeAll(duplication);
        lostList.removeAll(duplication);

        System.out.println("reserve : " + reserveList);
        System.out.println("lost : " + lostList);

        boolean[] reserveCheck = new boolean[reserveList.size()];
       int[] borrowCntArr = new int[lostList.size()];
       for (int r=0;r<reserveList.size();r++){
           for (int l=0;l<lostList.size();l++){
              if (!reserveCheck[r] && borrowCntArr[l] ==0){
                  if(lostList.get(l) == reserveList.get(r)-1 || lostList.get(l) == reserveList.get(r)+1){
                      borrowCntArr[l]++;
                      reserveCheck[r] = true;
                  }
              }

           }
       }

        System.out.println(Arrays.toString(borrowCntArr));
        System.out.println(Arrays.toString(reserveCheck));

       int borrowCnt = Arrays.stream(borrowCntArr).sum();

       answer = n - lostList.size() + borrowCnt;
        System.out.println(answer);


       return answer;
    }
}
