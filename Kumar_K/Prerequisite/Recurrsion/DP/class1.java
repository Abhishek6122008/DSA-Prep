package Kumar_K.Prerequisite.Recurrsion.DP;

import java.util.Scanner;

public class class1 {
    public static void main(String[] args) {
        int[] arr = {2,3,2,2,1,1,2};
        int n = arr.length;
        //sum of all numbers from 1 to i
        //bruteforce O(Q*N)
//        int s = 0;
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        for (int i = 0; i <n; i++) {
//            for (int j = 0; j <= i; j++) {
//                s = s+arr[i];
//            }
//        }
//        System.out.println(s);
        //Optimised Dp O(N+Q)
        int[]dp = new int[n];
        for (int i = 0; i <n; i++) {
            if (i == 0) {
                dp[i] = arr[i];
            } else {
                dp[i] = arr[i] + dp[i - 1];
            }
        } // This took o(n) time
        int q = 4;
        int[] w = {0,3,4,2};
        int i = 0;
        while(i<= q-1){
            int query = w[i];
            System.out.println(dp[query]);
            i++;
        }
    }
}
