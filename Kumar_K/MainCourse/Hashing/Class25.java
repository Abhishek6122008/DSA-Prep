package Kumar_K.MainCourse.Hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//count the number of good subarrays
//sub array is good is sum of elements from i to j mod k is = to n which is the legnth of the subarray
public class Class25 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long k = sc.nextLong();
        long[] a = new long[(int) n + 1];
        long[] prefix = new long[(int) n + 1];
        for (int i = 1; i <= n; i++) {
            a[i] = sc.nextLong();
            prefix[i] = prefix[i - 1] + a[i];
        }
        Map<Long, Long> freq = new HashMap<>();
        freq.put(0L, 1L);
        long count = 0;
        for (int j = 1; j <= n; j++) {
            long modPrefix = ((prefix[j] % k - j % k + k) % k);
            count += freq.getOrDefault(modPrefix, 0L);
            freq.put(modPrefix, freq.getOrDefault(modPrefix, 0L) + 1);
        }
        System.out.println(count);
    }
}
