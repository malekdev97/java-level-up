package Tree;

public class BinaryTree {

    public Node root;

    public void additem(int data)
    {
        Node ptr = root;
        Node parent = null;
        Node node = new Node();
        node.data = data;
        if(root == null)
        {
            root = node;
            return;
        }

        while(ptr != null)
        {

            parent=ptr;
            if(node.data <= ptr.data)
                ptr= ptr.left;
            else
                ptr =ptr.right;
        }

        if(node.data <=parent.data)
            parent.left = node;
        else
            parent.right = node;
    }

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

    // output PostOrder left, right, root
    public static void postorder(Node node)
    {
        if(node != null) {
            postorder(node.left);
            postorder(node.right);
            System.out.print(" "+ node.data + ",");
        }
    }

    // output PreOrder root, left, right
    public static void preOrder(Node node)
    {
        if(node != null) {

            System.out.println(" "+ node.data +",");
            preOrder(node.left);
            preOrder(node.right);
        }
    }
    // output InOrder left, root, right


}
