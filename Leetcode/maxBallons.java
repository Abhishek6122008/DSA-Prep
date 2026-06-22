package Leetcode;

import java.util.HashMap;

public class maxBallons {
    public static void main(String[] args) {
        String s = "Balloon";
        HashMap<Character, Integer> hs = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            hs.put(s.charAt(i), 0);
        }
        String text = "loonbalxballpoon";
        for (int i = 0; i < text.length(); i++) {
            if (hs.containsKey(text.charAt(i))) {
                hs.put(text.charAt(i), hs.get(text.charAt(i)) + 1);
            }
        }
        int minNum = 0;
        int min = 0;
        for (char ch : hs.keySet()) {
            if (hs.get(ch) >= 1) {
                if (ch == 'b' || ch == 'a' || ch == 'n') {
                    min = hs.get(ch);
                } else {
                    min = hs.get(ch)/2;
                }
                minNum = Math.min(minNum, min);
            }else{
                System.out.println(0);
                break;
            }
        }
        System.out.println(minNum);
    }
}