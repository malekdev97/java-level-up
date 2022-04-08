package Tree;

class Tree
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
    static Node root; //root of the tree
    //Constructor to intialize root with null
    Tree()
    {
        root=null;
    }
    //preorder Traversal of binary tree
    public static void preorder(Node node)
    {
        if(node==null)
            return ;
        System.out.print(" "+node.value+",");
        preorder(node.left);
        preorder(node.right);
    }

    public static void postorder(Node node)
    {
        if(node != null) {
            postorder(node.left);
            postorder(node.right);
            System.out.print(" "+ node.value + ",");
        }
    }
    public void insert(int item)
    {
        root =insertNode(root,item); //calling insert Node() method
    }
    public Node insertNode(Node root, int item)
    {
        if(root==null)     //if root is null create a new Node
        {
            root=new Node(item);
            return root;
        }
        if(item<root.value)  //if item is less than the current value then traverse left subtree
            root.left= insertNode(root.left,item);
        else if(item>root.value) //if item is greater than the current value then traverse the right subtree
            root.right=insertNode(root.right,item);
        return root;
    }

    public static void main(String[] args)
    {
        Tree tree=new Tree();
        /*inserting node one by one in Binary Search Tree.Tree */
        tree.insert(30);
        tree.insert(50);
        tree.insert(45);
        tree.insert(55);
        tree.insert(20);
        tree.insert(15);
        tree.insert(25);


        //print preorder traversal of binary tree
        Tree.preorder(Tree.root);
        //Tree.postorder(Tree.root);
    }
}