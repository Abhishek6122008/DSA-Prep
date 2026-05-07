import java.util.*;

public class Zhily_Div2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0){

            int n = sc.nextInt();

            long[] arr = new long[n];

            for(int i = 0; i < n; i++) {
                arr[i] = sc.nextLong();
            }

            for(int i = n - 2; i >= 0; i--) {

                if(arr[i] + arr[i + 1] > arr[i]) {
                    arr[i] += arr[i + 1];
                }
            }

            int k = 0;

            for(long x : arr) {
                if(x > 0) {
                    k++;
                }
            }

            System.out.println(k);
        }
    }
}