package SWEA;

import java.util.Scanner;

// level 1 : 홀수 더하기
public class P2072 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int order = 0;
        while(count > 0){
            String line = sc.nextLine();
            if(line.isEmpty()){
                continue;
            }
            String[] numberList = line.split(" ");
            int sum = 0;
            for (String num : numberList){
                int number = Integer.parseInt(num);
                if(number % 2 != 0){
                    sum += number;
                }
            }
            order++;
            count--;
            System.out.println("#"+order+" "+sum);

        }

    }
}
