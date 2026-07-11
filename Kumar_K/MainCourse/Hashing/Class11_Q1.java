package Kumar_K.MainCourse.Hashing;

import java.util.HashMap;

//max distance between any two elements
public class Class11_Q1 {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,2,1};
        int n = arr.length;
        int maxLen = 0;
        HashMap<Integer,Integer> hs = new HashMap<>();
        for (int i = 0; i <n; i++) {
            if(hs.containsKey(arr[i])){
                int len = i-hs.get(arr[i]);
                maxLen = Math.max(maxLen,len);
            }
            hs.put(arr[i],i);
        }
        System.out.println(maxLen);
    }
}
