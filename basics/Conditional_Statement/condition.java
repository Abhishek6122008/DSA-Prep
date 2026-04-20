package basics.Conditional_Statement;
import java.util.*;
public class condition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a>18){
            System.out.println("Adult");
        }else{
            System.out.println("Child");
        }
    }
}
