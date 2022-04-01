

class TreeBinary
{
    class Node
    {
        int value;
        Node left,right;
        Node(int value)
        {
            this.value=value;
            left=right=null;
        }
    }
    Node root; //root of the tree
    //Constructor to intialize root with null
    TreeBinary()
    {
        root=null;
    }
    //preorder Traversal of binary tree
    public static void preorder(Node ptr)
    {
        if(ptr==null)
            return ;
        System.out.print(ptr.value+" ");
        preorder(ptr.left);
        preorder(ptr.right);
    }
    public void insert(int item)
    {
        root =insertNode(root,item); //calling inserNode() method
    }
    public Node insertNode(Node root,int item)
    {
        if(root==null)     //if root is null create a new Node
        {
            root=new Node(item);
            return root;
        }
        if(item<root.value)  //if item is less than the current value then traverse left subtree
            root.left= insertNode(root.left,item);
        else if(item>root.value) //if item is greater than the cureent value then traverse the right subtree
            root.right=insertNode(root.right,item);
        return root;
    }
    public static void main(String[] args)
    {
        TreeBinary tree=new TreeBinary();
        /*inserting node one by one in Binary Search Tree */
        TreeBinary.insert(30);
        TreeBinary.insert(50);
        TreeBinary.insert(55);
        TreeBinary.insert(45);
        TreeBinary.insert(10);
        TreeBinary.insert(5);
        TreeBinary.insert(15);
        TreeBinary.insert(12);
        //print preorder traversal of binary tree
        TreeBinary.preorder(TreeBinary.root);
    }
}