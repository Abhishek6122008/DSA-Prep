package Leetcode;

public class SmallestDivisorgivenThreshold {
    public static void main(String[] args) {
        int[] nums = {1, 2, 5, 9};
        int threshold = 6;
        int min = 1;
        int max = nums[0];
        for (int num : nums) {
            max = Math.max(max, num);
        }
        int ans = -1;
        while (min <= max) {
            int mid = min + (max - min) / 2;
            int sum = 0;
            for (int num : nums) {
                sum += (num + mid - 1) / mid;
            }
            if (sum > threshold) {
                min = mid + 1;
            } else {
                ans = mid;
                max = mid - 1;
            }
        }
        System.out.println(ans);
    }
}