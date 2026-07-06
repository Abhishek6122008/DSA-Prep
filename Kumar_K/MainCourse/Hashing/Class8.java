package Kumar_K.MainCourse.Hashing;

import java.util.HashMap;

//largest subarray with sum equal to k
public class Class8 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 0, 1, 2};
        int k = 3;
        HashMap<Integer,Integer> hs = new HashMap<>();
        hs.put(0,-1);
        int prefixSum = 0;
        int count = 0;
        int maxLen = 0;
        for (int i = 0; i <arr.length; i++) {
            prefixSum+=arr[i];
            int x = prefixSum-k;
            if(hs.containsKey(x)){
                int len = i-hs.get(x);
                if (len > maxLen) {
                    maxLen = len;
                    count = 1;
                } else if (len == maxLen) {
                    count++;
                }
            }
            if(!hs.containsKey(prefixSum)){
                hs.put(prefixSum,i);
            }// fpr smallest just remove the if statement
        }
        System.out.println(count);
    }
}
