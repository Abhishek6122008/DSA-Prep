package Kumar_K.MainCourse.Hashing;

import java.util.Arrays;
import java.util.Scanner;

//given array of size n and only 0s in the array
//Q = 1,5 and 3,5
// answer = [1,1,1,1,1] and [1,1,2,2,2]
public class Class24 {
    static void main(String[] args) {
        int[] b = {0,0,0,0,0};
        b = Arrays.copyOf(b,b.length+1);
        int n = b.length;
//        bruteforce
//        Scanner sc = new Scanner(System.in);
//        int q = sc.nextInt();
//        while(q-- > 0){
//            int l =sc.nextInt();
//            int r = sc.nextInt();
//            int i = l;
//            while(i<=r){
//                b[i] = b[i]+1;
//                i = i+1;
//            }
//            q--;
//        }
        //Optimal Prefix sum concept
        //Trick :
        //write 1 at l and -1 at r+1 position for each q
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        while (q-- > 0) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            b[l] += 1;
            b[r + 1] -= 1;
        }
        for (int i = 1; i < b.length; i++) {
            b[i] += b[i - 1];
        }
        for (int i = 0; i < b.length - 1; i++) {
            System.out.println(b[i]);
        }
    }
}
