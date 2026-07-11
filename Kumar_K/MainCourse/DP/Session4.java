package Kumar_K.MainCourse.DP;

public class Session4 {
    public static void main(String[] args) {
        int[] a = {2,3,4,-8,2};
        int[] b = {-5,8,3,1,4};
        int n = a.length;
        int[] dp = new int[n];
        dp[0] = Math.max(Math.max(a[0], b[0]), 0);
        dp[1] = Math.max(
                dp[0],
                Math.max(a[1], b[1])
        );
        for (int i = 2; i < n; i++) {
            int best = Math.max(a[i], b[i]);
            dp[i] = Math.max(dp[i - 1], best + dp[i - 2]);
        }
        System.out.println(dp[n - 1]);
    }
}