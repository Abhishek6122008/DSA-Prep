package Leetcode;

public class removeParenthesis {
    public static void main(String[] args) {
        String s = "(()())(())";
        StringBuilder ans = new StringBuilder();
        int count = 0;
        for (int i = 0; i <s.length() ; i++) {
            if (s.charAt(i)=='('){
                if(count>0){
                    ans.append(s.charAt(i));
                }
                count++;
            }else{
                count--;
                if(count>0){
                    ans.append(s.charAt(i));
                }
            }

        }System.out.println(ans);
    }
}
