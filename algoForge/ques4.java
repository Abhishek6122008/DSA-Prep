package algoForge;

import java.util.Scanner;

public class ques4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if(x>0){
            System.out.println("number is possitive");
        } else if (x==0) {
            System.out.println("number is neither possitive nor negative");

        } else{
            System.out.println("number is negative");
        }
    }
}
