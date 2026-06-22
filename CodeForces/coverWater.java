import java.util.*;

public class coverWater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            char[] arr = sc.next().toCharArray();
            int water = 0;
            int consecutive = 0;
            boolean found = false;

            for (int i = 0; i < n; i++) {
                if (arr[i] == '.') {
                    water++;
                    consecutive++;
                    if (consecutive >= 3) {
                        found = true;
                    }
                } else {
                    consecutive = 0;
                }
            }
            if (found) {
                System.out.println(2);
            } else {
                System.out.println(water);
            }
        }
    }
}