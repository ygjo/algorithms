package SWEA;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

//백만장자 프로젝트
public class P1859 {
    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("/Users/joyungyeong/Downloads/input.txt"));
        Scanner sc=new Scanner(System.in);

        int t=sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n=sc.nextInt();
            System.out.println(n);
            long diff=0;
            int max_value=0;
            int[] arr=new int[n];
            for (int j = 0; j < n; j++) {
                arr[j]=sc.nextInt();
            }
            for (int j = n-1; j >=0; j--) {
                if(arr[j] > max_value) max_value=arr[j];
                diff += max_value-arr[j];
            }
            System.out.printf("#%d %d\n",i+1,diff);
        }
        sc.close();
    }


}
