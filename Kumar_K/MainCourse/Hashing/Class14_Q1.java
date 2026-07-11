package Kumar_K.MainCourse.Hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.HashSet;

//Hashmap is mostly being used for frequency storing
//longest consequtive sequence
public class Class14_Q1 {
    public static void main(String[] args) {
        int[] nums = {0,3,7,2,5,8,4,6,0,1};
        HashSet<Integer> hs = new HashSet<>();
        int n = nums.length;
        for(int num: nums){
            hs.add(num);
        }
        int longest = 0;
        for(int num: hs){
            if(!hs.contains(num-1)){
                int current = num;
                int length = 1;
                while(hs.contains(current+1)){
                    current++;
                    length++;
                }
                longest = Math.max(longest,length);
            }
        }System.out.println("Longest Consecutive Sequence Length: " + longest);
    }
}
