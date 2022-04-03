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


}
