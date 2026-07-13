package Kumar_K.MainCourse.BitManipulation;
// given array of size n all possitive numbers in it
// can u select greater or equal to two element
// such that their bitwise or has trailing zeros
// if even last digit is 0 else 1
//we need atleast both 0 meaning even
public class Session2 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        int n = nums.length;
        int count = 0;
        for (int i = 0; i <n; i++) {
            if(nums[i]%2==0){
                count++;
            }
        }if(count==0){
            System.out.println("false");
        }
        else if(count>0){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}
