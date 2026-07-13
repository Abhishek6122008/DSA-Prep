import java.util.*;

public class farmpiggie {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            int[] p = new int[n];
            int even = 2;
            int odd = 1;

            for (int i = 0; i < n; i++) {
                if ((i + 1) % 2 == 1) {
                    p[i] = even;
                    even += 2;
                } else {
                    p[i] = odd;
                    odd += 2;
                }
            }

            for (int x : p) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}