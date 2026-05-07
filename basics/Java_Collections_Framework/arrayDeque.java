package basics.Java_Collections_Framework;

import java.util.ArrayDeque;

public class arrayDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> adeq= new ArrayDeque<>();
        adeq.offer(23);
        adeq.offerFirst(12);
        adeq.offerLast(123);
        System.out.println(adeq);
    }
}
