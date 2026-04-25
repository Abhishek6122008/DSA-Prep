package basics.Strings;

public class Strings_Builds {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);
        //chatracter at index 0
        System.out.println(sb.charAt(0));
        //set character at index 0
        sb.setCharAt(0,'P');
        System.out.println(sb);

    }
}
