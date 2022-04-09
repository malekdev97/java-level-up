import Tree.*;

public class Main {

  public static void main(String[] args) {

    BinaryTree tree = new BinaryTree();
    tree.insert(30);
    tree.insert(20);
    tree.insert(25);
    tree.insert(40);
    tree.insert(35);
    tree.insert(50);

    BinaryTree.postorder(tree.root);


  }
}