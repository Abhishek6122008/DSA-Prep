import java.util.*;
public class gamesOnTheTrain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int max = 0;
            int min = Integer.MAX_VALUE;
            for (int i = 0; i <n; i++) {
                min = Math.min(min,arr[i]);
                max = Math.max(max,arr[i]);
            }
            int diff = max-min;
            System.out.println(diff+1);
        }
    }
}