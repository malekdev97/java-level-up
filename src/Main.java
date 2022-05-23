
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

public class Main {

  public static void main(String[] args)
          throws IOException {
  /**
    Queue queue = new Queue();

    queue.enqueue(1);
    queue.enqueue(2);
    queue.enqueue(3);
    queue.enqueue(4);
    queue.enqueue(5);

    queue.display();
 */

  int [] array = {6, 1 ,8 ,9, 5};

    //  call by refrence
      //bubbleSort(array);
      divideArray(array, 0 , array.length-1);
    System.out.println(Arrays.toString(array));
  }

}
