package Leetcode;
import java.util.*;
public class FirstandLastPos {
    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        int target = 8;
        int target2 = target+1;
        int n = nums.length;
        int start = 0;
        int end = n-1;
        int lowerbound1 = 0;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(nums[mid]>=target){
                lowerbound1 = mid;
                end = mid-1;
            } else if (nums[mid]<target) {
                start = mid+1;
            }
        }
        start = 0;
        end = n-1;
        int lowerbound2 = n;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(nums[mid] >= target + 1){
                lowerbound2 = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        int[] ans = {lowerbound1, lowerbound2 - 1};
        System.out.println(Arrays.toString(ans));

    }
}
