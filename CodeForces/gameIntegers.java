import java.util.*;
public class gameIntegers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int x = n+1;
            int y = n-1;
            if(x%3==0){
                System.out.println("First");
            }else if(y%3==0){
                System.out.println("First");
            }else{
                System.out.println("Second");
            }
        }
    }
}

