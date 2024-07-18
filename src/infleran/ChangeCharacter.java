package infleran;

import java.util.Scanner;

//https://cote.inflearn.com/contest/10/problem/01-02
public class ChangeCharacter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String target = input.next();
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < target.length(); i++) {
            char ch;
            if (target.charAt(i) >=65 && target.charAt(i) <=90){
                 ch = (char) (target.charAt(i) + 32);
            }else{
                ch = (char) (target.charAt(i) - 32);
            }
            answer.append(ch);
        }
        System.out.println(answer);
    }
}
