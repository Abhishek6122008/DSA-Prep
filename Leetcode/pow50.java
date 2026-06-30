package Leetcode;

public class pow50 {
    public static double myPow(double x, int n){
        long N = n;

        if (N < 0) {
            x = 1 / x;
            N = -N;
        }

        return power(x, N);
    }
    private static double power(double x, long n){
        if(n==0) return 1;
        double num = myPow(x, (int) (n/2));
        if(n%2==0){
            return num * num;
        }else{
            return x * num * num;
        }
    }
    public static void main(String[] args) {
        System.out.println(myPow(2,10));
    }
}
