package Kumar_K.MainCourse.BitManipulation;
//left shift is adding one zero at the bottom
//left shift is basically multiplying decimal number by 2
//right shift is same by opposite
//end mai 0 == even
//end mai 1 == odd
//always itterate from 60 to 0
public class Session1 {
    public static void main(String[] args) {
        int g = 0b10101;
        for (int s = 0; s <= 5; s++) {
            int k = g << s;
            System.out.print("Shift " + s + ": ");
            for (int i = 31; i >= 0; i--) {
                if (((k >> i) & 1) == 1) {
                    System.out.print(1);
                } else {
                    System.out.print(0);
                }
            }
            System.out.println();
        }
    }
}
