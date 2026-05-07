package basics.Recursion;
import java.util.*;
public class Fibonacci_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n == 0){
            System.out.println(0);
            return;
        }

        if(n == 1){
            System.out.println(1);
            return;
        }
        int x = 0;
        int y = 1;
        int temp =0;
        for (int i = 0; i < n-1 ; i++) {
            temp = x + y;
            x = y;
            y = temp;
        }
        System.out.println(temp);
    }
}
