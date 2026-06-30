import java.io.*;
import java.util.*;

public class popcountProblem {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            long n = Long.parseLong(st.nextToken());
            long k = Long.parseLong(st.nextToken());
            long ans = 0;
            long cost = 1;
            while (cost <= n) {
                long take = Math.min(k, n / cost);
                ans += take;
                n -= take * cost;

                if (take < k) break;
                cost <<= 1;
            }
            sb.append(ans).append('\n');
        }
        System.out.print(sb.toString());
    }
}