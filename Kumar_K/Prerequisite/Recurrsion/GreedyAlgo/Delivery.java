package Kumar_K.Prerequisite.Recurrsion.GreedyAlgo;

import java.util.*;
import java.io.*;

public class Delivery {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long sum = 0;
        Long[] p = new Long[n];
        for (int i = 0; i < n; i++) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            sum = sum - a + b * n;
            p[i] = a - b;
        }
        Arrays.sort(p, Collections.reverseOrder());
        for (int j = 1; j <= n; j++) {
            sum += j * p[j - 1];
        }
        System.out.println(sum);
    }
}
