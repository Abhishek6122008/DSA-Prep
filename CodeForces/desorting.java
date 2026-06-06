import java.util.*;

public class desorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            boolean unsorted = false;
            for (int i = 0; i < n - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    System.out.println(0);
                    unsorted = true;
                    break;
                }
            }
            if (unsorted) {
                continue;
            }
            int minDiff = Integer.MAX_VALUE;
            for (int i = 0; i < n - 1; i++) {
                int diff = arr[i + 1] - arr[i];
                minDiff = Math.min(minDiff, diff);
            }
            int count = (minDiff / 2) + 1;
            System.out.println(count);
        }
    }
}