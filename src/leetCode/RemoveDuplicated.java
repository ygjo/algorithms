package leetCode;

import java.util.Arrays;

public class RemoveDuplicated {
    public static void main(String[] args) {

        int[] numbers1 = {1,1,2};
        int[] numbers2 = {0,0,1,1,1,2,2,3,3,4};
        int[] numbers3 = {1};
        int[] numbers4 = {1,1,1};

        int answer = removeDuplicates2(numbers2);
        System.out.println(answer);
    }

    public static int removeDuplicates(int[] nums) {
        int numsLength = nums.length;
        int duplicateCnt = 0;
        int uniqueCnt = 0;
        int changedNumber = nums[numsLength-1] + 1;
        for(int i=0; i<numsLength;i++){
            for (int j=0; j<i; j++){
                if (nums[i] == nums[j]){
                    nums[i] = changedNumber;
                    duplicateCnt++;
                }
            }
        }

        Arrays.sort(nums);

        if (duplicateCnt > 0){
            for (int n:nums){
                if (n != nums[numsLength-1]){
                    uniqueCnt++;
                }
            }
        }else{
            uniqueCnt = numsLength;
        }

        return uniqueCnt;
    }


    public static int removeDuplicates2(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int k = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }

}
