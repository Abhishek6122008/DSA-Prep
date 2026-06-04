package Leetcode;

public class totalWavinessNumber {
    public static void main(String[] args) {
        int num1 = 120;
        int num2 = 130;
        int total = 0;
        for (int i = num1; i <=num2; i++) {
            String s = String.valueOf(i);
            for (int j = 1; j <s.length()-1; j++) {
                int middle = s.charAt(j)-'0';
                int prev = s.charAt(j-1) - '0';
                int next = s.charAt(j+1) - '0' ;
                if((middle>prev&&middle>next)||(middle<prev&&middle<next)){
                    total++;
                }
            }
        }
        System.out.println(total);
    }
}
