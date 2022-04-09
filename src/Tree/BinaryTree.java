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

    public void insert(int item)
    {
        root =insertNode(root,item);
    }
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

    public static void postorder(Node node)
    {
        if(node != null) {
            postorder(node.left);
            postorder(node.right);
            System.out.print(" "+ node.data + ",");
        }
    }

}
