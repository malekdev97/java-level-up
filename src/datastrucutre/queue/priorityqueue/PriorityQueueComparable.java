package queue.priorityqueue;

public class PriorityQueueComparable <T extends Comparable<T>> {
    private class Node {
        T data;
        Node next;

        public Node(T data) {
            this.data = data;
        }
    }

    private Node head = null;

    public void enqueue(T item) {
        Node newNode = new Node(item);

        if (head == null || item.compareTo(head.data) > 0) {
            newNode.next = head;
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null && item.compareTo(current.next.data) < 0) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
        }
    }

    public T dequeue() {
        if (head == null) {
            throw new RuntimeException("Queue is empty");
        }

        T data = head.data;
        head = head.next;
        return data;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public static void main(String[] args) {
        PriorityQueueComparable<Integer> pq = new PriorityQueueComparable<>();
        pq.enqueue(10);
        pq.enqueue(5);
        pq.enqueue(15);
        pq.enqueue(3);
        pq.enqueue(7);
        pq.enqueue(12);

        while (!pq.isEmpty()) {
            System.out.println(pq.dequeue());
        }
    }
}