package Leetcode;

public class sqrt_69 {
    static int main(String[] args) {
        int x = 8;
        if (x == 0 || x == 1)
            System.out.println(x);
        int start = 1;
        int end = x;
        int ans = 0;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            long sq = (long) mid * mid;
            if (sq == x)
                System.out.println(x);
            if (sq < x) {
                ans = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        System.out.println(x);
        return x;
    }
}
