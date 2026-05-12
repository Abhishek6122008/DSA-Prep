package Leetcode;
import java.util.*;
public class buySellStock {
    public static void main(String[] args) {
        int prices[] = {7,1,5,3,6,4};
        int buy = prices[0];
        int sell = 0;
        int profit=0;
        int n = prices.length;
        for(int i = 1; i <n; i++) {
            sell = prices[i];
            if(buy>sell){
                buy = prices[i];
            } else{
                sell = Math.max(prices[i],prices[i-1] );
            }
            profit = Math.max(profit, sell - buy);
        }
        System.out.println(profit);
    }
}
