package avl;

public class AVL {

    public Node root;

    AVL(Node root) {
        this.root = root;
    }

    public void insert(int key) {
        root = insert(root, key);
    }

    private Node insert(Node node, int key) {
        if (node == null) {
            return new Node(key);
        }

        if (key < node.data) {
            node.left = insert(node.left, key);
        } else if (key > node.data) {
            node.right = insert(node.right, key);
        } else {
            // Duplicate key
            return node;
        }

        node.height = Math.max(height(node.left), height(node.right)) + 1;
        if (node.right == null && node.left == null)  
        node.height = 0;
        int balance = getBalance(node);

        if (balance > 1 && key < node.left.data) {
            return rightRotate(node);
        }

        if (balance < -1 && key > node.right.data) {
            return leftRotate(node);
        }

        if (balance > 1 && key > node.left.data) {
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }

        if (balance < -1 && key < node.right.data) {
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }

        return node;
    }

    private int height(Node node) {
        if (node == null) {
            return 0;
        }
        return node.height;
    }

    private int getBalance(Node node) {
        if (node == null) {
            return 0;
        }

        int leftHeight = 0;
        int rightHeight = 0;

        if (node.left == null){
            leftHeight = -1;
        } else {
            leftHeight = height(node.left);
        }

        
        if (node.right == null){
            rightHeight = -1;
        }
        else {
            rightHeight = height(node.right);
        }

        return leftHeight - rightHeight;

    }

    private Node rightRotate(Node y) {
        Node x = y.left;
        Node T2 = x.right;

        x.right = y;
        y.left = T2;

        y.height = Math.max(height(y.left), height(y.right)) + 1;
        x.height = Math.max(height(x.left), height(x.right)) + 1;

        return x;
    }

    private Node leftRotate(Node x) {
        Node y = x.right;
        Node T2 = y.left;

        y.left = x;
        x.right = T2;

        x.height = Math.max(height(x.left), height(x.right)) + 1;
        y.height = Math.max(height(y.left), height(y.right)) + 1;

        return y;
    }

    public void printPreOrder() {
        printPreOrder(root);
    }
    
    private void printPreOrder(Node node) {
        if (node == null) {
            return;
        }
    
        System.out.print(" " + node.data);
        printPreOrder(node.left);
        printPreOrder(node.right);
    }

    public Node search(int key) {
        return search(this.root, key);
    }
    
    private Node search(Node node, int key) {
        if (node == null || node.data == key) {
            return node;
        }
    
        if (key < node.data) {
            return search(node.left, key);
        } else {
            return search(node.right, key);
        }
    }

    public static void main(String[] args) {
        AVL tree = new AVL(new Node(1));
        tree.insert(2);
        tree.insert(3);
        tree.insert(4);
        tree.insert(5);

        tree.printPreOrder();
    }

}
