package Leetcode;

public class stringtoInteger {
    public static void main(String[] args) {
        String s = "-1337c0d3";
        s = s.replace(" ", "");
        char[] arr = s.toCharArray();
        boolean neg = false;
        int y = 0;
        for (int i = 0; i <s.length() ; i++) {
            if(Character.isDigit(arr[i])){
                char x = arr[i];
                int num = x - '0';
                y = y + num;
                y = y *10;
            } else if (arr[1]=='-'){
                neg = true;
            }
            else{
                break;
            }
        }
        y = y/10;
        if(neg==true){
            System.out.print(0-y);
        }
    }
}

