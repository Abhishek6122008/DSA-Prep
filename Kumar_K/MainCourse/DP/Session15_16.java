package Kumar_K.MainCourse.DP;
//The Robber Condition 1
//u are an art theif planning to rob a row of museum galleries
// each gallery contains a paidint worth x money
//u cant rob adjacent galleries
//maximise total gains

//Condition 2
//we can only select till k which is n/2
// for this we make dp i j where max sum is exactly k elements are selected

//Condition 3
//lets try to solve using 2 states
//int p is the penalty
//a(i)-p+dp(i-1)(j) is wrong as dp(i-1) does not guarantee weather the i-1 th element is selected or not
//we corect it a(i) + a(i-1)-p+dp(i-2)

public class Session15_16 {
    static void main(String[] args) {
/*
        int[] arr = {-2,-10,3,-5,8};
        //for condition one we can do 8 and 12 = 20
        int n = arr.length;
        int[] dp = new int[n];
        dp[0] = arr[0];
        dp[1] = Math.max(arr[0],arr[1]);
        for (int i = 2; i < n; i++) {
            dp[i] = Math.max(arr[i]+dp[i-2],dp[i-1]);
        }
        System.out.println(dp[n-1]);
*/
        int[] a = {-2,-10,3,-5,8};
        int n = a.length;
        int k = 2;
        int P = 1;
        int[][] dp = new int[n][k+1];
        int NEG = Integer.MIN_VALUE/2;
        for(int i=0;i<n;i++){
            for(int j=0;j<=k;j++){
                dp[i][j] = NEG;
            }
        }
        dp[0][0] = 0;
        dp[0][1] = a[0];
        dp[1][0] = 0;
        dp[1][1] = Math.max(a[0],a[1]);
        for(int i=2;i<n;i++){
            dp[i][0] = 0;
            dp[i][1] = Math.max(dp[i-1][1],a[i]);
            for(int j=2;j<=k;j++){
                dp[i][j] = Math.max(
                        dp[i-1][j],
                        Math.max(a[i] + dp[i-2][j-1],a[i]+a[i-1]-P+dp[i-2][j-2])
                );
            }
        }
        System.out.println(dp[n-1][k]);
    }
}
