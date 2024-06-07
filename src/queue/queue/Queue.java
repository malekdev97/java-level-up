package queue.queue;

public class Queue {
    Node front;
    Node rear;

    public Queue() {
        this.front = null;
        this.rear = null;
    }

    // Method to add an element to the queue
    void enqueue(int data) {
        Node newNode = new Node(data);

        if (this.rear == null) {
            this.front = newNode;
            this.rear = newNode;
            return;
        }

        this.rear.next = newNode;
        this.rear = newNode;
    }

    // Method to remove an element from the queue
    void dequeue() {
        if (this.front != null) {

        Node temp = this.front;
        this.front = this.front.next;

        if (this.front == null)
            this.rear = null;
        }
    } 

}