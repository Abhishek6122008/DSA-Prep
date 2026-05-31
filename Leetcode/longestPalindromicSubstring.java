package Leetcode;

public class longestPalindromicSubstring {
    public static void main(String[] args) {
        String s = "babad";
        int n = s.length();
        int left=0;
        int right = n-1;
        String maxString = " ";
        for (int i = 1; i < n-1; i++) {
            left = i-1;
            right = i+1;
            if(s.charAt(i)==s.charAt(left)&&left>0){
                maxString=s.substring(left,i+1);
                left--;
                if(s.charAt(left)==s.charAt(right)){
                    maxString=s.substring(left,right+1);
                }

            }else if(s.charAt(i)==s.charAt(right)&&right<n-1){
                maxString=s.substring(i,right+1);
                right++;
                if(s.charAt(left)==s.charAt(right)){
                    maxString=s.substring(left,right+1);
                }

            }else if(s.charAt(left)==s.charAt(right)){
                maxString=s.substring(left,right+1);
            }


        }
        System.out.println(maxString);
    }
}
