package Kumar_K.MainCourse.Hashing;
//given array with tower heights
//make largest equal to smallest
//Bruteforce find largest element of array and second largest in the array On
//time complexity = On2

import java.util.*;

public class Class20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        TreeMap<Integer, Integer> map = new TreeMap<>(Collections.reverseOrder());
        // Read input and store frequencies
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
        int steps = 0;
        for (int i = 0; i < list.size() - 1; i++) {
            int freq = list.get(i).getValue();
            // These piles need one operation
            steps += freq;
            // After reducing them, they join the next lower height
            list.get(i + 1).setValue(list.get(i + 1).getValue() + freq);
        }
        System.out.println(steps);
    }
}
