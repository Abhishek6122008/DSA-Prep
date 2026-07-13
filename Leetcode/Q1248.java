package Leetcode;

import java.util.HashMap;
import java.util.Map;

public class Q1248 {
    public static void main(String[] args) {
        int[] nums = {2,2,2,1,2,2,1,2,2,2};
        int n = nums.length;
        int k = 2;
        int currSum = 0, subarrays = 0;
        HashMap<Integer, Integer> prefixSum = new HashMap<>();
        prefixSum.put(currSum, 1);

        for (int i = 0; i < nums.length; i++) {
            currSum += nums[i] % 2;
            // Find subarrays with sum k ending at i
            if (prefixSum.containsKey(currSum - k)) {
                subarrays = subarrays + prefixSum.get(currSum - k);
            }
            // Increment the current prefix sum in hashmap
            prefixSum.put(currSum, prefixSum.getOrDefault(currSum, 0) + 1);
        }
        System.out.println(subarrays);
    }
}
