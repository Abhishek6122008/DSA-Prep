package Kumar_K.MainCourse.DP;
//N stones numbered 1 to n for each the height of the stone i is hi
//i +1 or i +2 cost is i-j where j is the standing place
public class Session7 {
    public static void main(String[] args) {
        int[] b = {10,500,20,80};
        int n = b.length;
        int k =3;
        int[] dp = new int[n];
        dp[0] = 0;
        dp[1] = Math.abs(b[1]-b[0]);
        dp[2] = Math.abs(b[2]-b[0]);
        for (int i = 3; i <n; i++) {
           int j=1;
           int answer = Integer.MAX_VALUE;
           while(j<=k){
              int option = dp[i-j] + Math.abs(b[i]-b[i-j]);
              answer = Math.min(answer,option);
              j = j+1;
           }
//           dp[i] = Math.min((Math.abs(b[i-1]-b[i])+dp[i-1]),(Math.abs(b[i-2]-b[i])+dp[i-2]));
        }
        System.out.println(dp[n-1]);
    }
}
