package basics.Operators;

public class PrePostIncriment {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        int c = 10;
        int d = 0;
        b = a++;
        d = ++c;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}
