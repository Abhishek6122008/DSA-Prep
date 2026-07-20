package Leetcode;

import java.sql.SQLOutput;
import java.util.HashMap;

public class numberOfPairs_2023 {
    static void main(String[] args) {
        String[] nums = {"777","7","77","77"};
        String target = "7777";
        HashMap<String, Integer> map = new HashMap<>();
        for (String s : nums) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }
        int count = 0;
        for (String s : nums) {
            if (target.startsWith(s)) {
                String remaining = target.substring(s.length());
                count += map.getOrDefault(remaining, 0);
                if (remaining.equals(s)) {
                    count--;
                }
            }
        }
        System.out.println(count);
    }
}
