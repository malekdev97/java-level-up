package queue.priorityqueue;

public class SimplePriorityQueue {
    private class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    private Node head = null;

    public void add(int value) {
        Node newNode = new Node(value);
        if (head == null || head.value > value) {
            newNode.next = head;
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null && current.next.value < value) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
        }
    }

    public int remove() {
        if (head != null) {
            int value = head.value;
            head = head.next;
            return value;
        } else {
            throw new RuntimeException("Queue is empty");
        }
    }

    public static void main(String[] args) {
        SimplePriorityQueue pq = new SimplePriorityQueue();
        pq.add(3);
        pq.add(1);
        pq.add(2);
        System.out.println(pq.remove()); // 1
        System.out.println(pq.remove()); // 2
        System.out.println(pq.remove()); // 3
    }
}