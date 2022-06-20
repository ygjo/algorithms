package SWEA;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

//큰 놈, 작은 놈, 같은 놈
public class P2070 {
    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("/Users/joyungyeong/Downloads/input.txt"));
        Scanner sc = new Scanner(System.in);
        int caseCnt = sc.nextInt();

        for (int i = 0; i< caseCnt; i++){
            int[] compareNums = new int[2];
            for (int j = 0; j < compareNums.length;j++){
                compareNums[j] = sc.nextInt();
            }
            String answer = "";

            if (compareNums[0] < compareNums [1]) answer = "<";
            if (compareNums[0] == compareNums [1]) answer = "=";
            if (compareNums[0] > compareNums [1]) answer = ">";

            System.out.printf("#%d %s\n",i+1,answer);

        }

    }
}
