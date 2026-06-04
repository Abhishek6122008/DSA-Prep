package Leetcode;

public class SingleElement {
    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 3, 3, 4, 4, 8, 8};
        int n = nums.length;
        int left = 0;
        int right = n-1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            System.out.println(nums[mid]);
            if (mid % 2 == 0) {
                if (mid != n - 1 && nums[mid] == nums[mid + 1]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            } else {
                if (mid != 0 && nums[mid] == nums[mid - 1]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }

            }
        }
    }
}