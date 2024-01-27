package linkedlist;

public class LinkedList <T>{

    Node Head;

    public LinkedList() {
        Head = null;
    }

    // big O(1)
    public void addFirst(T data) {
        Node newNode = new Node(data);

        if(Head == null) {
            Head = newNode;
        } else {
            newNode.next = Head;
            Head = newNode;
        }
    }

    // big O(n)
    public void addLast(T data) {
        Node newNode = new Node(data);

        if(Head == null) {
            Head = newNode;
        } else {
            Node temp = Head;
            while(temp.next != null) {
                temp = temp.next;
            }

            temp.next = newNode;
        }
    }

    // big O(1)
    public void deleteFirst() {
        if(Head == null) {
            System.out.println("List is empty");
        } else {
            Head = Head.next;
        }
    }

    // big O(n)
    public void deleteLast() {
        if(Head == null) {
            System.out.println("List is empty");
        } else {
            Node temp = Head;
            while(temp.next.next != null) {
                temp = temp.next;
            }

            temp.next = null;
        }
    }
}
