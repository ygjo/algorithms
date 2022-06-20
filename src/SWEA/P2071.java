package SWEA;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

//평균값
public class P2071 {
    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("/Users/joyungyeong/Downloads/input.txt"));

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 0; i< N; i++){
            int[] numbers = new int[10];
            int sum = 0;
            int numCnt = numbers.length;
            for (int j = 0; j < numCnt; j++){
                numbers[j] = sc.nextInt();
            }
            for (int num : numbers){
                sum +=num;
            }

            double result = sum/ (double) numCnt;
            //결과 값 반올림
            System.out.printf("#%d %d\n",i+1,Math.round(result));
        }

    }
}
