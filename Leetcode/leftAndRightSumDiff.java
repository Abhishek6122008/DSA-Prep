package Leetcode;

public class leftAndRightSumDiff {
    public static void main(String[] args) {
        int[] nums = {10,4,8,3};
        int n = nums.length;
        int leftsum[] = new int[n];
        int rightsum[] = new int[n];
        leftsum[0] = 0;
        rightsum[n-1] = 0;
        for (int i = 1; i <n; i++) {
            for (int j = 0; j <i; j++) {
                leftsum[i]+=nums[j];
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                rightsum[i] += nums[j];
            }
        }
        int ans[] = new int[n];
        for (int i = 0; i <n; i++) {
            ans[i] = Math.abs(leftsum[i] - rightsum[i]);
        }
        for (int i = 0; i <n; i++) {
            System.out.println(ans[i]);
        }
    }
}
