package List;

public class Deque {

    public Node front;
    public Node rear;

    /** operations **/

    public void addFirst(int data) {
        Node node = new Node(data);

        if(front == null || rear == null) {
            front = rear = node;
            return;
        }

        node.next = front;
        front.previous = node;

        front = node;
    }

    public void addLast(int data) {
        Node node = new Node(data);

        if(front == null || rear == null) {
            front = rear = node;
            return;
        }

        node.previous = rear;
        rear.next = node;

        rear = node;

    }

    public void removeFirst() {
        if(front.next == null) {
            front = rear = null;
        }

        front = front.next;
        front.previous = null;

    }

    public void removeLast() {
        if(front.next == null) {
            front = rear = null;
        }

        rear = rear.previous;
        rear.next = null;
    }

}
