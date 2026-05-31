import java.util.*;
public class goalsOfVictory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n-1; i++) {
                arr[i] = sc.nextInt();
            }
            int x = 0;
            for (int i = 0; i <n-1; i++) {
                x -=arr[i];
            }
            System.out.println(x);
        }
    }
}