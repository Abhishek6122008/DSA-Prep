package Leetcode;

import java.util.HashMap;
import java.util.*;

public class SmallestSequence1081 {
    static void main(String[] args) {
        String s = "cbacdcbc";
        int[] last = new int[26];
        boolean[] used = new boolean[26];
        for(int i = 0; i < s.length(); i++)
            last[s.charAt(i) - 'a'] = i;
        Stack<Character> st = new Stack<>();
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(used[ch - 'a'])
                continue;
            while(!st.isEmpty()
                    && st.peek() > ch
                    && last[st.peek() - 'a'] > i) {
                used[st.pop() - 'a'] = false;
            }
            st.push(ch);
            used[ch - 'a'] = true;
        }
        StringBuilder ans = new StringBuilder();
        for(char c : st)
            ans.append(c);
    }
}
