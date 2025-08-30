package priorityqueue;

public class PriorityQueue {

    // Node class to represent each element in the priority queue 
    private class Node {
        int value; // is the priority value
        Node next; 

        Node(int value) {
            this.value = value;
            this.next = null;
        }
    }

    private Node head = null;

    // Add an element and maintain the order of the elements in the priority queue
    public void add(int value) {
        Node newNode = new Node(value);
        
        if(head == null) {
            head = newNode;
            return;
        }
        // if the priority queue is empty or the new element has the highest priority
        if (head.value > value) {
            newNode.next = head;
            head = newNode;
        } else { // if the new element has lower priority than the head
            Node current = head;
            while (current.next != null && current.next.value < value) {
                current = current.next;
            }
            // finally add the new element
            newNode.next = current.next;
            current.next = newNode;
        }
    }

    // Dequeue the element which are the front/head of the priority queue
    public int remove() {

        // if the priority queue is not empty
        if (head != null) {
            int value = head.value;
            head = head.next;
            return value;
        } else {
            throw new RuntimeException("Queue is empty");
        }
    }

    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue();
        pq.add(3);
        pq.add(1);
        pq.add(2);
        System.out.println(pq.remove()); // 1
        System.out.println(pq.remove()); // 2
        System.out.println(pq.remove()); // 3
    }
}