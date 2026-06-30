import java.util.*;

public class minimiseSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int a1 = sc.nextInt();
            int a2 = sc.nextInt();
            for (int i = 2; i < n; i++) {
                sc.nextInt();
            }
            System.out.println(Math.min(2 * a1, a1 + a2));
        }
        sc.close();
    }
}