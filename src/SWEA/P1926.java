package SWEA;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

//간단한 369게임

public class P1926 {
    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("/Users/joyungyeong/Downloads/input.txt"));
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int i = 1; i<=N; ++i){
           String str = String.valueOf(i);
           if (str.contains("3") || str.contains("6")||str.contains("9")){
               for (int j=0; j<str.length();j++){
                   if (str.charAt(j) == '3' || str.charAt(j) == '6' || str.charAt(j) == '9') {
                       System.out.print("-");
                   }
               }
               System.out.print(" ");
           }else{
               System.out.printf("%d " ,i);
           }
        }

    }
}
