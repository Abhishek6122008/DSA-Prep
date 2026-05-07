package basics.Maths;

public class Reverse_Number {
    public static void main(String[] args) {
        int x = 10400;
        int y = 0;

        while (x > 0) {
            int digit = x % 10;
            y = y * 10 + digit;
            x = x / 10;
        }

        System.out.println(y);
    }
}