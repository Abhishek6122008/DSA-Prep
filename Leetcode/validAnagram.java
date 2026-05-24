package Leetcode;
import java.util.*;
public class validAnagram {
    public static void main(String[] args) {
        String s ="anagram";
        String t ="nagaram";
        int n = s.length();
        HashMap<Character,Integer> hs = new HashMap<>();
        for (int i = 0; i <n; i++) {
            if(hs.containsKey(s.charAt(i))){
                hs.put(s.charAt(i), hs.get(s.charAt(i)) + 1);
            }else{
                hs.put(s.charAt(i),1);
            }
        }
        boolean x= true;
        for (int i = 0; i <n; i++) {
            if(hs.containsKey(t.charAt(i))){
                hs.put(t.charAt(i), hs.get(t.charAt(i)) -1 );
            }else{
                x = false;
            }
        }
        System.out.println(x);
    }
}
