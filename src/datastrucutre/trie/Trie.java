package trie;

import java.util.ArrayList;
import java.util.List;

public class Trie {

    private Node root;

    Trie() {
        this.root = new Node();
    }

    // Insert a word into the trie
    public void insert(String key) {
        Node currentNode = this.root;
        for (int level = 0; level < key.length(); level++) {
            int index = key.charAt(level) - 'a';
            if (currentNode.children[index] == null)
                currentNode.children[index] = new Node();
            currentNode = currentNode.children[index];
        }
        currentNode.isEndOfWord = true;
    }

    // Search for a word in the trie
    public boolean search(String key) {
        Node currentNode = this.root;
        for (int level = 0; level < key.length(); level++) {
            int index = key.charAt(level) - 'a';
            if (currentNode.children[index] == null)
                return false;
            currentNode = currentNode.children[index];
        }
        return (currentNode != null && currentNode.isEndOfWord);
    }

    // Delete a whole word in the Trie
    public void delete(String key) {
        delete(this.root, key, 0);
    }

    private boolean delete(Node node, String key, int level) {
        if (node == null) {
            return false;
        }
        if (level == key.length()) {
            if (!node.isEndOfWord) {
                return false;
            }
            node.isEndOfWord = false;
            return countChildren(node) == 0;
        }
        int index = key.charAt(level) - 'a';
        if (delete(node.children[index], key, level + 1)) {
            if (countChildren(node) == 0)
                node.children[index] = null;
            return countChildren(node) == 0;
        }
        return false;
    }

    // Count the node children
    private int countChildren(Node node) {
        int count = 0;
        for (Node child : node.children) {
            if (child != null) {
                count++;
            }
        }
        return count;
    }

    // Suggest words based on a given prefix
    public List<String> suggest(String prefix) {
        Node currentNode = root;
        for (int level = 0; level < prefix.length(); level++) {
            int index = prefix.charAt(level) - 'a';
            if (currentNode.children[index] == null) {
                return new ArrayList<>();
            }
            currentNode = currentNode.children[index];
        }
        return getWords(currentNode, prefix);
    }

    private List<String> getWords(Node node, String prefix) {
        List<String> words = new ArrayList<>();
        if (node.isEndOfWord) {
            words.add(prefix);
        }
        for (int i = 0; i < node.children.length; i++) {
            if (node.children[i] != null) {
                words.addAll(getWords(node.children[i], prefix + (char) ('a' + i)));
            }
        }
        return words;
    }

    public static void main(String[] args) {

        Trie trie = new Trie();

        trie.insert("feel");
        trie.insert("fees");
        trie.insert("fresh");
        trie.insert("calm");
        trie.insert("care");
        trie.insert("cast");
        trie.insert("cave");

        trie.delete("feel");

        System.out.println(trie.search("feel"));
        System.out.println(trie.search("fees"));

        // Suggest words that start with the prefix (f)
        System.out.println(trie.suggest("f"));

    }

}
