package GFG;

public class LCM {
    public static void main(String[] args) {
        int a = 20;
        int b = 28;
        int x = a;
        int y = b;
        while (y != 0) {
            int temp = y;
            y = x % y;
            x = temp;
        }
        int gcd = x;
        int lcm = (a * b) / gcd;
        System.out.println(lcm);
    }
}