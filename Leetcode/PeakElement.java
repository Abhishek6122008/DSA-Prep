package Leetcode;

public class PeakElement {
    public static void main(String[] args) {
        int[] nums = {1,2,1,3,5,6,4};
        int n = nums.length;
        int left = 0;
        int right = n - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (mid == 0) {
                if (n == 1 || nums[0] > nums[1]) {
                    System.out.println(nums[0]);
                    break;
                }
                left = mid + 1;
            }
            else if (mid == n - 1) {
                if (nums[n - 1] > nums[n - 2]) {
                    System.out.println(nums[n - 1]);
                    break;
                }
                right = mid - 1;
            }
            else if (nums[mid] > nums[mid - 1] &&
                    nums[mid] > nums[mid + 1]) {
                System.out.println(nums[mid]);
                break;
            }
            else if (nums[mid] < nums[mid - 1]) {
                right = mid - 1;
            }
            else {
                left = mid + 1;
            }
        }
    }
}