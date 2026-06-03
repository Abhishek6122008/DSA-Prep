package Leetcode;

public class minimumInSorted {
    public static void main(String[] args) {
        int[] nums = {4,5,6,7,1,2};
        int n = nums.length;
        int left = 0;
        int right = n-1;
        int minimum = Integer.MAX_VALUE;
        while(left<=right){
            int mid = left+(right-left)/2;
            if(nums[left]<nums[right]){
                if(nums[left]<nums[mid]){
                    minimum = Math.min(minimum,nums[left]);
                }else{
                    minimum = Math.min(minimum,nums[mid]);
                }
            }else{
                if(nums[right]<nums[mid]){
                    minimum = Math.min(minimum,nums[right]);
                }else{
                    minimum = Math.min(minimum,nums[mid]);
                }
            }
            int direction = Math.min(nums[left],nums[right]);
            if(direction==nums[left]){
                right = mid-1;
            }else{
                left = mid+1;
            }
        }
        System.out.println(minimum);
    }
}
