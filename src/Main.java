
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import Tree.BinaryTree;
import Tree.BinaryTree;

import static Tree.BinaryTree.inOrder;

public class Main {

  public static void main(String[] args)
          throws IOException {

    BinaryTree tree=new BinaryTree();
    // inserting node one by one in Binary Search Tree.Tree
    tree.insert(30);
    tree.insert(50);
    tree.insert(45);
    tree.insert(55);
    tree.insert(20);
    tree.insert(15);
    tree.insert(25);

     inOrder(tree.root);
  }


}
