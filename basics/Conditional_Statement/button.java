package basics.Conditional_Statement;
import java.util.*;
public class button {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();
        if(button==1){
            System.out.println("hello");
        } else if (button == 2) {
            System.out.println("namaste");
        }else {
            System.out.println("hi");
        }

    }
}
