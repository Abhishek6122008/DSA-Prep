package Kumar_K.MainCourse.Hashing;
import java.util.*;
public class Class18_Q1 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        String[] words = {"ab","ba","cd","dc","aa","aa","cc"};

        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        int ans = 0;
        boolean center = false;

        for (String word : map.keySet()) {
            String rev = "" + word.charAt(1) + word.charAt(0);

            if (word.equals(rev)) {
                int freq = map.get(word);
                ans += (freq / 2) * 4;

                if (freq % 2 == 1)
                    center = true;
            } else if (word.compareTo(rev) < 0) {
                ans += Math.min(map.get(word), map.getOrDefault(rev, 0)) * 4;
            }
        }
        if (center)
            ans += 2;
        System.out.println(ans);
    }
}
