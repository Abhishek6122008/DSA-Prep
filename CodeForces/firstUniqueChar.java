import java.util.HashMap;

public class firstUniqueChar {
    public static void main(String[] args) {
        String s = "codingminutes";
        HashMap<Character,Integer> hm= new HashMap<>();
        for (int i = 0; i <s.length() ; i++) {
            char ch = s.charAt(i);
            if(hm.containsKey(ch)){
                hm.put(ch,hm.get(ch)+1);
            }else{
                hm.put(ch,1);
            }
        }
        int unique = -1;

        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(hm.get(ch) == 1) {
                unique = hm.get(ch)-1;
            }
        }
        System.out.println(unique);
    }
}
