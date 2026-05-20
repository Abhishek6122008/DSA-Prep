package Leetcode;

import java.util.ArrayList;

public class largestOddNumber {
    public static void main(String[] args) {
        String num = "35427";
        int nums = Integer.parseInt(num);
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < num.length(); i++) {
            arr.add(nums % 10);
            nums = nums / 10;
        }
        String ans = "";
        for (int i = arr.size() - 1; i >= 0; i--) {
            if (arr.get(i) % 2 != 0) {
                ans += arr.get(i);
            }
        }
        System.out.println(ans);
    }
}