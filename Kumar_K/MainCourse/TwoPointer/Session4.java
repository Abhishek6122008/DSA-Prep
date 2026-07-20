package Kumar_K.MainCourse.TwoPointer;
import java.util.*;
public class Session4 {
    static void main(String[] args) {
        int[] nums = {-4,-1,0,3,10};
        int n = nums.length;
        for (int i = 0; i <n; i++) {
            nums[i] = (int) Math.pow(nums[i],2);
        }
        Arrays.sort(nums);
    }
}
