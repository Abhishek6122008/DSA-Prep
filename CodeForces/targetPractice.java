import java.util.*;
public class targetPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            char[][] arr = new char[10][10];
            for (int i = 0; i < 10; i++) {
                String s = sc.next();
                for (int j = 0; j < 10; j++) {
                    arr[i][j] = s.charAt(j);
                }
            }
            int points = 0;
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    if(arr[i][j]=='X'){
                        if((i>3&&i<6)&&(j>3&&j<6)){
                            points+=5;
                        }else if((i>2&&i<7)&&(j>2&&j<7)){
                            points+=4;
                        }else if((i>1&&i<8)&&(j>1&&j<8)){
                            points+=3;
                        }else if((i>0&&i<9)&&(j>0&&j<9)){
                            points+=2;
                        }else{
                            points+=1;
                        }
                    }
                }
            }
            System.out.println(points);

        }
    }
}

