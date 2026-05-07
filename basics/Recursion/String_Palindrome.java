package basics.Recursion;

public class String_Palindrome {
    public static void main(String[] args) {
        String s = "Hello!! Bro 123 :)";
        s = s.replaceAll("[^a-zA-Z]", "").toLowerCase();
        System.out.println(s);
        int n = s.length();
        int j =n-1;
        boolean isPalindrome = true;
        for(int i = 0; i <j; i++) {

            if(s.charAt(i)==s.charAt(j)){
                j--;
                continue;
            }else{
                isPalindrome = false;
                break;
            }
        }System.out.println(isPalindrome);
    }
}
