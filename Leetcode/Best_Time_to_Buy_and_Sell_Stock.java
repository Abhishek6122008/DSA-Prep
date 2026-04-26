package Leetcode;

class Best_Time_to_Buy_and_Sell_Stock {
    public int maxProfit(int[] prices) {
        int diff = 0;
        for(int i =0;i<prices.length;i++){
            for(int j = i+1;j<prices.length;j++){
                if(prices[j]-prices[i]>diff){
                    diff = prices[j]-prices[i];
                }
            }
        }return diff;
    }
}