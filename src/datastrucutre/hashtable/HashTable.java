package hashtable;

import java.util.LinkedList;

class HashTable<K, V> {
    private class Entry {
        K key;
        V value;

        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    private LinkedList<Entry>[] table;
    private static final int INITIAL_CAPACITY = 16; // for simplicity, choose a power of 2

    public HashTable() {
        table = new LinkedList[INITIAL_CAPACITY];
    }

    public void put(K key, V value) {
        int index = getHash(key);
        if (table[index] == null) {
            table[index] = new LinkedList<>();
        }

        // Check if key already exists
        for (Entry entry : table[index]) {
            if (entry.key.equals(key)) {
                entry.value = value; // update the value
                return;
            }
        }

        // Add new entry
        table[index].add(new Entry(key, value));
    }

    public V get(K key) {
        int index = getHash(key);
        LinkedList<Entry> entries = table[index];
        if (entries != null) {
            for (Entry entry : entries) {
                if (entry.key.equals(key)) {
                    return entry.value;
                }
            }
        }
        return null; // if key not found
    }

    private int getHash(K key) {
        return Math.abs(key.hashCode()) % INITIAL_CAPACITY;
    }
}