package Leetcode;

import java.util.HashMap;
//(a*b)/n=0;
//n/a = b/n;
//nn/na = b
public class countArrayPairs_2183 {
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] nums = {1,2,3,4,5};
        int k  = 2;
        int n = nums.length;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int g = gcd(nums[i], k);
            for (int d : map.keySet()) {
                if ((long) d * g % k == 0) {
                    count += map.get(d);
                }
            }
            map.put(g, map.getOrDefault(g, 0) + 1);
        }
        System.out.println(count);
    }
}
