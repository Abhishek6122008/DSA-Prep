package basics.Functions_Methods;
import java.util.*;
public class Fibonacci_Series {
    public static void fibonacciSeries(int n){
        int a = 0, b = 1;

        System.out.print(a + " " + b + " ");

        for(int i = 2; i < n; i++){
            int temp = a + b;
            System.out.print(temp + " ");
            a = b;
            b = temp;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        fibonacciSeries(n);
    }
}
