package Kumar_K.Prerequisite.Recurrsion.Hashing;

import java.util.HashMap;
import java.util.Scanner;

public class Class1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
            int g = hashMap.getOrDefault(array[i], 0);
            hashMap.put(array[i], g  + 1);
        }
        int q = scanner.nextInt();
        for (int i = 0; i < q; i++) {
            int query = scanner.nextInt();
            int count = hashMap.getOrDefault(query, 0);
            System.out.println(count);
        }
    }
}
