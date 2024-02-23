package leetCode;

import java.util.Arrays;

public class rotate {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        int[] nums2 = {-1,-100,3,99};
        rotateArrayNums(nums2,2);

        System.out.println(Arrays.toString(nums2));
    }

    public static void rotateArrayNums(int[] nums, int k) {
        if (nums.length <= 1 || k == 0) {
            return;
        }

        int length = nums.length;

        // Handle the case when k is larger than the array size
        k = k % length;

        // Reverse the entire array
        reverse(nums, 0, length - 1);

        // Reverse the first k elements
        reverse(nums, 0, k - 1);

        // Reverse the remaining elements
        reverse(nums, k, length - 1);
    }

    private static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
