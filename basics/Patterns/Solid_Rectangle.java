package basics.Patterns;

public class Solid_Rectangle {
    public static void main(String args[]){
//        String x = "*****";
//        for(int i = 0; i<4;i++){
//            System.out.println(x);
        int n = 4;
        int m = 5;
        for (int i = 1;i<=n;i++){
            for(int j = 1; j<=m;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
