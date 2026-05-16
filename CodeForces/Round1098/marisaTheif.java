package Round1098;

import java.util.*;

public class marisaTheif {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int c0 = 0, c1 = 0, c2 = 0;
            for (int x : arr) {
                if (x == 0) {
                    c0++;
                } else if (x == 1) {
                    c1++;
                } else {
                    c2++;
                }
            }
            int ans = 0;
            ans += c0;
            int pairs = Math.min(c1, c2);
            ans += pairs;
            c1 -= pairs;
            c2 -= pairs;
            ans += c1 / 3;
            ans += c2 / 3;
            System.out.println(ans);
        }
        sc.close();
    }
}