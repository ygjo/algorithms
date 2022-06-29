package SWEA;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

//스탬프 찍기
public class P2046 {
    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("/Users/joyungyeong/Downloads/input.txt"));
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        String stamp = "#";
        String answer = "";
        for (int i=0; i<cnt;i++){
            answer = answer.concat(stamp);
        }
        System.out.println(answer);
    }
}
