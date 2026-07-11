package Kumar_K.MainCourse.Hashing;
import java.util.HashMap;
import java.util.Map;

public class Class11_Q2 {
    public static void main(String[] args) {
        String s = "loveleetcode";
        int n = s.length();
        HashMap<Character,Integer> hs = new HashMap<>();
        for (int i = 0; i <n; i++) {

            hs.put(s.charAt(i), hs.getOrDefault(s.charAt(i),0)+1);
        }
        for (int i = 0; i <n; i++) {
            if (hs.get(s.charAt(i)) == 1) {
                System.out.println("First unique character: " + s.charAt(i));
                break;
            }
        }
    }
}
