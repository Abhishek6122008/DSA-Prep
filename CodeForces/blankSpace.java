import java.util.*;
public class blankSpace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int maxlong = 0;
            int longest = 0;
            for (int i = 0; i <n; i++) {
                if(arr[i]==0){
                    longest++;
                }else{
                    maxlong = Math.max(maxlong,longest);
                    longest=0;
                }
            }
            maxlong = Math.max(maxlong, longest);
            if((n==1)&(arr[0]==0)){
                maxlong = 1;
            }

            System.out.println(maxlong);
        }
    }
}