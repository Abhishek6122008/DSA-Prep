package Leetcode;

public class CapacityToShipPackages {
    public static void main(String[] args) {
        int[] weights = {1,2,3,4,5,6,7,8,9,10};
        int days = 5;
        int min = 1;
        int max = 0;
        int sum = 0;
        for(int weight:weights){
            sum+=weight;
            max = Math.max(max,sum);
        }
        while(min<=max){
            int mid = min+(max-min)/2;
            int day = 0;
            for(int num:weights){
                int diff = mid-num;
                if(diff==0){
                    day++;
                    diff = mid;
                }

            }
            if(days>day){
                max = mid-1;
                System.out.println(mid);
            }else{
                min = mid+1;
            }
        }
    }
}
