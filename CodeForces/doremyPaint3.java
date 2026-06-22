import java.util.*;

public class doremyPaint3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < n; i++) {
                map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
            }
            if (map.size() > 2) {
                System.out.println("NO");
            }
            else if (map.size() == 1) {
                System.out.println("YES");
            }
            else {
                int[] freq = new int[2];
                int index = 0;
                for (int value : map.values()) {
                    freq[index++] = value;
                }
                if (Math.abs(freq[0] - freq[1]) <= 1) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
    }
}