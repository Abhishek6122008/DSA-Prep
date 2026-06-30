package basics.RecursionByStrivers;

public class pallindromeFunctional {
    public static boolean isPalindrome(int i, String s, int n){
        if(i>=n) return true;
        if(s.charAt(i)!=s.charAt(n)){
            return false;
        }
        return isPalindrome(i+1,s,n-1);
    }
    public static void main(String[] args) {
        String s = "madam";
        System.out.println(isPalindrome(0,s,s.length()-1));
    }
}
