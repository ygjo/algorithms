package SWEA;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

//간단한 계산기
public class P1938 {
    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("/Users/joyungyeong/Downloads/input.txt"));
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        System.out.println(n1+n2);
        System.out.println(n1-n2);
        System.out.println(n1*n2);
        System.out.println(Math.floorDiv(n1,n2));
    }
}
