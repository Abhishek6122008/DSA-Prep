package Leetcode;

import java.util.Arrays;

public class MinimumCostOfBuying {
    public static void main(String[] args) {
        int[] cost = {6,5,7,9,2,2};
        Arrays.sort(cost);
        int n = cost.length;
        int ans = 0;
        int count = 0;
        for(int i = n-1;i>=0;i--){
            count++;
            if(count==3){
                count=0;
                continue;
            }
            ans += cost[i];
        }
        System.out.println(ans);
    }
}
