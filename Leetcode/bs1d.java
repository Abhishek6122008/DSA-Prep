package Leetcode;

public class bs1d {
    public static void main(String[] args) {
        int nums[] = {-1,0,3,5,9,12};
        int n = nums.length;
        int target = 9;
        int low = 0;
        int high = n - 1;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(nums[mid] > target){
                high = mid - 1;
            }
            else if(nums[mid] < target){
                low = mid + 1;
            }
            else{
                System.out.println(mid);
                break;
            }
        }
    }
}