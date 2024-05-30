package queue.priorityqueue;
import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;
public class BuiltInPQ {
    
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        pq.add(10);
        pq.add(5);
        pq.add(15);
        pq.add(-1);
        pq.add(6);
        pq.add(1);

        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }
    }
}
