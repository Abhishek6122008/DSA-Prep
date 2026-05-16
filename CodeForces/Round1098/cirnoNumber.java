import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StreamTokenizer in = new StreamTokenizer(br);
        StringBuilder sb = new StringBuilder();
        in.nextToken(); int t = (int) in.nval;
        while (t-- > 0) {
            in.nextToken(); long a = (long) in.nval;
            in.nextToken();
            in.nextToken(); int d0 = (int) in.nval;
            in.nextToken(); int d1 = (int) in.nval;
            int[] d = {d0, d1};
            long ans = Long.MAX_VALUE;
            String sa = String.valueOf(a);
            int len = sa.length();
            for (int l = Math.max(1, len - 1); l <= len; l++) {
                for (int i = 0; i < l; i++) {
                    for (int dir = -1; dir <= 1; dir += 2) {
                        long b = 0;
                        boolean valid = true;
                        for (int j = 0; j < l; j++) {
                            int adig;
                            if (l == len) adig = sa.charAt(j) - '0';
                            else adig = j == 0 ? 10 : 0; // l < len: force go below
                            int pick;
                            if (j < i) {
                                boolean found = false;
                                for (int x : d) if (x == adig) { pick = x; b = b*10+x; found = true; break; }
                                if (!found) { valid = false; break; }
                                continue;
                            } else if (j == i) {
                                if (dir == -1) {
                                    pick = -1;
                                    for (int x : d) if (x < adig) pick = x;
                                } else {
                                    pick = -1;
                                    for (int x : d) if (x > adig && pick == -1) pick = x;
                                }
                                if (pick == -1) { valid = false; break; }
                            } else {
                                pick = dir == -1 ? d[1] : d[0];
                            }
                            if (j == 0 && l > 1 && pick == 0) { valid = false; break; }
                            b = b * 10 + pick;
                        }
                        if (valid) ans = Math.min(ans, Math.abs(a - b));
                    }
                }
                if (l == len) {
                    long b = 0; boolean valid = true;
                    for (int j = 0; j < l; j++) {
                        int adig = sa.charAt(j) - '0';
                        boolean found = false;
                        for (int x : d) if (x == adig) { b = b*10+x; found = true; break; }
                        if (!found) { valid = false; break; }
                    }
                    if (valid) ans = Math.min(ans, Math.abs(a - b));
                }
            }
            {
                int l = len + 1;
                if (l <= 18) {
                    int first = d0 != 0 ? d0 : d1;
                    if (first != 0) {
                        long b = first;
                        for (int j = 1; j < l; j++) b = b * 10 + d0;
                        ans = Math.min(ans, Math.abs(a - b));
                        b = first;
                        for (int j = 1; j < l; j++) b = b * 10 + d1;
                        ans = Math.min(ans, Math.abs(a - b));
                    }
                }
            }

            if (d0 == 0) ans = Math.min(ans, a);

            sb.append(ans).append('\n');
        }
        System.out.print(sb);
    }
}