// Authors: Abdulmalik Abdullah
// Date: 01/01/2024

import List.Deque;

import java.util.Random;

public class Main {

  public static void main(String[] args) {
    // Your code here

    Random random = new Random();

    Deque deque = new Deque();

    deque.addLast(20);
    deque.addFirst(10);
    deque.addFirst(5);
    deque.addLast(30);

    deque.removeFirst();
    deque.removeLast();

    System.out.println(deque.front.data);
    System.out.println(deque.rear.data);

  }

}
