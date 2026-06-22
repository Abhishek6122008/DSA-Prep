import java.util.*;

public class arrayColoring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            int sum = 0;
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                sum += arr[i];
            }
            boolean allEven = true;
            for (int i = 0; i < n; i++) {
                if (arr[i] % 2 != 0) {
                    allEven = false;
                    break;
                }
            }
            if (allEven) {
                System.out.println("YES");
                continue;
            }
            int odd = 0;
            if (sum % 2 == 0) {
                for (int i = 0; i < n; i++) {
                    if ((odd + arr[i]) % 2 == 1) {
                        odd += arr[i];
                    }
                }
            } else {
                for (int i = 0; i < n; i++) {
                    if ((odd + arr[i]) % 2 == 0) {
                        odd += arr[i];
                    }
                }
            }
            int remaining = sum - odd;
            if (odd > 0 && remaining > 0 && odd % 2 == remaining % 2) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}