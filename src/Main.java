
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import Tree.BinaryTree;
import Tree.BinaryTree;
import List.Queue;
import List.Node;

import static Tree.BinaryTree.inOrder;

public class Main {

  public static void main(String[] args)
          throws IOException {

    Queue queue = new Queue();

    queue.enqueue(1);
    queue.enqueue(2);
    queue.enqueue(3);
    queue.enqueue(4);
    queue.enqueue(5);

    queue.display();
  }

}
