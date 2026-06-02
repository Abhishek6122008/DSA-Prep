package Leetcode;

public class searchInsertPosition {
    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        int target = 7;
        int n = nums.length;
        int start = 0;
        int end = n-1;
        int ans = 0;
        if(target>nums[end]){
            System.out.println(n);
        }
        if(target<nums[start]){
            System.out.println(0);
        }
        while(start<=end){
            int mid = start+(end-start)/2;
            if(nums[mid]>=target){
                ans = mid;
                end = mid-1;
            } else if (nums[mid]<target) {
                start = mid+1;
            }
        }
        System.out.println(ans);
    }
}
