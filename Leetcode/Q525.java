package Leetcode;

import java.util.HashMap;

public class Q525 {
    public static void main(String[] args) {
        int[] nums = {0,1,1,1,1,1,0,0,0};
        int n = nums.length;
        HashMap<Integer,Integer> hs = new HashMap<>();
        hs.put(0,-1);
        int prefix = 0;
        int ans = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 1){
                prefix++;
            }else{
                prefix--;
            }
            if(hs.containsKey(prefix)){
                ans = Math.max(ans, i - hs.get(prefix));
            }else{
                hs.put(prefix, i);
            }
        }
        System.out.println(ans);

    }
}
