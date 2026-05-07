package basics.Maths;

public class palindrome_number {
    public static void main(String[] args) {
        int x = 121;
        int original = x;   // 🔥 store original
        int y = 0;

        while (x != 0) {
            int digit = x % 10;
            y = y * 10 + digit;
            x /= 10;
        }

        System.out.println(y);

        if (original == y) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
