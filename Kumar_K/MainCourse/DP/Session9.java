package Kumar_K.MainCourse.DP;
//Make a maximum jump of size 2
public class Session9 {
    static void main(String[] args) {
        int[] a  = {-2,5,-3,6,-1};
        int n = a.length;
        int[] dp = new int[n];
        //u can make a jump of atleast k
        int k = 2;
        dp[0]=a[0];
        dp[1] = dp[0] + a[0] * a[1];
        for (int i = 2; i < n; i++) {
            dp[i] = Math.min(dp[i-1]+a[i-1]*a[i],dp[i-2]+a[i-2]*a[i]);
        }
        System.out.println(dp[n-1]);
    }
}
