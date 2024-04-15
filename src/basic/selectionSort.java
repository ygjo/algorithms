package basic;

import java.util.Arrays;

//선택 정렬
public class selectionSort {
    public static int[] sort(int[] targetArray){
        int minimumIdx;
        for (int i = 0; i < targetArray.length; i++){
            minimumIdx = findIdxOfMinimum(targetArray,i);
            swapping(targetArray,i,minimumIdx);
        }
        return targetArray;
    }

    private static int findIdxOfMinimum(int[] targetArray, int startIdx){
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

    private static void swapping(int[] targetArray, int firstIdx, int lastIdx){
        int temp = targetArray[firstIdx];
        targetArray[firstIdx] = targetArray[lastIdx];
        targetArray[lastIdx] = temp;
    }

    public static void main(String[] args) {
        int[] targetArray = {22, 11, 99, 88, 9, 7, 42};
        int[] sortedArray = sort(targetArray);
        System.out.println(Arrays.toString(sortedArray));
    }
}
