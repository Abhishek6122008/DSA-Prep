package Round1098;
import java.util.*;
import java.io.*;
public class remiliaSoku {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StreamTokenizer in = new StreamTokenizer(br);
        StringBuilder sb = new StringBuilder();
        in.nextToken(); int t = (int) in.nval;
        while (t-- > 0) {
            in.nextToken(); long n  = (long) in.nval;
            in.nextToken(); long x1 = (long) in.nval;
            in.nextToken(); long x2 = (long) in.nval;
            in.nextToken(); long k  = (long) in.nval;
            long d = Math.abs(x1 - x2);
            d = Math.min(d, n - d);
            long ans = (n <= 3) ? d : d + k;
            sb.append(ans).append('\n');
        }
        System.out.print(sb);
    }
}