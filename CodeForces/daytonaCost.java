import java.util.*;
public class daytonaCost {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            sc.nextLine();
            int[] arr = new int[n];
            boolean output = false;
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                if(k==arr[i]){
                    output = true;
                }
            }
            if(output==true){
                System.out.println("yes");
            }else{
                System.out.println("no");
            }
        }
    }
}