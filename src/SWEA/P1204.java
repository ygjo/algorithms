package SWEA;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;

//최빈수 구하기
public class P1204 {
    public static void main(String[] args) throws FileNotFoundException {

        System.setIn(new FileInputStream("/Users/joyungyeong/Downloads/input.txt"));
        Scanner sc = new Scanner(System.in);
        int caseCnt = sc.nextInt();

        for (int i = 0; i < caseCnt; i++) {
            int[] nums = new int[1000];
            int[] numCnt = new int[101];
            int caseNum = sc.nextInt();

            for (int j = 0; j < nums.length; j++) {
                nums[j] = sc.nextInt();
                numCnt[nums[j]]++;
            }

            int[] arrCopy = numCnt.clone();
            Arrays.sort(arrCopy);
            int maxCnt = arrCopy[arrCopy.length-1];

            List<Integer> credits = new ArrayList<>();

            for (int j = 0; j < numCnt.length; j++) {
                if (numCnt[j] == maxCnt){
                    credits.add(j);
                }
            }

            int maxCreditIndex = credits.size()-1;
            int maxCredit = credits.get(maxCreditIndex);
            System.out.printf("#%d %d\n", caseNum, maxCredit);
        }


    }
}
