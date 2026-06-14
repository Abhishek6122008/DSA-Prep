import java.util.*;

public class TatarTv {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            String s = sc.next();
            boolean ok = true;
            for (int start = 0; start < k; start++) {
                int ones = 0;
                for (int pos = start; pos < n; pos += k) {
                    if (s.charAt(pos) == '1') ones++;
                }
                if ((ones & 1) == 1) {
                    ok = false;
                    break;
                }
            }
            System.out.println(ok ? "YES" : "NO");
        }
    }
}