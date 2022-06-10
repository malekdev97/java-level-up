package List;

public class CircularQueue {

    int size;
    int rear;
    int front;

    int [] queue;

    CircularQueue(int size) {
        this.size = size;
        queue = new int[size];
        rear = -1;
        front = -1;
    }

    public boolean isFull() {
        if(front == 0 && rear == size -1) {
            return true;
        }
        if( front == rear +1) {
            return true;
        }
        return false;
    }

    boolean isEmpty() {
        if (front == -1)
            return true;
        else
            return false;
    }

    // Adding an element
    void enQueue(int element) {
        if (isFull()) {
            System.out.println("Queue is full");
        } else {
            if (front == -1)
                front = 0;
            rear = (rear + 1) % size;
            queue[rear] = element;
            System.out.println("Inserted " + element);
        }
    }

    // Removing an element
    int deQueue() {
        int element;
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return (-1);
        } else {
            element = queue[front];
            if (front == rear) {
                front = -1;
                rear = -1;
            } /* Q has only one element, so we reset the queue after deleting it. */
            else {
                front = (front + 1) % size;
            }
            return (element);
        }
    }

    void display() {
        /* Function to display status of Circular Queue */
        int i;
        if (isEmpty()) {
            System.out.println("Empty Queue");
        } else {
            System.out.println("Front -> " + front);
            System.out.println("Items -> ");
            for (i = front; i != rear; i = (i + 1) % size)
                System.out.print(queue[i] + " ");
            System.out.println(queue[i]);
            System.out.println("Rear -> " + rear);
        }
    }
}
