package Leetcode;

public class sortedArray2 {
    public static void main(String[] args) {
        int nums[] = {3,4,5,1,2};
        int n = nums.length;
        boolean sort = true;
        int brake = 0; //cant use break
        for (int i = 0; i < n; i++) {
            if(nums[i] > nums[(i+1)%n]){
                brake++;
            }
        }

        if(brake <= 1){
            sort = true;
        }else{
            sort = false;
        }
        System.out.println(sort);
    }
}
