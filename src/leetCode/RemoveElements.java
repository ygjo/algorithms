package leetCode;


import java.util.Arrays;

/**
 * int[] nums = [...]; // Input array
 * int val = ...; // Value to remove
 * int[] expectedNums = [...]; // The expected answer with correct length.
 *                             // It is sorted with no values equaling val.
 *
 * int k = removeElement(nums, val); // Calls your implementation
 *
 * assert k == expectedNums.length;
 * sort(nums, 0, k); // Sort the first k elements of nums
 * for (int i = 0; i < actualLength; i++) {
 *     assert nums[i] == expectedNums[i];
 * }
 * */
public class RemoveElements {
    public static void main(String[] args) {
        int[] testNums1 = {3,2,2,3};
        int[] testNums2 = {0,1,2,2,3,0,4,2};
        int target1 = 3;
        int target2 = 2;


        int answer = removeElement(testNums2,target2);
        System.out.println(answer);
    }

    public static int removeElement(int[] nums, int val) {
        int count = 0;
        for (int i = 0;i< nums.length; i++){
            if(nums[i] == val){
                nums[i] = -1;
            }else{
                count++;
            }
        }
        Arrays.sort(nums);

        int numsSize = nums.length;
        for (int l =0; l <numsSize/2; l++){
            int temp = nums[l];
            nums[l] = nums[numsSize -1 -l];
            nums[numsSize -1 -l] = temp;
        }

        return count;
    }
}
