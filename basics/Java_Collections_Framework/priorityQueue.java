package basics.Java_Collections_Framework;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class priorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> priority = new PriorityQueue<>(Comparator.reverseOrder());
        priority.offer(23);
        priority.offer(24);
        priority.offer(27);
        priority.offer(298);
        System.out.println(priority);
        priority.poll();
        System.out.println(priority);
    }
}
