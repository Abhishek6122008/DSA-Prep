package Kumar_K.Hashing;

import java.util.*;

public class Class4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] freq = new int[501]; // range [0,500]
        for(int i = 0; i < n; i++){
            int x = sc.nextInt();
            freq[x]++;
        }
        int minFreq = Integer.MAX_VALUE, maxFreq = 0;
        int minElem = -1, maxElem = -1;
        for(int i = 0; i <= 500; i++){
            if(freq[i] > 0){
                if(freq[i] < minFreq){
                    minFreq = freq[i];
                    minElem = i;
                }
                if(freq[i] > maxFreq){
                    maxFreq = freq[i];
                    maxElem = i;
                }
            }
        }
        System.out.println(minElem + " " + minFreq);
        System.out.println(maxElem + " " + maxFreq);
    }
}
