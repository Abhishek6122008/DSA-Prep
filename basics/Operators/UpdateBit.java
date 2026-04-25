package basics.Operators;

public class UpdateBit {
    public static void main(String[] args) {
        int n = 5;
        int pos = 1;
        int oper = 1;
        int bitMask = 1<<pos;
        int newNumber = bitMask | n;
    }
}
