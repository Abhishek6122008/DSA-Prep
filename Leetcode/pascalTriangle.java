package Leetcode;
import java.util.*;

public class pascalTriangle {
    public static void main(String[] args) {
        List<List<Integer>> triangle = new ArrayList<>();
        int r = 5;
        for (int i = 0; i < r; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    row.add(1);
                } else {
                }
            }
            triangle.add(row);
        }
        System.out.println(triangle);
    }
}