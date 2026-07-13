package Leetcode;
import java.util.*;
public class rankTransformArray {
    public static void main(String[] args) {
        int[] arr = {40,10,20,30};
        int n = arr.length;
        int[] copy = arr.clone();
        Arrays.sort(copy);
        HashMap<Integer,Integer> hs = new HashMap<>();
        int rank = 1;
        for(int x: copy){
            if(!hs.containsKey(x)){
                hs.put(x,rank++);
            }
        }
        for (int i = 0; i <n; i++) {
            arr[i] = hs.get(arr[i]);
        }
    }
}
