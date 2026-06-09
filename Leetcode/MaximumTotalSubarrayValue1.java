package Leetcode;

public class MaximumTotalSubarrayValue1 {
    public static void main(String[] args) {
        int[] array = {4,2,5,1};
        int k = 3;
        int n = array.length;
        int max = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            max = Math.max(max,array[i]);
            min = Math.min(min,array[i]);
        }
        int num = (max-min)*2;
    }
}
