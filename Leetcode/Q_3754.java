package Leetcode;

public class Q_3754 {
    public static void main(String[] args) {
        int n = 000;
        String s = String.valueOf(n).replace("0","");
        if (s.isEmpty()) {
            n = 0;
        } else {
            n = Integer.parseInt(s);
        }
        long x = n;
        long sum = 0;
        while(n>0){
            long temp = 0;
            temp = n%10;
            sum += temp;
            n=n/10;
        }
        long result = x*sum;
        System.out.println(result);
    }
}
