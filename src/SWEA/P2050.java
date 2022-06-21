package SWEA;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

//문자 숫자로 변환
public class P2050 {
    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("/Users/joyungyeong/Downloads/input.txt"));
        Scanner sc = new Scanner(System.in);
        char[] testCase = sc.nextLine().toCharArray();

        for (char character : testCase){
            System.out.print((int)character - 64 + " ");
        }


    }
}
