package basic;

//https://ko.khanacademy.org/computing/computer-science/algorithms/sorting-algorithms/pc/challenge-find-minimum-in-subarray
public class indexOfMinimum {
    public static int findIndexOfMinimum(int[] targetArray, int startIdx){
        int minIdx = startIdx;
        int minVal = targetArray[startIdx];
        for (int i= startIdx + 1; i <targetArray.length ; i++){
            if (targetArray[i] < minVal){
                minIdx = i;
                minVal = targetArray[i];
            }
        }
        return minIdx;
    }

    public static void main(String[] args) {
        int[] targetArray = {18, 6, 66, 44, 9, 22, 14};
        int startIdx = findIndexOfMinimum(targetArray, 2);
        System.out.println(startIdx);
    }
}
