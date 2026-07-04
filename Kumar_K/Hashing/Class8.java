package Kumar_K.Hashing;

import java.util.HashMap;

public class Class8 {
    public static int countPairsWithDifferenceK(int[] b, int k) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        int count = 0;

        for (int j = 0; j < b.length; ++j) {
            if (freq.containsKey(b[j] - k)) {
                count += freq.get(b[j] - k);
            }
            if (k != 0 && freq.containsKey(b[j] + k)) { // to avoid double counting when k = 0
                count += freq.get(b[j] + k);
            }

            freq.put(b[j], freq.getOrDefault(b[j], 0) + 1);
        }

        return count;
    }

    public static void main(String[] args) {
        int[] b = {1, 5, 3, 4, 2};
        int k = 2;
        System.out.println(countPairsWithDifferenceK(b, k)); // Output should be the number of pairs with difference k
    }
}
