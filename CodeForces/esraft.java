import java.util.Scanner;

public class esraft {
    static final long L = 232792560L;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            if (n == 2 || n == 3) {
                System.out.println(-1);
                continue;
            }

            long[] ans = new long[n];
            long sum = 0;

            for (int i = 1; i <= n; i++) {
                ans[i - 1] = L / i;
                sum += ans[i - 1];
            }

            ans[0] = 2 * L - sum;

            for (long x : ans) {
                System.out.print(x + " ");
            }
            System.out.println();
    }
        }
}
