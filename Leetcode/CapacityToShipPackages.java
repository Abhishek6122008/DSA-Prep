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

        }
    }
}
