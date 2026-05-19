package Educational190;
import java.util.*;
import java.io.*;

public class optimalPurchase {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            long n = Long.parseLong(st.nextToken());
            long a = Long.parseLong(st.nextToken());
            long b = Long.parseLong(st.nextToken());

            long cost = 0;

            if (b >= 3 * a) {
                cost = n * a;
            } else {
                long groups = n / 3;
                long rem = n % 3;
                cost = groups * b;
                if (rem > 0) cost += Math.min(b, rem * a);
            }

            sb.append(cost).append("\n");
        }

        System.out.print(sb);
    }
}