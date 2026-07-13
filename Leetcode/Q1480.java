package Leetcode;

public class Q1480 {
    public static void main(String[] args) {
        int[] nums = {3,1,2,10,1};
        int n = nums.length;
        for (int i = 1; i <n; i++) {
            nums[i] += nums[i-1];
        }
    }
}
