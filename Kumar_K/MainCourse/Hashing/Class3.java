package Kumar_K.MainCourse.Hashing;

import java.util.HashMap;

//find sum of range(l.....r) where (l<=r) using prefix sum.
//bruteforce (On*q) l=1 r=4 find sum of l to r q is the size of the querry
//optimise prefix sum which is O(n+q)
public class Class3 {
    public static void main(String[] args) {
        int[] arr = {3,4,1,2,1,4};
        int l = 2-1;
        int r = 5-1;
        int n = arr.length;
        int[] prefix = new int[n];
        for (int i = 0; i <n; i++) {
            if(i==0){
                prefix[i]=arr[i];
            }else{
                prefix[i]=arr[i]+prefix[i-1];
            }
        }
        int sum = prefix[r] - prefix[l-1];
        System.out.println(sum);
    }
}
