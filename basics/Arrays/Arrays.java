package basics.Arrays;
import java.util.*;

public class Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of items you want in array: ");
        int size = sc.nextInt();

        int[] numbers = new int[size];

        for(int i = 0; i < size; i++){
            System.out.print("Enter element " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }

        System.out.print("Enter number to search: ");
        int same = sc.nextInt();

        System.out.println("Index positions where the number is found:");

        for(int i = 0; i < size; i++){
            if(numbers[i] == same){
                System.out.println(i);
            }
        }

        sc.close();
    }
}