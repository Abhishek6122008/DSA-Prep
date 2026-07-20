package Leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class findCommonCharactors_1002 {
    public static void main(String[] args) {
        String[] words = {"bella", "label", "roller"};
        HashMap<Character, Integer> minMap = new HashMap<>();
        for (char c : words[0].toCharArray()) {
            minMap.put(c, minMap.getOrDefault(c, 0) + 1);
        }
        for (int i = 1; i <words.length; i++) {
            HashMap<Character, Integer> currMap = new HashMap<>();
            for (char c : words[i].toCharArray()) {
                currMap.put(c, currMap.getOrDefault(c, 0) + 1);
            }
            for(char c = 'a'; c <= 'z'; c++){
                int min = Math.min(currMap.getOrDefault(c,0), minMap.getOrDefault(c,0));
                if(min==0){
                    minMap.remove(c);
                }else{
                    minMap.put(c, min);
                }
            }
            List<String> ans = new ArrayList<>();
            for (Map.Entry<Character, Integer> entry : minMap.entrySet()) {
                for (int j = 0; j <entry.getValue(); j++) {
                    ans.add(String.valueOf(entry.getKey()));
                }
            }
            System.out.println(ans);
        }
    }
}