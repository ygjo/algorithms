package SWEA;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

//최대수 구하기
public class P2068 {
    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("/Users/joyungyeong/Downloads/input.txt"));
        Scanner sc = new Scanner(System.in);
        int caseCnt = sc.nextInt();

        for (int i=0; i<caseCnt; i++){
            int[] numbers = new int[10];
            for (int j=0;j<numbers.length;j++){
                numbers[j] = sc.nextInt();
            }

            Arrays.sort(numbers);
            System.out.printf("#%d %d\n",i+1,numbers[numbers.length-1]);
        }
    }
}
