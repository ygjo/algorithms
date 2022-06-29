package SWEA;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

//서랍의 비밀번호
public class P2043 {
    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("/Users/joyungyeong/Downloads/input.txt"));
        Scanner sc = new Scanner(System.in);
        String[] testcase = sc.nextLine().split(" ");
        int answer = Integer.parseInt(testcase[0]) - Integer.parseInt(testcase[1]);
        System.out.println(Math.abs(answer) + 1);
    }
}
