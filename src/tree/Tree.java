package tree;

import java.util.LinkedList;
import java.util.Queue;

class Tree
{
    public class Node {


        int data;
        Node right = null;
        Node left = null;

        public Node(){
            this.data = data;
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

    // delete node from tree
    static void deleteDeepest(Node root,
                              Node delNode)
    {
        Queue<Node> q = new LinkedList<Node>();
        q.add(root);

        Node temp = null;

        // Do level order traversal until last node
        while (!q.isEmpty())
        {
            temp = q.peek();
            q.remove();

            if (temp == delNode)
            {
                temp = null;
                return;

            }
            if (temp.right!=null)
            {
                if (temp.right == delNode)
                {
                    temp.right = null;
                    return;
                }
                else
                    q.add(temp.right);
            }

            if (temp.left != null)
            {
                if (temp.left == delNode)
                {
                    temp.left = null;
                    return;
                }
                else
                    q.add(temp.left);
            }
        }
    }

    // Function to delete given element
// in binary tree
    static void delete(Node root, int data)
    {
        if (root == null)
            return;

        if (root.left == null &&
                root.right == null)
        {
            if (root.data == data)
            {
                root=null;
                return;
            }
            else
                return;
        }

        Queue<Node> q = new LinkedList<Node>();
        q.add(root);
        Node temp = null, dataNode = null;

        // Do level order traversal until
        // we find data and last node.
        while (!q.isEmpty())
        {
            temp = q.peek();
            q.remove();

            if (temp.data == data)
                dataNode = temp;

            if (temp.left != null)
                q.add(temp.left);

            if (temp.right != null)
                q.add(temp.right);
        }

        if (dataNode != null)
        {
            int x = temp.data;
            deleteDeepest(root, temp);
            dataNode.data = x;
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

        tree.delete(tree.root, 25);

        System.out.println("\nPrint PreOrder \n Root, Left, Right");
        preOrder(tree.root);

        System.out.println("\nPrint PostOrder \n Left, Right, Root");
        postOrder(tree.root);

        System.out.println("\nPrint InOrder \n Left, Root, Right");
        inOrder(tree.root);

    }


}