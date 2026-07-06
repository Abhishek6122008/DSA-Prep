package Kumar_K.Prerequisite.Recurrsion.GreedyAlgo;

import java.util.*;

public class IBM_OA_HackerLand {
    static long upperBound(long[] arr, long target) {
        int l = 0, r = arr.length;
        while (l < r) {
            int mid = l + (r - l) / 2;
            if (arr[mid] <= target) {
                l = mid + 1;
            } else {
                r = mid;
            }
        }
        return l;
    }
    static long lower(long[] arr, long target) {
        return upperBound(arr, target) - 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] b = new long[n + 2];
        long[] prefix = new long[n + 1];
        long totalSum = 0;
        for (int i = 1; i <= n; i++) {
            b[i] = sc.nextLong();
            totalSum += b[i];
        }
        b[0] = (long) -1e18;
        b[n + 1] = (long) 1e18;
        Arrays.sort(b, 1, n + 1);
        for (int i = 1; i <= n; i++) {
            prefix[i] = prefix[i - 1] + b[i];
        }
        int q = sc.nextInt();
        while (q-- > 0) {
            long target = sc.nextLong();
            long g = lower(b, target);
            long leftPart = target * g - prefix[(int) g];
            long rightPart = (totalSum - prefix[(int) g]) - target * (n - g);
            System.out.println(leftPart + rightPart);
        }
        sc.close();
    }
}