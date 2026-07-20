package Kumar_K.MainCourse.TwoPointer;

import java.util.Arrays;

public class Session1 {
    static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int n = nums.length;
        int target =9;
        //bruteforce is use two for loops i and j and for each i we compare with j
        //another bruteforce is using hashmap we minus target with i
        //and check if the number is present in hashmap
        //for this question since the array is sorted we can use two pointers
        int left = 0;
        int right = n-1;
        while (left < right) {
            int sum = nums[right] + nums[left];
            if (sum == target) {
                System.out.println(left+" "+right);
                break;
            }
            if(sum<target){
                left++;
            }else{
                right--;
            }
        }
    }
}
