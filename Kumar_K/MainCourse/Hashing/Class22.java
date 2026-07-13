package Kumar_K.MainCourse.Hashing;

import java.util.HashMap;

//number of times a target word can be obtained by rearranged s
public class Class22 {
    static void main(String[] args) {
        String s = "mononom";
        String t = "mon";
        HashMap<Character, Integer> map = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        int n = s.length();
        for (int i = 0; i <n; i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        for (int i = 0; i < t.length(); i++) {
            map2.put(t.charAt(i), map2.getOrDefault(t.charAt(i), 0) + 1);
        }
        int ans = Integer.MAX_VALUE;
        for(char c : map2.keySet()){
            ans = Math.min(ans, map.getOrDefault(c, 0) / map2.get(c));
        }
        System.out.println(ans);
    }
}
