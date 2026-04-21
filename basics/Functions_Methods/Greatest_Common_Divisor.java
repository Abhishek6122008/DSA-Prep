package basics.Functions_Methods;
import java.util.*;
public class Greatest_Common_Divisor {
    public static void greatestCommonDivisor(int a,int b){
        int temp;
        while(b != 0){
            temp = a % b;
            a = b;
            b = temp;
        }
        System.out.println(a); // GCD
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        greatestCommonDivisor(a,b);
    }
}
