package SWEA;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;

//조교의 성적 매기기
public class P1983 {
    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("/Users/joyungyeong/Downloads/input.txt"));
        Scanner sc = new Scanner(System.in);
        int testCaseCount = sc.nextInt();
        String[] credit = {"A+","A0","A-","B+", "B0","B-","C+","C0","C-","D0"};

        for (int i = 0; i <testCaseCount; i++){
            int N = sc.nextInt();
            int K = sc.nextInt();
            int D = N/10;
            double[] total = new double[N];
            List<String> creditList = new ArrayList<>();
            Map<Integer,Double> map = new HashMap<>();
            for (String c : credit){
                for (int l=0;l<D;l++){
                    creditList.add(c);
                }
            }
            for (int j=0; j<N;j++){
                int midTerm = sc.nextInt();
                int finalTerm = sc.nextInt();
                int assignment = sc.nextInt();
                total[j] = midTerm*0.35 + finalTerm *0.45 + assignment * 0.20;
                map.put(j+1,total[j]);
            }

            List<Double> list = new ArrayList<>(map.values());
            list.sort(Comparator.reverseOrder());
            String studentCredit = creditList.get(list.indexOf(map.get(K)));

            System.out.printf("#%d %s\n", i+1,studentCredit);

        }
    }
}
