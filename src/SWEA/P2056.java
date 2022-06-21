package SWEA;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

//연,월,일 달력
public class P2056 {
    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("/Users/joyungyeong/Downloads/input.txt"));
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        int[] endDayOfMonth = {31,28,31,30,31,30,31,31,30,31,30,31};

        for (int i=0;i<=testCases;i++){
            String date = sc.nextLine();
            if (date.isEmpty()) continue;
            String Y = date.substring(0,4);
            String m = date.substring(4,6);
            String d = date.substring(6,8);
            int month = Integer.parseInt(m);
            int day = Integer.parseInt(d);

            if (month>=1 && month <=12 && day>=1 && day <= endDayOfMonth[month-1]){
                System.out.printf("#%d %s\n", i,Y+"/"+m+"/"+d);
            }else{
                System.out.printf("#%d %s\n", i,"-1");
            }
        }

    }
}
