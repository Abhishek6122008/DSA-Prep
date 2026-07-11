package Kumar_K.MainCourse.DP;
//U have an array 1 to n
//u can jump i+1 or i+3
//the cost is the absolute difference
//get to n in minimum possible cost
public class Session5 {
    public static void main(String[] args) {
        int[] a = {4,12,13,18,10,12};
        int n = a.length;
        int[] dp = new int[n];
        dp[0] = 0;
        dp[1] = Math.abs(a[1] - a[0]);
        dp[2] = dp[1] + Math.abs(a[2] - a[1]);
        for (int i = 3; i < n; i++) {
            dp[i] = Math.min(
                    Math.abs(a[i] - a[i - 1]) + dp[i - 1],
                    Math.abs(a[i] - a[i - 3]) + dp[i - 3]
            );
        }
        System.out.println(dp[n - 1]);
    }
}
