package Leetcode;

import java.util.HashMap;

public class isomorphicStrings {
    public static void main(String[] args) {
        String s = "egg";
        String t = "add";
        int n = s.length();
        boolean x = true;
        HashMap<Character,Character> hs = new HashMap<>();
        HashMap<Character,Character> ht = new HashMap<>();
        for (int i = 0; i <n; i++) {
            char chs = s.charAt(i);
            char cht = t.charAt(i);
            if(hs.containsKey(chs)){
                if(hs.get(chs)==t.charAt(i)){
                    hs.put(chs,cht);
                    x = true;
                }else{
                    x = false;
                }
            }else{
                hs.put(chs,cht);
            }
        }
        for (int i = 0; i <n; i++) {
            char chs = s.charAt(i);
            char cht = t.charAt(i);
            if(ht.containsKey(cht)){
                if(ht.get(cht)==s.charAt(i)){
                    ht.put(cht,chs);
                    x = true;
                }else{
                    x = false;
                }
            }else{
                ht.put(cht,chs);
            }
        }
        System.out.println(x);
    }
}
