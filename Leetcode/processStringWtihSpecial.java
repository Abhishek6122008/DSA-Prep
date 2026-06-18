package Leetcode;
public class processStringWtihSpecial {
    public static void main(String[] args) {
        String s = "a#b%*";
        int k = 1;
        StringBuilder result = new StringBuilder();
        for (int i = 0; i <s.length(); i++) {
            char ch = s.charAt(i);
            if(Character.isLowerCase(ch)){
                result.append(ch);
            }
            else if(ch=='*'){
                if (result.length() > 0) {
                    result.deleteCharAt(result.length() - 1);
                }
            }
            else if(ch=='#'){
                result.append(result);
            }
            else if(ch=='%'){
                result.reverse();
            }
        }
        char res = result.charAt(k);
        System.out.println(res);
    }
}
