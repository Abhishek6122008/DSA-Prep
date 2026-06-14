import java.util.*;

public class omskProgrammers {
    static long x;
    static HashMap<Long, Long> memo;
    static long solve(long a, long b) {
        if (a < b) {
            long t = a;
            a = b;
            b = t;
        }
        long key = (a << 32) ^ b;
        if (memo.containsKey(key)) return memo.get(key);
        long ans = a - b;
        if (a >= x) {
            ans = Math.min(ans, 1 + solve(a / x, b));

            long r = (x - a % x) % x;
            ans = Math.min(ans, r + 1 + solve((a + r) / x, b));
        }
        memo.put(key, ans);
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            x = sc.nextLong();

            memo = new HashMap<>();
            System.out.println(solve(a, b));
        }
    }
}