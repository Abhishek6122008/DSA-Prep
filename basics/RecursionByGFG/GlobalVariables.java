package basics.RecursionByGFG;

public class GlobalVariables {
    static int x = 10;
    public static void main(String[] args) {
        fun();
        System.out.println(x);
    }
    public static void fun(){
        x = 20;
    }
}
