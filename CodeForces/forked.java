import java.io.*;
import java.util.*;

public class forked {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());

            StringTokenizer st = new StringTokenizer(br.readLine());
            long[] a = new long[n];
            for (int i = 0; i < n; i++) a[i] = Long.parseLong(st.nextToken());

            long sum = 0;
            for (long x : a) sum += x;
            sb.append(sum).append('\n');
        }

        System.out.print(sb);
    }
}