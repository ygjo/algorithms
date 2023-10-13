package leetCode;
//Boyer-Moore majority vote 알고리즘
public class majorityElement {
    public static void main(String[] args) {
        int[] arr1 = {3,2,3};
        int[] arr2 = {2,2,1,1,1,2,2};
        int[] arr3 = {2,2,3,3};

        int answer = getMajorityElement(arr2);
        System.out.println(answer);
    }

    public static int getMajorityElement(int[] nums) {
        int majority = nums[0];
        int count = 1;

        for (int i = 1; i < nums.length; i++) {
            if (count == 0) {
                majority = nums[i];
                count = 1;
            } else if (nums[i] == majority) {
                count++;
            } else {
                count--;
            }
        }

        return majority;
    }
}
