package programmers;

//https://programmers.co.kr/learn/courses/30/lessons/70128
public class P70128 {
    public static void main(String[] args) {
        int[] arrA = {-1,0,1};
        int[] arrB = {1,0,-1};

        solution(arrA,arrB);
    }
    public static int solution(int[] a, int[] b) {
        int answer = 0;
        int arrLength = a.length;

        if (arrLength <= 1000){
            for (int i =0; i< arrLength;i++){

                if(a[i] < -1000 || a[i] > 1000 || b[i] < -1000 || b[i] > 1000){
                    break;
                }
                answer += a[i]*b[i];
            }
        }

        return answer;
    }
}
