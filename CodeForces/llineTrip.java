import java.util.*;
public class llineTrip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            int x = sc.nextInt();
            for (int i = 0; i <n; i++) {
                arr[i] = sc.nextInt();
            }
            int maxDiff = arr[0];
            for (int i = 0; i <n; i++) {
                if(i==n-1){
                    maxDiff = Math.max(maxDiff,(x - arr[i])*2);
                } else{
                    maxDiff = Math.max(maxDiff,arr[i+1]-arr[i]);
                }
            }
            System.out.println(maxDiff);
        }
    }
}
