package Kumar_K.MainCourse.DP;
//continuation to Session 11
//if the number is even u can divide it by 2
//if the number is off u can do +1 or -1
// for +1 the formula becomes dp[i+1]+x which is the future state
import java.util.Arrays;
public class Session14 {
    static void main(String[] args) {
        int n = 150;
        int[] dp = new int[n+1];
        Arrays.fill(dp,0);
        int i = 2;
        int x = 1;
        int y = 1;
        int z = 1;
        while(i<=n){
            int v1 = dp[i-1]+y;
            int v2 = Integer.MAX_VALUE;
            int v3 = Integer.MAX_VALUE;
            if(i%2==0){
                v2 = dp[i/2]+x;
            }else{
                v3 = Math.min(dp[i-1]+z,dp[(i+1)/2]+x+z);
            }
            //if i is odd i+1 is even so dp i+ 1 is dp 1+ dp i + 1/2
            dp[i]=Math.min(v1,Math.min(v2,v3));
            i++;
        }
        System.out.println(dp[n]);
    }
}
