public class Stack {

    /**
     * Last in First out
     * LIFO
     * Top
     * Push
     * pop
     * peek
     */

    public Node top = null;

    public void push(int item) {

        Node myNode = new Node();
        myNode.data = item;

        if(top == null) {
            top = myNode;
        }
        else {
            myNode.next = top;
            top = myNode;
        }
    }

    public void pop(){

        if(top == null){
            System.out.println("Empty Stack LinkedList");
            return;
        }
        else {
            top = top.next;
        }
    }

    public int peek(){

        if(top == null){
            System.out.println("Empty Stack LinkedList");
            return 0;
        }
        else {
            return top.data;
        }
    }



}
