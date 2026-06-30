package basics.RecursionByStrivers;

public class FactorialofaNumber {
    public static int fact(int n){
        if(n==0||n==1) return 1;
        int ans = n*fact(n-1);
        return ans;
    }
}
