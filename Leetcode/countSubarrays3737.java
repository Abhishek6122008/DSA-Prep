package Leetcode;

public class countSubarrays3737 {
    public static void main(String[] args) {
        int[] nums = {1,2,2,3};
        int target = 2;
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            int countTarget = 0;
            for (int j = i; j < nums.length; j++) {
                if (nums[j] == target) {
                    countTarget++;
                }
                int len = j - i + 1;
                if (countTarget > len / 2) {
                    ans++;
                }
            }
        }
        System.out.println(ans);
    }
}