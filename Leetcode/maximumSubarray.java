package Leetcode;

public class maximumSubarray {
    public static void main(String[] args) {
        int nums[] = {-2,1,-3,4,-1,2,1,-5,4};
        int currentSum = nums[0];
        int maxSum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            if(currentSum > maxSum){
                maxSum = currentSum;
            }
        }
        System.out.println(maxSum);
    }
}