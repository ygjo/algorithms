package infleran;

import java.util.Scanner;

//https://cote.inflearn.com/contest/10/problem/01-01
public class findString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input1 = in.next().toLowerCase();
        String input2 = in.next().toLowerCase();

        int cnt =0;
        for (int i = 0; i < input1.length(); i++) {
            if(input1.charAt(i) == input2.charAt(0)){
                cnt++;
            }
        }
        System.out.println(cnt);

    }
}
