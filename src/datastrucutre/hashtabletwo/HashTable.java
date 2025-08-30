package hashtabletwo;

import java.util.*;

public class HashTable {
    private static final int INITIAL_CAPACITY = 5;
    private LinkedList<Integer>[] table;
    private int size;

    public HashTable() {
        table = new LinkedList[INITIAL_CAPACITY];
        for (int i = 0; i < table.length; i++) {
            table[i] = new LinkedList<>();
        }
        size = 0;
    }

    private int hash(int value) {
        return Math.abs(Integer.hashCode(value)) % table.length;
    }

    public void add(int value) {
        int index = hash(value);
        if (!table[index].contains(value)) {
            table[index].add(value);
            size++;
        }
    }

    public boolean remove(int value) {
        int index = hash(value);
        if (table[index].remove((Integer) value)) {
            size--;
            return true;
        }
        return false;
    }

    public int size() {
        return size;
    }

	public void display() {

		for (int i = 0; i < table.length; i++) {
			System.out.print(i);
			for (int x : table[i]) {
				System.out.print(" --> " + x);
			}
			System.out.println();
		}
	}

    public static void main(String[] args) {
        HashTable hashTable = new HashTable();
        hashTable.add(1);
		hashTable.add(11);
        hashTable.add(2);
        hashTable.add(3);

		hashTable.display();
       
    }
}