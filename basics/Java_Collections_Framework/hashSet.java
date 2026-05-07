package basics.Java_Collections_Framework;

import java.util.HashSet;

public class hashSet {
    public static void main(String[] args) {
        HashSet<Integer> hsh = new HashSet<>();
        hsh.add(23);
        hsh.add(27);
        hsh.add(21);
        hsh.add(22);
        hsh.add(42);
        System.out.println(hsh);
    }
}
