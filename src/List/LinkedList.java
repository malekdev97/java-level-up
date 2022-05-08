package List;

import List.Node;

public class LinkedList {

    // Attribute
    public Node head = null;
    public Node tail = null;

    private int size = 0;

    public void addAfter(int item, int searchItem){
        Node myNode = new Node();
        myNode.data = item;

        Node node = head;
        while(node.data != searchItem){

            node = node.next;
        }
        
    }

    /**
     * add node at last
     *  Big O(n)
     */
    public void addLast(int data){

        Node myNode = new Node();
        myNode.data = data;

        if(head == null){

            head = myNode;
        }
        else{
            Node node = head;
            while(node.next != null){
                node = node.next;
            }

            node.next = myNode;
        }
        size++;
        tail = myNode;
    }



    /**
     * add node at first and change head to the new node
     * Big O(1)
     */
    public void addFirst(int data){
        // create node
        Node myNode = new Node();
        myNode.data = data;

        // change head to the new node
        if(head == null){
            head = myNode;
        }
        else {
            myNode.next = head;
            head = myNode;

        }
        size++;
    }

    /**
     * add node in middle of node list
     * Big O(n)
     */
    public void addMiddle(int data){

        Node myNode = new Node();
        myNode.data = data;

        if(head == null) {
            head = myNode;
            tail = myNode;
        }
        else {
            Node tempNode;
            Node currentNode;
            int count=0;
            if(size % 2 == 0){
                count = size/2;
            }
            else {
                count = (size+1)/2;
            }
            tempNode = head;
            currentNode = null;

            for(int i = 0; i < count; i++) {
                currentNode = tempNode;
                tempNode = tempNode.next;
            }
            currentNode.next = myNode;
            myNode.next = tempNode;
        }
        size++;
    }


    /**
     * Search for node.data return true if node.data exist
     * @param n
     * @return boolean
     * Big O(n)
     */
    public boolean search(int n){
        Node myNode = head;
        while(myNode != null){

            if(myNode.data == n){
                return true;
            }
            else {
                myNode = myNode.next;
            }
        }
        return false;
    }

    /**
     * delete at first node
     * Big O(1)
     */
    public void deleteFirst(){

        head = head.next;
        size--;
    }

    /**
     * find last node and delete it
     * Big O(n)
     */
    public void deleteLast(){

        Node myNode = head;
        while(myNode.next.next != null){

            myNode = myNode.next;
        }
        myNode.next = null;
        size--;
    }

    /**
     * find the middle node and delete it
     * Big O(n)
     */
    public void deleteMiddle() {
        Node tempNode;
        Node currentNode;
        if(head == null) {
            System.out.println("List.Node == Null");
            return;
        }
        else {
            int count=0;
            if(size % 2 == 0){
                count = size/2;
            }
            else {
                count = (size+1)/2;
            }
            if( head != tail ) {
                tempNode = head;
                currentNode = null;
                for(int i = 0; i < count-1; i++){
                    currentNode = tempNode;
                    tempNode = tempNode.next;
                }
                if(currentNode != null) {
                    currentNode.next = tempNode.next;
                    tempNode = null;
                }
                else {
                    head = tail = tempNode.next;
                    tempNode = null;
                }
            }
            else {
                head = tail = null;
            }
        }
        size--;
    }

    /**
     * print all node in the list
     * Big O(n)
     */
    public void printAll(){

        Node nodeList = head;
        System.out.print("[");
        while( nodeList != null){
            System.out.print(nodeList.data);
            nodeList = nodeList.next;
            if(nodeList != null){
                System.out.print(", ");
            }
        }
        System.out.print("]\n");
    }

    /**
     * return the size of the list
     * @return size
     * Big o(1)
     */
    public int size(){
        return this.size;
    }
}
