package GFG;

public class SumOfDigits {
    public static void main(String[] args) {
        int n = 687;
        int sum = 0;
        while(n>0){
            int digit = 0;
            digit = n%10;
            n = n/10;
            sum+=digit;
        }
            System.out.println(sum);
    }
}
