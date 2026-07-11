package Kumar_K.MainCourse.DP;
//Question chose subset containing max sum but no adjasent emenet should have the subset
public class Session3 {
    public static void main(String[] args) {
        int[] arr = {-2,-3,-5,-8,-7};
        int n = arr.length;
        int[] dp = new int[n];
        dp[0]=Math.max(arr[0],0);
        dp[1]=Math.max(arr[1],dp[0]);

        for (int i = 2; i <n; i++) {
           dp[i] = Math.max(dp[i-1],arr[i]+dp[i-2]);
        }
        for (int i = 0; i <n; i++) {
            System.out.println(dp[i]);
        }
    }
}
