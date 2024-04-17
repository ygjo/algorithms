package basic;

import java.util.Arrays;

//선택정렬 구현 하위정렬 및 삽입 연습
public class insertionSort {
    public static void sort(int[] targetArray, int rightIdx, int value){
        int i = rightIdx;
        while (i >= 0 && targetArray[i] > value) {
            targetArray[i + 1] = targetArray[i];
            i--;
        }
        targetArray[i + 1] = value;
    }

    public static void main(String[] args) {
        int[] targetArray = {3, 5, 7, 11, 13, 2, 9, 6};
        sort(targetArray,4,2);
        System.out.println(Arrays.toString(targetArray)); // 첫번째 하위 정렬
        sort(targetArray,5,9);
        System.out.println(Arrays.toString(targetArray)); // 두번째 하위 정렬
        sort(targetArray,6,6);
        System.out.println(Arrays.toString(targetArray)); // 마지막 하위정렬

    }
}
