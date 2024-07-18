package infleran;

import java.util.LinkedHashSet;
import java.util.Scanner;

/**
 * 설명
 *
 * 소문자로 된 한개의 문자열이 입력되면 중복된 문자를 제거하고 출력하는 프로그램을 작성하세요.
 *
 * 중복이 제거된 문자열의 각 문자는 원래 문자열의 순서를 유지합니다.
 * 입력
 * 첫 줄에 문자열이 입력됩니다. 문자열의 길이는 100을 넘지 않는다.
 *
 * ksekkset
 *
 */
public class RemoveDuplicateCharacters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        char[] chars = s.toCharArray();
        LinkedHashSet<Character> set = new LinkedHashSet<>();
        for(char c : chars) {
            set.add(c);
        }
        StringBuilder sb = new StringBuilder();
        for(char c : set) {
            sb.append(c);
        }
        System.out.print(sb);

    }
}
