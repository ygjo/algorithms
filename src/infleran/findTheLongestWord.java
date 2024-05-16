package infleran;

import java.util.Scanner;

//https://cote.inflearn.com/contest/10/problem/01-03
public class findTheLongestWord {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String sentence = in.nextLine();
        String[] words = sentence.split(" ");
        int targetIndex = 0;
        for(int i=1;i<words.length;i++){
            if (words[i].length() > words[i-1].length()){
                targetIndex = i;
            }
        }
        System.out.println(words[targetIndex]);

    }
}
