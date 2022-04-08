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

    public void add(int item) {

        root = addHelper(root, item);
    }

    public Node addHelper(Node root, int item) {

        if(root == null) {
            Node node = new Node(item);
            root = node;
        }
        if(root.data > item) {
            root.left = addHelper(root.left, item);
        }
        if(root.left == null && root.right != null) {
            return root.left;
        }
        if(root.left != null && root.right == null) {
            return root.right;
        }

        return root;
    }

    public static void preOrder(Node root) {
        if(root == null) {
            return;
        }
        System.out.print(root.data + ", ");
        preOrder(root.left);
        preOrder(root.right);

    }

}
