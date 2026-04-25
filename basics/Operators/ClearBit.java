package basics.Operators;

public class ClearBit {
    public static void main(String[] args) {
        int n = 5;
        int pos = 2;
        int BitMask = 1<<pos;
        int notBitMask = ~(BitMask);
        int newNumber = notBitMask & n;
        System.out.println(newNumber);
    }
}
