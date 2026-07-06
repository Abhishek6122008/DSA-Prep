package Kumar_K.MainCourse.Hashing;

import java.util.HashMap;

//count all pairs whos abs difference
// is equal to k
public class Class2 {
    public static void main(String[] args) {
        int[] arr = {1,5,3,4,2};
        int k = 2;
        int n = arr.length;
        HashMap<Integer,Integer> hs = new HashMap<>();
        int count = 0;
        for (int x : arr) {
            count += hs.getOrDefault(x - k, 0);
            count += hs.getOrDefault(x + k, 0);
            hs.put(x, hs.getOrDefault(x, 0) + 1);
        }
        System.out.println(count);
    }
}
