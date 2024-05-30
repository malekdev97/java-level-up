package hashtable;

import java.util.LinkedList;

public class HashTable {
    public HashTable(int size, double... loadFactor) {
        hashTable = new LinkedList[size];
        this.size = size;
        if (loadFactor.length != 0) {
            this.loadFactor = loadFactor[0];
            // Threshold is load factor multiplied into size casted into an int
            this.threshold = (int) this.loadFactor * size;
        } else {
            // Threshold is load factor multiplied into size casted into an int
            this.threshold = (int) (DEFAULT_LOADFACTOR * size);
        }

    }
    public LinkedList<Entry> bucket;
    public LinkedList<Entry> hashTable[];
    public int size, threshold, count = 0;
    public double loadFactor = 0;

    // load factor is a value using which we resize the hash table after a set number of
    // elements are inserted, 0.75 chosen here will resize the table after it has reached
    // 75% of it's capacity
    final static double DEFAULT_LOADFACTOR = 0.75;
}
