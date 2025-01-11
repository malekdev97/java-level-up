package hashtabletwo;

import java.util.LinkedList;

public class Hash {
    // Number of buckets
    private int size;

    private  LinkedList<Integer>[] table;

    public Hash(int size) {
        this.size = size;
        this.table = new LinkedList[size]; //  each position in the table initially points to an empty LinkedList.
        for (int i = 0; i < size; i++) {  // iterates over each index in the table array.
            table[i] = new LinkedList<>(); //to ensure that each bucket in the hash table initially points to an empty linked list, ready to store elements.
          }
        }

        public int hashFunction(int key) {
          return (key % size);
      }
  
  
      public void insertItem(int key) {
          // get the hash index of key
          int index = hashFunction(key);
          // insert key into hash table at that index
          table[index].add(key);
      }
  
      public void displayHash() {
          for (int i = 0; i < size; i++) {   //iterates through each bucket in the table array and prints the bucket index followed by the keys stored in the linked list at that index.
              System.out.print(i);
              for (int x : table[i]) {
                  System.out.print(" --> " + x);
              }
              System.out.println();
          }
      }
      
      public static void main(String[] args) {
        // array that contains keys to be mapped
        int[] a = { 15, 11, 27, 8, 12, 3, 6};

        Hash h = new Hash(7);

        // insert the keys into the hash table
        for (int x : a) {
            h.insertItem(x);
        }

        // Display the hash table
        h.displayHash();
    }
  
    }
