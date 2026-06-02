package Leetcode;

public class implementLowerBound {
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4,5,6,7,8,9,18};
        int x = 9;
        int start = 0;
        int end = arr.length - 1;
        int ans = arr.length; // default if no element >= x
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] >= x) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        System.out.println(ans);
    }
}