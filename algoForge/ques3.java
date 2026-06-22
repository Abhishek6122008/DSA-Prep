package algoForge;

import java.util.Scanner;

public class ques3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if(x>=90){
            System.out.println("Excellent");
        }else if(x>80&&x<90){
            System.out.println("Very Good");
        }else if(x>60&&x<80){
            System.out.println("Good");
        }else if(x>45&&x<60){
            System.out.println("Average");
        }else if(x>33&&x<45){
            System.out.println("Can do better");
        }else if(x<35){
            System.out.println("Work hard");
        }
    }
}
