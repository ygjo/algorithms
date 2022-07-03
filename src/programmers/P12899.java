package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//124나라의 숫자
public class P12899 {

    public static void main(String[] args) {
        solution(10);

    }

    public static String solution(int N) {
        String answer = "";
        int r = 1;
        int[] nArr = {1,2,4};
       

        while (N > Math.pow(3,r)){
            r+=1;
            permutation(nArr,r-1,0, new int[r-1]);
        }

        return answer;
    }

    public static void permutation(int[] arr, int r, int depth, int[] out){

        if(depth == r){
            System.out.println(Arrays.toString(out));
            return;
        }


        for(int i=0; i<arr.length; i++){
            out[depth] = arr[i];
            permutation(arr, r, depth+1, out);
        }

    }
}
