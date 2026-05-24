import java.util.*;

public class dontCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            sc.nextLine();
            String x = sc.nextLine();
            String s = sc.nextLine();
            int operations = 0;
            while (x.length() < s.length()) {
                x += x;
                operations++;
            }
            if (x.contains(s)) {
                System.out.println(operations);
            } else {
                x += x;
                operations++;
                if (x.contains(s))
                    System.out.println(operations);
                else
                    System.out.println(-1);
            }
        }
    }
}