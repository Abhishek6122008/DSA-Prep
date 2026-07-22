package Leetcode;

import java.util.HashMap;

public class maxNumOfKSum_1679 {
    static void main(String[] args) {
        int[] nums = {3, 3, 4, 3, 2};
        int k = 6;
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (map.getOrDefault(k - num, 0) > 0) {
                count++;
                map.put(k - num, map.get(k - num) - 1);
            } else {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
        }
        System.out.println(count);
    }
}
