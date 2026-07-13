package Kumar_K.MainCourse.Hashing;
//you are given an array of size n in over operation
//u can change any ai to x
//u can only do this only 1 time in one index
//also x should lie between -k +k
//pickup largest set of equal numbers
public class Class24_Q2 {
    static void main(String[] args) {
        int[] nums = {5,8,10};
        int k = 3;
        int n = nums.length;
        int[] arr = new int[nums[n - 1] + k + 2];
        for (int i = 0; i < n; i++) {
            int l = Math.max(0, nums[i] - k);
            int r = nums[i] + k;
            arr[l]++;
            arr[r + 1]--;
        }
        int ans = arr[0];
        for (int i = 1; i < arr.length; i++) {
            arr[i] += arr[i - 1];
            ans = Math.max(ans, arr[i]);
        }
        System.out.println(ans);
    }
}
