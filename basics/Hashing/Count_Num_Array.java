package basics.Hashing;
import java.util.*;
public class Count_Num_Array {
    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = 24;
        arr[1] = 44;
        arr[2] = 36;
        arr[3] = 27;
        arr[4] = 51;
        Scanner sc = new Scanner(System.in);
        int same = sc.nextInt();
        int count = 0;
        for (int i = 0; i < 5; i++) {
            if(arr[i]==same){
                count++;
            }
        }
        System.out.println(count);
    }
}
