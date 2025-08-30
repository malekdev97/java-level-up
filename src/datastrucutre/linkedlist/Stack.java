package linkedlist;

class StackLinkedList {
    private Node top; // Reference to the top node in the stack
    private int size; // Size of the stack

    public StackLinkedList() {
        top = null; // Initialize the top node to null (empty stack)
        size = 0; // Initialize the size to 0
    }

    // add 
    public void push(int value) {
        // 1- create node 
        Node newNode = new Node(value);
        // 2- link node to stack 
        newNode.next = top; // Set the next node of the new node to the current top node
        // 3- update pointer 
        top = newNode; // Update the top node to the new node
        size++; // Increment the size
    }

    public void pop() {
        // 1- is not empty 
        if (top == null) {
            System.out.println("Stack Underflow: Cannot pop element, stack is empty.");
            return;
        }
        // 2- update poninter 
        top = top.next; // Move the top reference to the next node
        size--; // Decrement the size
    }

    public int top() {
        if (top == null) {
            System.out.println("Stack is empty.");
            return -1; // Return a default value indicating an empty stack
        }
        return top.data; // Return the data of the top node
    }

    public boolean isEmpty() {
        return (top == null); // Check if the stack is empty
    }

    public int size() {
        return size; // Return the size of the stack
    }
}