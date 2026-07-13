package Kumar_K.MainCourse.Hashing;

import java.util.HashMap;

//given an array of size n
//in one operation u can either select any two element and remove them from the aray
//or u can select any three same elements gfrom the aray and remove them from the array
//task is to destroy the full array in minimum times
public class Class23 {
    static void main(String[] args) {
        int[] nums = {1,8,5,8,5,1,1,4,4,4,4,4,4,2,2};
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int count = 0;
        for(var entry : map.entrySet()){
            int freq = entry.getValue();
            if(freq == 1){
                count = -1;
                break;
            }
            count += freq / 3;
            if(freq % 3 != 0){
                count++;
            }
        }
        System.out.println(count);
    }
}
