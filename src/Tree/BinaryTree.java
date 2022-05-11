package Tree;

public class BinaryTree {

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
    public static void postorder(Node node)
    {
        if(node != null) {
            postorder(node.left);
            postorder(node.right);
            System.out.print(" "+ node.data + ",");
        }
    }

    //  PreOrder root, left, right
    public static void preOrder(Node node)
    {
        if(node != null) {

            System.out.println(" "+ node.data +",");
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
            System.out.println(" "+ node.data +" ");
            inOrder(node.left);
        }
    }

}
