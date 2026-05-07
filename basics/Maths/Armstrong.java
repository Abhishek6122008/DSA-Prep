package basics.Maths;
import java.util.*;
public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp1 = n;
        int temp2 = 0;
        int temp3 = n;
        int size = 0;
        while(temp1>0){
            temp1/=10;
            size++;
        }
        while(n>0){
            temp2 += (int)Math.pow(n % 10, size);
            n/=10;
        }
        if(temp2==temp3){
            System.out.println(temp3 + " is an armstrong number");
        }else{
            System.out.println(temp3+" is not an armstrong number");
        }
    }
}
