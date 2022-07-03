package SWEA;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class P1984 {
    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("/Users/joyungyeong/Downloads/input.txt"));
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();

        for (int i=0; i<cnt;i++){
            int[] numbers = new int[10];
            int sum = 0;
            for (int j=0;j<numbers.length;j++){
              numbers[j] = sc.nextInt();
            }

            Arrays.sort(numbers);

            for (int k=1; k<=8;k++){
                sum+=numbers[k];
            }

            System.out.printf("#%d %d\n",i+1, Math.round(sum/8.0));

        }


    }
}
