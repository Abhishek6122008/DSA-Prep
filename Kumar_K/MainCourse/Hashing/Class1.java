package Kumar_K.MainCourse.Hashing;

import java.util.HashMap;

//count all pairs equal to k
public class Class1 {
    public static void main(String[] args) {
        int[] arr = {3,2,1,2,5};
        int k = 4;
        int n = arr.length;
        //Bruteforce On2 we add arr[i] to arr[j]
        //optimal hashmap we minus arr[i] with k and check if remained is there in hashmap
        HashMap<Integer, Integer> hs = new HashMap<>();
        int count = 0;
        for (int i = 0; i < n; i++) {
            count += hs.getOrDefault(k - arr[i], 0);
            hs.put(arr[i], hs.getOrDefault(arr[i], 0) + 1);
        }
        System.out.println(count);
    }
}
