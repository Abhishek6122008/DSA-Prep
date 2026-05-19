package Educational190;
import java.util.*;
import java.io.*;

public class digitString {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            String s = br.readLine().trim();
            long removals = 0;

            long fours = s.chars().filter(c -> c == '4').count();
            removals += fours;
            long oneThreeCount = 0;
            for (char c : s.toCharArray()) {
                if (c == '4') continue;
                if (c == '1' || c == '3') {
                    oneThreeCount++;
                } else if (c == '2') {
                    if (1 <= oneThreeCount) {
                        removals += 1;
                        oneThreeCount = 0;
                    }
                }
            }
            sb.append(removals).append("\n");
        }
        System.out.print(sb);
    }
}
