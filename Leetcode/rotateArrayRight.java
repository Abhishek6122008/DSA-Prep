package Leetcode;

import java.util.Arrays;

public class rotateArrayRight {
    public static void main(String[] args) {
        int nums[] = {1,2,3,4,5,6,7};
        int[] arr = new int[1];
        int k = 3;
        int n = nums.length;

        for (int i = 0; i < k; i++) {

            arr[0] = nums[n-1];

            for(int j = n-1; j > 0; j--){
                nums[j] = nums[j-1];
            }

            nums[0] = arr[0];
        }

        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}