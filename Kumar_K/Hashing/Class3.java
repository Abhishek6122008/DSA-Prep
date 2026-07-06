package Kumar_K.Hashing;

import java.util.HashMap;

//check if theres any two equal numbers in an array at distance less than equal to k
public class Class3 {
    public static void main(String[] args) {
        int k = 3;
        int[] arr = {3,2,4,3,1};
        int n = arr.length;
        HashMap<Integer,Integer> hs = new HashMap<>();
        for (int i = 0; i <n; i++) {
            if(hs.containsKey(arr[i])){
                if(i-hs.get(arr[i])<=k){
                }
            }
        }
    }
}
