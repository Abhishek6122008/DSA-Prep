package Leetcode;

public class moveZeros {
    public static void main(String[] args) {

        int nums[] = {0,1,0,3,12};
        int n = nums.length;

        for (int i = 0; i < n; i++) {

            if(nums[i] == 0) {

                for (int j = i; j < n - 1; j++) {
                    nums[j] = nums[j + 1];
                }

                nums[n - 1] = 0;

                i--;
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}