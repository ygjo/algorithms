package SWEA;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

//몫과 나머지 출력하기
public class P2029 {
    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("/Users/joyungyeong/Downloads/input.txt"));

        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        for (int i=0;i<cnt;i++){
           int[] numbers = new int[2];
           for (int j=0;j<numbers.length;j++){
               numbers[j] = sc.nextInt();
           }

            System.out.printf("#%d %d %d\n",i+1,numbers[0]/numbers[1],numbers[0]%numbers[1]);

        }

    }
}
