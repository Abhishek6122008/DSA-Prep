package Leetcode;

import java.util.HashMap;

public class majorityElement {
    public static void main(String[] args) {
        int nums[] = {2,2,1,1,1,2,2};
        HashMap<Integer,Integer> map = new HashMap<>();
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1 );

            }else{
                map.put(nums[i],1);
            }
        }
        for(Integer key : map.keySet()) {

            if(map.get(key) > n / 2) {
                System.out.println(key);
            }
        }

    }
}
