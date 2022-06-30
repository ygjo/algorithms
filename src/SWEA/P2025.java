package SWEA;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

//N줄 덧셈
public class P2025 {
    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("/Users/joyungyeong/Downloads/input.txt"));
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = n*(n+1)/2;

        System.out.println(sum);

    }
}
