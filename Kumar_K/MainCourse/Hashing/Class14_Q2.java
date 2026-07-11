import java.util.HashMap;

public class Class14_Q2 {
    public static void main(String[] args) {
        int[] arr = {15,-2,2,-8,1,7,10,23};
        HashMap<Integer,Integer> map = new HashMap<>();
        int prefix = 0;
        int maxLen = 0;
        for(int i = 0; i < arr.length; i++){
            prefix += arr[i];
            if(prefix == 0){
                maxLen = i + 1;
            }
            if(map.containsKey(prefix)){
                maxLen = Math.max(maxLen, i - map.get(prefix));
            }
            else{
                map.put(prefix, i);
            }
        }
        System.out.println(maxLen);
    }
}