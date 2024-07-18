package infleran;

import java.util.Scanner;

public class ReverseWords {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            String s = in.next();
            int j = s.length()-1;
            for (int k = j; k >=0; k--) {
                System.out.print(s.charAt(k));
            }
            System.out.println();
        }
    }
}
