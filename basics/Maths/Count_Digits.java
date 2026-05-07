package basics.Maths;
import java.util.*;
public class Count_Digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr1 = new int[size];
        int digit =0;
        for (int i = 0; i < size; i++) {
            arr1[i] = sc.nextInt();
            digit =i;
        }System.out.println(digit+1);
    }
}
