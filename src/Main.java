import tree.BinaryTree;

public class Main{
  
  public static void main(String[] args) throws InterruptedException{  

    // this operations will retrive the first number on the right, 129 % 10 = 9
    // System.out.println(229 % 10);

    BinaryTree binaryTree = new BinaryTree();

    binaryTree.insert(10);

    binaryTree.insert(5);
    binaryTree.insert(15);
    binaryTree.insert(3);
    binaryTree.insert(7);
    binaryTree.insert(12);
    BinaryTree.insertNode(binaryTree.root, 12);

    binaryTree.inOrder(binaryTree.root);
    // countDown(10);
  } 

  // public static int countDown(int num) {
  //   if(num == 0) {
  //     return 0;
  //   } else {
  //     System.out.println(num);
  //     num = num - 1;
  //     return countDown(num);
  //   }
    
  // }


  // public static boolean isPrime(int n, int i) {
  //   if (n <= 2) {
  //     return (n == 2) ? true : false;
  //   }
  //   if (n % i == 0) {
  //     return false;
  //   }
  //   if (i * i > n) {
  //     return true;
  //   }
  //   return isPrime(n, i + 1);
  // }
}