package SWEA;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

//중간 값 찾기
public class P2063 {
    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("/Users/joyungyeong/Downloads/input.txt"));
        Scanner sc = new Scanner(System.in);
        int caseCnt = sc.nextInt();
        int[] numbers = new int[caseCnt];
        for (int i=0; i<caseCnt;i++){
            numbers[i] = sc.nextInt();
        }
        Arrays.sort(numbers);
        System.out.println(numbers[caseCnt/2]);
    }
}
