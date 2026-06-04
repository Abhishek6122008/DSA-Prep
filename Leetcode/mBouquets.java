package Leetcode;

public class mBouquets {
    public static void main(String[] args) {
        int[] bloomDay = {7,7,7,7,12,7,7};
        int m = 2;
        int k = 3;
        long flowersNeeded = (long) m * k;
        if (flowersNeeded > bloomDay.length) {
            System.out.println(-1);
            return;
        }
        int max = 0;
        int min = Integer.MAX_VALUE;
        for (int bloom : bloomDay) {
            min = Math.min(min, bloom);
            max = Math.max(max, bloom);
        }
        int answer = -1;
        while (min <= max) {
            int mid = min + (max - min) / 2;
            int bouquets = 0;
            int consecutive = 0;
            for (int bloom : bloomDay) {
                if (bloom <= mid) {
                    consecutive++;
                    if (consecutive == k) {
                        bouquets++;
                        consecutive = 0;
                    }
                } else {
                    consecutive = 0;
                }
            }
            if (bouquets >= m) {
                answer = mid;
                max = mid - 1;
            } else {
                min = mid + 1;
            }
        }

        System.out.println(answer);
    }
}