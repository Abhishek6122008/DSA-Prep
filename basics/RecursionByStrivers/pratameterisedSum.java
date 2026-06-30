package basics.RecursionByStrivers;

public class pratameterisedSum {
    public static void sum(int i,int sum){
        if(i<1){
            System.out.println(sum);
            return;
        }else{
            sum(i-1,sum+i);
        }
    }
    public static void main(String[] args) {
        int n = 3;
        sum(n,0);
    }
}
