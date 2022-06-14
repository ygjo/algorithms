package BOJ;

import java.util.Scanner;

public class recursion1 {
    public static int factorial(int num){
        if (num <2){
            return num;
        }
        return num * factorial(num-1);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();



    }


}
