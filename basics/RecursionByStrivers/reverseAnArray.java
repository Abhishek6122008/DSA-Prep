package basics.RecursionByStrivers;
import java.util.Arrays;
public class reverseAnArray {
    public static void swap(int i, int[] a, int n) {
        if (i >= n) return;
        int temp = a[i];
        a[i] = a[n];
        a[n] = temp;
        swap(i + 1, a, n - 1);
    }
    public static void main(String[] args) {
        int[] a = {1, 3, 2, 5, 4};
        int n = a.length;
        swap(0, a, n - 1);
        System.out.println(Arrays.toString(a));
    }
}