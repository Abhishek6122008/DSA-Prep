package Kumar_K.Prerequisite.Recurrsion.GreedyAlgo;

import java.util.*;

public class stasAndTheQueueAtTheBuffet_1151D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        int[] diff = new int[n];
        long baseSum = 0;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
            baseSum += b[i];
            diff[i] = a[i] - b[i];
        }
        Arrays.sort(diff);
        reverse(diff);
        long[] prefix = new long[n + 1];
        for (int i = 1; i <= n; i++) {
            prefix[i] = prefix[i - 1] + diff[i - 1];
        }
        long maxTip = 0;
        for (int i = 0; i <= n; i++) {
            if (i <= x && (n - i) <= y) {
                maxTip = Math.max(maxTip, baseSum + prefix[i]);
            }
        }
        System.out.println(maxTip);
        sc.close();
    }
    private static void reverse(int[] arr) {
        int l = 0, r = arr.length - 1;
        while (l < r) {
            int tmp = arr[l];
            arr[l] = arr[r];
            arr[r] = tmp;
            l++;
            r--;
        }
    }
}
