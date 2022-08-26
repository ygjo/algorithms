package SWEA;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

//초심자의 회문 검사
public class P1989 {
    public static void main(String[] args)throws FileNotFoundException {
        System.setIn(new FileInputStream("/Users/joyungyeong/Downloads/input.txt"));
        Scanner sc = new Scanner(System.in);

        int caseCnt = sc.nextInt();

        for (int i = 0; i <= caseCnt; i++) {
            String word = sc.nextLine();
            if (word.isEmpty()) continue;

            String[] chars = word.split("");
            int mid = chars.length/2;
            int answer;
            String[] leftChars;
            String[] rightChars;

            if (chars.length % 2 == 0){
                leftChars = Arrays.copyOfRange(chars,0,mid);
                rightChars = Arrays.copyOfRange(chars,mid,chars.length);
            }else{
                leftChars = Arrays.copyOfRange(chars,0,mid);
                rightChars = Arrays.copyOfRange(chars,mid+1,chars.length);
            }

            Arrays.sort(leftChars);
            Arrays.sort(rightChars);
            answer = (Arrays.equals(leftChars,rightChars)) ? 1 : 0;
            System.out.printf("#%d %s\n", i,answer);

        }


    }
}
