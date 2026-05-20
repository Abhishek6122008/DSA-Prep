package Leetcode;

public class reverseWords {
    public static void main(String[] args) {
        String s = "the sky is blue";
        int n = s.length();
        String[] arr = s.split(" ");
        int x = arr.length;
        for (int i = x-1; i >=0; i--) {
            System.out.println(arr[i]);
        }
    }
}
