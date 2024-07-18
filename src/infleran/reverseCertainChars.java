package infleran;

import java.util.Scanner;

/**
 * 설명
 *
 * 영어 알파벳과 특수문자로 구성된 문자열이 주어지면 영어 알파벳만 뒤집고,
 *
 * 특수문자는 자기 자리에 그대로 있는 문자열을 만들어 출력하는 프로그램을 작성하세요.
 * 입력
 * 첫 줄에 길이가 100을 넘지 않는 문자열이 주어집니다.
 * 출력
 * 첫 줄에 알파벳만 뒤집힌 문자열을 출력합니다.
 *
 * a#b!GE*T@S
 */
public class reverseCertainChars {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        char[] sa = s.toCharArray();
        int sl = s.length() -1; // 문자열 마지막 인덱스
        int sf = 0; // 문자열 첫 인덱스

        while (sf < sl){
            if (!Character.isAlphabetic(sa[sf])){
                sf++;
            }else if(!Character.isAlphabetic(sa[sl])){
                sl--;
            }else{
                char temp = sa[sf];
                sa[sf] = sa[sl];
                sa[sl] = temp;
                sf++;
                sl--;
            }
        }

        StringBuilder answer = new StringBuilder();
        for (char c : sa) {
            answer.append(c);
        }

        System.out.print(answer);

    }
}
