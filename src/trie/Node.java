package trie;


public class Node {

    public Node children[] = new Node[25];
    public boolean isEndOfWord;
    
    Node(){
        this.isEndOfWord = false;
        for (int i = 0; i < 25; i++)
            children[i] = null;
    }
}