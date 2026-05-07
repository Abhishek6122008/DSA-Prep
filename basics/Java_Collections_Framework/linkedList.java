package basics.Java_Collections_Framework;

import java.util.LinkedList;
import java.util.Queue;

public class linkedList {
    public static void main(String[] args) {
        Queue<Integer> qu = new LinkedList<>();
        qu.offer(12);
        qu.offer(14);
        qu.offer(1);
        qu.offer(15);
        qu.offer(19);
        System.out.println(qu);
        qu.poll();
        System.out.println(qu);
        System.out.println(qu.peek());
    }
}
