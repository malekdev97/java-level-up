package queue.queue;

public class Queue {
    Node front;
    Node rear;

    public Queue() {
        this.front = null;
        this.rear = null;
    }

    // Method to add an element to the queue
    // add last 
    void enqueue(int data) {
        // 1- create node
        Node newNode = new Node(data);

       // queue is empty front rear = node 
        if (this.rear == null) {
            this.front = newNode;
            this.rear = newNode;
            return;
        }

        // add node to list 
        this.rear.next = newNode;
        this.rear = newNode;
    }

    // Method to remove an element from the queue
    void dequeue() {
        // queue is not empty 
        if (this.front != null) {

            // 1 update pointer 
        this.front = this.front.next;

        if (this.front == null)
            this.rear = null;
        }
    } 

}