package Leetcode;

public class GCD_3658 {
    static void main(String[] args) {
        int n = 5;
        int sumOdd = 0;
        int sumEven = 0;
        int odd = 1;
        int even = 2;
        while (n > 0) {
            sumOdd += odd;
            odd+=2;
            sumEven += even;
            even+=2;
            n--;
        }
        int t = Math.max(sumOdd, sumEven);
        int ans = 1;
        for(int i = 1; i <= t; i++){
            if(sumOdd % i == 0 && sumEven % i == 0){
                ans = i;
            }
        }
        System.out.println(ans);
    }
}
