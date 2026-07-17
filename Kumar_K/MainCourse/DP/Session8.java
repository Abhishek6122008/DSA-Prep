package Kumar_K.MainCourse.DP;
//u are given an array of size N you have to start your journey at index 1
//need to end your journey at index n
//u can make jumps of size 1,3,5
//in the array possitive as well as negative numbers can be available
//find max sum of the journey
public class Session8 {
    public static void main(String[] args) {
        int[] a = {1,-3,-8,-5,-10,100,-5,8};
        int n = a.length;
        int[] dp = new int[n];
        //dp1 max sum starting at 1 and ending at 1
        dp[0] = a[0];
        dp[1] = dp[0] + a[1];
        dp[2] = dp[1] + a[2];
        dp[3] = Math.max(dp[2], dp[0]) + a[3];
        dp[4] = Math.max(dp[3], dp[1]) + a[4];
        for(int i=5;i<n;i++){
            dp[i] = Math.max(dp[i-1],
                    Math.max(dp[i-3], dp[i-5])) + a[i];
        }
        System.out.println(dp[n-1]);
    }
}
