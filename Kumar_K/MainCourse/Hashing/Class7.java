package Kumar_K.MainCourse.Hashing;

import java.util.HashMap;

//find numbers of subarray which have sum = 3
//answer is 2 for this question
//prefix of j - i-1 is the sum
//prefix of j is sum of elements 0-j and prefix of i-1 is 0 - i-1 sum
//Bruteforce On2 in which we go from j to 0 using i and count how many valid subarrays there are
//Optimal approach is Hashmap + Prefix sum O(n)
public class Class7 {
    public static void main(String[] args) {
        int[] arr = {1,0,1,2,10,5};
        int k = 3;
        HashMap<Integer,Integer> hs = new HashMap<>();
        hs.put(0,1);
        int prefixSum = 0;
        int count = 0;
        for (int i = 0; i <arr.length; i++) {
            prefixSum+=arr[i];
            int x = prefixSum-k;
            if(hs.containsKey(x)){
                count+=hs.get(x);
            }
            hs.put(prefixSum,hs.getOrDefault(prefixSum,0)+1);
        }
        System.out.println(count);
    }
}
