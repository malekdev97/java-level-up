package recursion;

import java.util.Stack;
class Node {
  int data;
  Node left, right;
  public Node(int item) {
    data = item;
    left = right = null;
  }
}
class BTR {
  Node root;
  public BTR(Node root) {
    this.root = root;
  }
  // Pre-order traverse
  public void print() {
    if (this.root == null) {
      System.out.println("Tree is empty");
      return;
    }
    Stack<Node> stack = new Stack<Node>();
    stack.push(this.root);
    while (!stack.isEmpty()) {
      Node currentNode = stack.pop();
      System.out.print(" " + currentNode.data);
      if (currentNode.right != null) {
        stack.push(currentNode.right);
      }
      if (currentNode.left != null) {
        stack.push(currentNode.left);
      }
    }
    return;
  }
  public Node search(int target) {
    if (this.root == null) {
      System.out.println("Tree is empty");
      return null;
    }
    Stack<Node> stack = new Stack<Node>();
    stack.push(this.root);
    while (!stack.isEmpty()) {
      Node currentNode = stack.pop();
      if (currentNode.data == target) {
        return currentNode;
      }
      if (currentNode.right != null) {
        stack.push(currentNode.right);
      }
      if (currentNode.left != null) {
        stack.push(currentNode.left);
      }
    }
    return null;
  }
  public void addRight(int parentData, int newNodeData) {
    Node newNode = new Node(newNodeData);
    Node parent = search(parentData);
    if (parent != null) {
      if (parent.right == null) {
        parent.right = newNode;
        System.out.println(newNodeData + " child added successfully");
      } else {
        System.out.println("parent already has a right child");
        return;
      }
    } else {
      System.out.println(parentData + " parent not fount");
    }
  }
  public void addLeft(int parentData, int newNodeData) {
    Node newNode = new Node(newNodeData);
    Node parent = search(parentData);
    if (parent != null) {
      if (parent.left == null) {
        parent.left = newNode;
        System.out.println(newNodeData + " child added successfully");
      } else {
        System.out.println("parent already has a right child");
        return;
      }
    } else {
      System.out.println(parentData + " parent not fount");
    }
  }
  public void printRec(Node node){
    if(node == null){
      return;
    }
    System.out.println(node.data);
    printRec(node.left);
    printRec(node.right);
  }
  public static void main(String[] args) {
    // Root creation
    BTR tree = new BTR(new Node(1));
    // Add children to root
    tree.addLeft(1, 2);
    tree.addRight(1, 3);
    // Add children to left child
    tree.addLeft(2, 4);
    tree.addRight(2, 5);
    // Add children to right child
    tree.addLeft(3, 6);
    tree.addRight(3, 7);
    tree.addLeft(4, 8);
    tree.addRight(5, 9);
    System.out.print("Print tree values");
    tree.printRec(tree.root);
  }
}