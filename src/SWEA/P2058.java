package SWEA;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

//자릿 수 더하기
public class P2058 {
    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("/Users/joyungyeong/Downloads/input.txt"));
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();
        String[] numArr = Integer.toString(testCase).split("");
        int sum = 0;

        for (String num : numArr){
            int number = Integer.parseInt(num);
            sum+=number;
        }

        System.out.println(sum);

    }
}
