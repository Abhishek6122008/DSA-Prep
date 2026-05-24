package Leetcode;
import java.util.*;
public class freqSortChar {
    public static void main(String[] args) {
        String s = "tree";
        HashMap<Character,Integer> hs = new HashMap<>();
        for(char ch: s.toCharArray()){
            hs.put(ch,hs.getOrDefault(ch,0)+1);
        }
        List<Map.Entry<Character,Integer>> list = new LinkedList<>(hs.entrySet());
        list.sort((a,b)->b.getValue()-a.getValue());
        StringBuilder ans = new StringBuilder();
        for(Map.Entry<Character,Integer>entry:list){
            for (int i = 0; i < entry.getValue(); i++) {
                ans.append(entry.getKey());
            }
        }
        System.out.println(ans);
    }
}
