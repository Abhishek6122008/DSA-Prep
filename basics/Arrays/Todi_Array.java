package basics.Arrays;

import java.util.*;
public class Todi_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int [][] numbers= new int[rows][cols];
        for(int i = 0; i<rows;i++){
            for(int j = 0;j<cols;j++){
                System.out.println("enter what u want to type for array");
                numbers[i][j]= sc.nextInt();
            }
        }
        System.out.println("pls tell what number u wish to find");
        int  find = sc.nextInt();
        for(int i = 0; i<rows;i++){
            for(int j = 0;j<cols;j++){
                if(numbers[i][j]== find){
                    System.out.println(i+" "+j);
                }
            }
        }
    }
}
