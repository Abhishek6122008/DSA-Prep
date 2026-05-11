package Leetcode;

public class sortColors {
    public static void main(String[] args) {
        int nums[] = {2,0,2,1,1,0};
        int n = nums.length;
        int x = 0;
        int y = 0;
        int temp = -0;
        for (int i = 0; i <n; i++) {
            if(nums[i]==0){
                x++;
            } else if (nums[i]==1) {
                y++;
            }
        }
        y=y+x;
        for (int i = 0; i <x ; i++) {
            nums[i] = 0;
        }
        for (int i = x; i <y ; i++) {
            nums[i] = 1;
        }
        for (int i = y; i <n ; i++) {
            nums[i] = 2;
        }
        for (int i = 0; i <n; i++) {
            System.out.println(nums[i]);
        }
    }
}
