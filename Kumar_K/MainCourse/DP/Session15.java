package Kumar_K.MainCourse.DP;
//The Robber Condition 1
//u are an art theif planning to rob a row of museum galleries
// each gallery contains a paidint worth x money
//u cant rob adjacent galleries
//maximise total gains

public class Session15 {
    static void main(String[] args) {
        int[] arr = {5,8,-10,11,12};
        //for condition one we can do 8 and 12 = 20
        int n = arr.length;
        int[] dp = new int[n];
        dp[0] = arr[0];
        dp[1] = Math.max(arr[0],arr[1]);
        
    }
}
