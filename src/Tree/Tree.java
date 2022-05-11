package Tree;

class Tree
{
    public class Node {

        int data;
        Node right = null;
        Node left = null;

        public Node(){

        }
        public Node(int item) {
            this.data = item;
        }

    }
    public Node root;
    // Add node by using Recursion
    public void insert(int item)
    {
        root = insertNode(root,item);
    }
    // Add helper
    public Node insertNode(Node root, int item)
    {
        if(root==null)
        {
            root= new Node(item);
            return root;
        }
        if(item<root.data)
            root.left= insertNode(root.left,item);
        else if(item>root.data)
            root.right=insertNode(root.right,item);
        return root;
    }

    //  PostOrder left, right, root
    public static void postOrder(Node node)
    {
        if(node != null) {
            postOrder(node.left);
            postOrder(node.right);
            System.out.print(" "+ node.data + ",");
        }
    }

    //  PreOrder root, left, right
    public static void preOrder(Node node)
    {
        if(node != null) {

            System.out.print(" "+ node.data +",");
            preOrder(node.left);
            preOrder(node.right);
        }
    }
    //  InOrder left, root, right
    public static void inOrder(Node node)
    {
        if(node != null)
        {
            inOrder(node.left);
            System.out.print(" "+ node.data +" ");
            inOrder(node.left);
        }
    }

    public static void main(String[] args)
    {
        // inserting node one by one in Binary Search Tree.Tree
        Tree tree=new Tree();
        // inserting node one by one in Binary Search Tree.Tree
        tree.insert(30);
        tree.insert(50);
        tree.insert(45);
        tree.insert(55);
        tree.insert(20);
        tree.insert(15);
        tree.insert(25);

        System.out.println("\nPrint PreOrder \n Root, Left, Right");
        preOrder(tree.root);

        System.out.println("\nPrint PostOrder \n Left, Right, Root");
        postOrder(tree.root);

        System.out.println("\nPrint InOrder \n Left, Root, Right");
        inOrder(tree.root);

    }


}