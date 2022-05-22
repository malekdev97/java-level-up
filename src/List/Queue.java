package List;

/**
 * First in First Out
 */
public class Queue {

    public int size = 5;

    public int [] items = new int[size];
    public int rear;
    public int front;

    public Queue() {
        this.rear = -1;
        this.front = -1;
    }

    boolean isFull() {
        if(front == 0 && rear == size -1) {
            return true;
        }
        return false;
    }

    boolean isEmpty() {
        if(front == -1) {
            return true;
        }
        else {
            return false;
        }

    }

    /**
     * Add Node
     * @param item
     */
    public void enqueue(int item) {
        if(isFull()) {
            System.out.println("Queue is full");
        }

        else {
            if(isEmpty()){
                front = 0;
            }

            rear++;
            items[rear] = item;
            System.out.println("Inserted: "+ item);
        }
    }

    /**
     * Delete Node
     * @return
     */
    public int dequeue() {
        int item ;
        if(isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }
        else {
            item = items[front];
            if(front >= rear) {
                front = -1;
                rear = -1;
            }
            else {
                front++;
            }
            System.out.println("Dequeue: "+ item);
            return(item);
        }
    }

    public void display() {
        int i;
        if(isEmpty()) {
            System.out.println("Empty Queue");
        }
        else {
            System.out.println("\nFront index: "+ front);
            System.out.println("Items: ");

            for (i = front; i<= rear; i++) {
                System.out.println(items[i] + " ");
            }

            System.out.println("\n Rear index: "+ rear);
        }
    }


}
