package Leetcode;

import java.util.HashMap;

public class twoSom {
    public static void main(String[] args) {
        int nums[] = {3, 2, 4};
        int target = 6;
        int[] arr = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int difference = target - nums[i];
            if (map.containsKey(difference)) {
                arr[0] = map.get(difference);
                arr[1] = i;
                break;
            }
            map.put(nums[i], i);
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}