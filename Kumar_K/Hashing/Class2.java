package Kumar_K.Hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// we are given an array of numbers in this array we have to find any one of the number with the
// maximum frequency and find and print with minimum frequency
public class Class2 {
    public static void main(String[] args) {
        int[] arr = {3,2,3,5,4,3};
        //3 = 3,2=1,5=1,4=1
        HashMap<Integer,Integer> hs = new HashMap<>();
        for (int i = 0; i <arr.length; i++) {
            int g = hs.getOrDefault(arr[i],0);
            hs.put(arr[i],g+1);
        }
        int maxNum = 0;
        int maxNumFreq = 0;
        int minNum = Integer.MAX_VALUE;
        int minNumFreq = Integer.MAX_VALUE;
        for (Map.Entry<Integer, Integer> entry : hs.entrySet()){
            int key = entry.getKey();
            int value = entry.getValue();
            if(value>maxNumFreq) {
                maxNum = key;
                maxNumFreq = value;
            } else if (value<minNumFreq) {
                minNum= key;
                minNumFreq = value;
            }
        }
        System.out.println("Max Frequency Number is :"+maxNum+" with Frequency :"+maxNumFreq+" Min num is :"+minNum+" With Frequency :"+minNumFreq);
    }
}
