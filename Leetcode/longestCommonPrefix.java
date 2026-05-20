package Leetcode;

public class longestCommonPrefix {
    public static void main(String[] args) {
        String strs[] = {"flower","flow","flight"};
        String ans = "";
        for (int i = 0; i <strs[0].length() ; i++) {
            char ch = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if(i>=strs[j].length()||strs[j].charAt(i)!=ch){
                    System.out.println(ans);
                    return;
                }
            }
            ans+=ch;
        }
    }
}
