package Tree;

class Tree
{
    /*
    class List.Node
    {
        int value;
        List.Node left,right;
        List.Node(int value)
        {
            this.value=value;
            left=right=null;
        }
    }
    static List.Node root; //root of the tree
    //Constructor to intialize root with null
    Tree()
    {
        root=null;
    }
    //preorder Traversal of binary tree
    public static void preorder(List.Node node)
    {
        if(node==null)
            return ;
        System.out.print(" "+node.value+",");
        preorder(node.left);
        preorder(node.right);
    }

    public static void postorder(List.Node node)
    {
        if(node != null) {
            postorder(node.left);
            postorder(node.right);
            System.out.print(" "+ node.value + ",");
        }
    }
    public void insert(int item)
    {
        root =insertNode(root,item); //calling insert List.Node() method
    }
    public List.Node insertNode(List.Node root, int item)
    {
        if(root==null)     //if root is null create a new List.Node
        {
            root=new List.Node(item);
            return root;
        }
        if(item<root.value)  //if item is less than the current value then traverse left subtree
            root.left= insertNode(root.left,item);
        else if(item>root.value) //if item is greater than the current value then traverse the right subtree
            root.right=insertNode(root.right,item);
        return root;
    }
    public void delete(Integer data) {

        deleteNode(this.root, data);
    }

    private List.Node deleteNode(List.Node root, Integer data) {

        if(root == null) return root;

        if(data < root.getData()) {
            root.setLeft(deleteNode(root.getLeft(), data));
        } else if(data > root.getData()) {
            root.setRight(deleteNode(root.getRight(), data));
        } else {
            // node with no leaf nodes
            if(root.getLeft() == null && root.getRight() == null) {
                System.out.println("deleting "+data);
                return null;
            } else if(root.getLeft() == null) {
                // node with one node (no left node)
                System.out.println("deleting "+data);
                return root.getRight();
            } else if(root.getRight() == null) {
                // node with one node (no right node)
                System.out.println("deleting "+data);
                return root.getLeft();
            } else {
                // nodes with two nodes
                // search for min number in right sub tree
                Integer minValue = minValue(root.getRight());
                root.setData(minValue);
                root.setRight(deleteNode(root.getRight(), minValue));
                System.out.println("deleting "+data);
            }
        }

        return root;
    }


    public static void main(String[] args)
    {
        Tree tree=new Tree();
        // inserting node one by one in Binary Search Tree.Tree
        tree.insert(30);
        tree.insert(50);
        tree.insert(45);
        tree.insert(55);
        tree.insert(20);
        tree.insert(15);
        tree.insert(25);

        //List.Node rootNodeRes = deleteNode(tree, 40);

        //print preorder traversal of binary tree
        //Tree.preorder(Tree.root);
        //Tree.postorder(Tree.root);
    }

     */
}