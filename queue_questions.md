
Q1 How many pointer does queue has?
A. 1
B. 2
C. 3
D. 4

Q2 The operations that can add elements to a queue are called?
A. Insertion
B. Pop
C. Enqueue
D. Add

Q3 The operations that can remove elements from a queue are called?
A. Dequeue
B. Push
C. DeleteLast
D. Remove

Q4 Which of the following is not a queue implementation?
A. Array
B. Linked List
C. Stack
D. Circular Queue

Q5 Which of the following is not a queue operation?
A. Enqueue
B. Dequeue
C. Push
D. Peek

Q7 ATM Line is an example of?
A. Queue
B. Stack
C. Linked List
D. Array

Q8 Queue is an algorithm that sorts elements based on their value?
A. True
B. False

Q9 The Data Structure that follows the FIFO principle is?
A. Queue
B. Stack
C. Graph
D. Tree

Q10 Which of the following is not a queue application?
A. CPU Scheduling
B. Disk Scheduling
C. Printer Scheduling
D. None of the above

Q11 A coffee shop line is an example of?
A. Stack
B. Tree
C. Queue
D. Recursion

Q12 Which one is Queue attribute?
A. Front
B. Middle
C. Dequ
D. First

Q13 The defintion of Deque Data Structure is?
A. Double Linked Queue
C. Double Ended Queue
D. Circular Linked List
E. None of the above

Q14 A linear list of elements in which deletion can be done from one end and insertion can take place only at the other end is known as _____________
A. Circular Linked List
B. Stack
C. Deque
D. Queue

Q15 What is the output of the following code?
    
    ```java
    Queue q = new Queue();
    q.enqueue("90");
    q.enqueue("70");
    q.enqueue("80");
    q.dequeue();
    q.enqueue("100");
    q.dequeue();

    System.out.println(q.getFront());
    System.out.println(q.getRear());
    ```
A. 90, 70
B. 70. 80
C. 80, 100
D. 100, 80

Q16 What is the output of the following code?
    
    ```java
    Queue q = new Queue();
    q.enqueue("Python");
    q.dequeue();
    q.enqueue("Java");
    q.enqueue("PHP");
    q.enqueue("Ruby");
    q.dequeue();

    System.out.println(q.getFront());
    ```

A. Java
B. Python
C. Ruby
D. PHP

Q17 The following code is an example of?
    
    ```java
    public void myFun(String data) {
        Node node = new Node(data);
        if (front == null) {
            front = node;
            rear = node;
        } else {
            rear.setNext(node);
            rear = node;
        }
    }
    ```

A. Pop
B. Dequeue
C. Enqueue
D. Peek

Q18 The innsertion operation in a queue is at the ___________ end and the deletion operation is at the ___________ end.
A. Front, Rear
B. Rear, Front
C. Tail, End
D. Top, Front