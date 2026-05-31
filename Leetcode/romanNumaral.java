package Leetcode;

public class romanNumaral {
    public static void main(String[] args) {
        String s = "MCMXCIV";
        char[] arr = s.toCharArray();
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 'M') {
                if ((i > 0) && (arr[i - 1] == 'C')) {
                    sum += 800;
                } else {
                    sum += 1000;
                }
            } else if (arr[i] == 'D') {
                if ((i > 0) && (arr[i - 1] == 'C')) {
                    sum += 300;
                } else {
                    sum += 500;
                }
            } else if (arr[i] == 'C') {
                if ((i > 0) && (arr[i - 1] == 'X')) {
                    sum += 80;
                } else {
                    sum += 100;
                }
            } else if (arr[i] == 'L') {
                if ((i > 0) && (arr[i - 1] == 'X')) {
                    sum += 30;
                } else {
                    sum += 50;
                }
            } else if (arr[i] == 'X') {
                if ((i > 0) && (arr[i - 1] == 'I')) {
                    sum += 8;
                } else {
                    sum += 10;
                }
            } else if (arr[i] == 'V') {
                if ((i > 0) && (arr[i - 1] == 'I')) {
                    sum += 3;
                } else {
                    sum += 5;
                }
            } else {
                sum += 1;
            }
        }

        System.out.println(sum);
    }
}