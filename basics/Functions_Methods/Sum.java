package basics.Functions_Methods;
import java.util.*;
public class Sum {
    public static void sumOfTwo(int a, int b){
        System.out.println(a+b);
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        sumOfTwo(a ,b);
    }
}
