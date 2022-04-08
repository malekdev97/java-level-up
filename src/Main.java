import Tree.*;

public class Main {

  public static void main(String[] args) {

    BinaryTree tree = new BinaryTree();
    tree.add(30);
    tree.add(20);
    tree.add(10);
    tree.add(25);
    tree.add(40);
    tree.add(35);
    tree.add(50);

    BinaryTree.preOrder(tree.root);

    tree.delete(tree.root, 10);

    BinaryTree.preOrder(tree.root);

  }
}