package basics.Functions_Methods;
import java.util.*;
public class Product {
    public static void productOfTwo(int a, int b){
        System.out.println(a*b);
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        productOfTwo(a,b);
    }
}
