package basic.selectionSort;

import java.util.Arrays;

public class swap {
    public static int[] swappingArray(int[] targetArray, int firstIdx, int lastIdx){
        int temp = targetArray[firstIdx];
        targetArray[firstIdx] = targetArray[lastIdx];
        targetArray[lastIdx] = temp;
        return targetArray;
    }
    public static void main(String[] args) {
        int[] target = {7,9,4};
        int[] swappedArray = swappingArray(target,0,1);
        System.out.println(Arrays.toString(swappedArray));
    }
}
