package LeetCode_Contest_Upsolve.LC_Weekly_509;

public class sumOfIntegerswithMaxDigitRange {
    public static void main(String[] args) {
        int[] nums = {5724,111,350};
        int n = nums.length;
        int sum = 0;
        for (int i = 0; i <n; i++) {
            int largest = 0;
            int smallest = Integer.MAX_VALUE;
            int DigitR = 0;
            while(nums[i]>0){
                int temp = nums[i]%10;
                nums[i] = nums[i]/10;
                if(temp>largest){
                    largest=temp;
                } else if (temp<smallest) {
                    smallest = temp;
                }int diff  = largest-smallest;
                if(diff>=DigitR){
                    DigitR = diff;
                    sum += nums[i];
                }
            }
            System.out.println(sum);
        }
    }
}
