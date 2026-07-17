package Kumar_K.MainCourse.Hashing;

import java.util.HashMap;

public class Class26 {
    static void main(String[] args) {
        String s = "LCLLCLLLC";
        //OP:- "4";
        //at each index i try to find how many lc sequencesw ending at index i
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        long count  = 0;
        for (int i = 0; i <s.length(); i++) {
            if (s.charAt(i) == 'C') {
                count += map.getOrDefault('L', 0);
            }
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        long maxInsertC = 1;
        long l = 0;
        for (int i = 0; i <= s.length(); i++) {
            maxInsertC = Math.max(maxInsertC, l);

            if (i < s.length() && s.charAt(i) == 'L')
                l++;
        }
        long maxInsertL = 1;
        long c = 0;
        for (int i = s.length(); i >= 0; i--) {
            maxInsertL = Math.max(maxInsertL, c);

            if (i > 0 && s.charAt(i - 1) == 'C')
                c++;
        }
        long ans = count + Math.max(maxInsertC, maxInsertL);
        System.out.println(ans);
    }
}
