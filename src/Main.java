
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.io.*;
import java.util.*;
import java.util.List;
import Tree.BinaryTree;
import Tree.BinaryTree;
import List.Queue;
import List.Node;
import sorting.*;

import static Tree.BinaryTree.inOrder;
import static sorting.Sort.bubbleSort;
import static sorting.Sort.divideArray;
import static sorting.Sort.inertionSort;
import List.CircularQueue;
import List.LinkedList;

public class Main {

  public static void main(String[] args)
<<<<<<< HEAD
          throws IOException {

      CircularQueue myList = new CircularQueue(5);

      myList.enQueue(10);
      myList.enQueue(20);
      myList.deQueue();
      myList.enQueue(30);

      myList.display();
    /*
=======
  {



         // throws IOException {
    /**
>>>>>>> 50de28c2052e93a0b4e183d524bca56c0968b652
      int input = 0;
      int sum = 0;
      int count = 0;
      Scanner scanner = new Scanner(System.in);


      while(true) {
          System.out.print("question number "+count+" enter : ");

          input = Integer.parseInt(scanner.nextLine());
          if(input == -1){
              break;
          }
          count++;
          sum = sum + input;
      }
      System.out.println("\nTotal question :"+count +"\nCorrect answers: "+sum+"\nWrong answers :"+(count - sum));
    */

      /**
        Queue queue = new Queue();

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);

        queue.display();
     */
    /*
    int [] array = {6, 1 ,8 ,9, 5};

    var queue = new CircularQueue(5);

      var res = queue.isEmpty();
      System.out.println(res);

    queue.enQueue(10);
    queue.enQueue(20);
    queue.enQueue(30);
    queue.deQueue();
    queue.enQueue(40);

    queue.display();
*/
    //  call by refrence
      //bubbleSort(array);
      // divideArray(array, 0 , array.length-1);
      //inertionSort(array);
        //System.out.println(Arrays.toString(array));
  }

}
