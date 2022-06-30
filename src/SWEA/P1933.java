package SWEA;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

//간단한 N의 약수
public class P1933 {
    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("/Users/joyungyeong/Downloads/input.txt"));
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i =1;i<=n;i++){
            if (n%i == 0){
                System.out.printf("%d ",i);
            }
        }

    }
}
