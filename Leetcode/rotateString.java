package Leetcode;
import java.util.*;
public class rotateString {
    public static void main(String[] args) {
        String s = "abcde";
        String goal = "cdeab";
        s = s+s;
        boolean x = false;
        if (s.contains(goal)){
            x = true;
        }
        System.out.println(x);
    }
}
