package linkedlist;

class LinkedList {
    class Node {
        int data;
        Node next;
        Node prev;
        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    Node head;
    Node tail;

    LinkedList() {
        this.head = null;
        this.tail = null;
    }

    void addLast(int data) {
        // 1  
        Node newNode = new Node(data);
        // 2 
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            // 2 
            tail.next = newNode;
            newNode.prev = tail;
            // 3
            tail = newNode;
            
        }
    }

    void addFirst(int data) {
        // 1
        Node newNode = new Node(data);
        // 3
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            // 2
            newNode.next = head;
            head.prev = newNode;
            // 3
            head = newNode;
        }
    }

     void removeFirst() {
        if (head == null) {
            System.out.println("List is empty");
        } else {
            head = head.next;
            head.prev = null;
        }

    }

    void removeLast() {
        if (head == null) {
            System.out.println("List is empty");
        } else {
            tail = tail.prev;
            tail.next = null;
        }
    }


    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addLast(10);
        list.addLast(20);
        list.addFirst(30);
        list.display();
    }
}