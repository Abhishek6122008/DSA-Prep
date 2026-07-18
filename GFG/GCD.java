package GFG;

public class GCD {
    public static void main(String[] args) {
        int[] nums = {7,5,6,8,3};
        int a = Integer.MAX_VALUE;
        int b = 0;
        for (int i = 0; i <nums.length; i++) {
            a = Math.min(a,nums[i]);
            b = Math.max(b,nums[i]);
        }
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        System.out.println(a);
    }
}