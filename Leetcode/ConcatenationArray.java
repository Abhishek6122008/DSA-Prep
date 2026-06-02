package Leetcode;

public class ConcatenationArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        int n = nums.length;
        int x = 2*n;
        int ans[] = new int[x];
        for (int i = 0; i <n; i++) {
            ans[i]=nums[i];
            ans[n+i] = nums[i];
        }
        for (int i = 0; i <x; i++) {
            System.out.print(ans[i]);
        }

    }
}
