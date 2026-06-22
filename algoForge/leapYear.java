package algoForge;

import java.util.Scanner;

public class leapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        String leapYear = "false";
        if (x % 4 == 0) {
            if (x % 100 == 0) {
                if (x % 400 == 0) {
                    leapYear = "true";
                } else {
                    leapYear = "false";
                }
            } else {
                leapYear = "true";
            }
        } else {
            leapYear = "false";
        }
        System.out.println(leapYear);
    }
}