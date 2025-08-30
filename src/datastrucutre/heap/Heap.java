package heap;

class Heap {
    private int[] heap; // Array to store the heap elements.
    private int count; // The number of elements in the heap. 
  
    public Heap (int capacity) {
        heap = new int[capacity];
        count = 0; // Initialize the count to -1 (empty heap).
    }
  
    public boolean isEmpty() {
        return count == 0; 
    }

    private void ensureCapacity() {
        if (count == heap.length) { // If the count is equal to the length that the array is full.
           // resizes the array with double the length of the current array (length * 2).
            int[] newHeap = new int[heap.length * 2];
            System.arraycopy(heap, 0, newHeap, 0, count);
            heap = newHeap;
        }
    }
  
    public void insert(int value) {
        ensureCapacity(); // ensures that the heap has enough capacity.
        heap[count++] = value; // adds the new element at the current count index and increments it.  
        heapifyUp(count - 1); // check the heap property. 
    }

    public int delete() {
        if (isEmpty()) {
            return -1; 
        }
        int root = heap[0]; // If the heap is not empty, it retrieves the maximum element at the root (index 0). 
        heap[0] = heap[--count]; // It replaces the root with the last element in the heap.
        heapifyDown(0); // check the heap property. 
        return root;
    }

    public int peek() {
        if (isEmpty()) {
            return -1; 
        }
        return heap[0];
    }

    public int extract() {
        int max = peek();
        if (max != -1) {
            delete();
        }
        return max;
    }

    private void heapifyUp(int index) {
        int parent = (index - 1) / 2; // calculates the index of the parent element.
        /* enters a loop that continues until the `index` reaches the root of the heap (index 0),
           or the element at the current `index` is not greater than its parent.*/
        while (index > 0 && heap[index] > heap[parent]) {
            swap(index, parent); // If the element is not the root and its value is greater than its parent's, swap them.
            index = parent;
            parent = (index - 1) / 2;
        }
    }

    private void heapifyDown(int index) {
        int leftChild = 2 * index + 1;
        int rightChild = 2 * index + 2;
        int largest = index;

        if (leftChild < count && heap[leftChild] > heap[largest]) {
            largest = leftChild;
        }

        if (rightChild < count && heap[rightChild] > heap[largest]) {
            largest = rightChild;
        }

        if (largest != index) {
            swap(index, largest);
            heapifyDown(largest);
        }
    }

    private void swap(int i, int j) {
        int temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }

    public class main {
        public static void main(String[] args) {
            Heap heap = new Heap(5);
    
            // Insert elements into the heap
            heap.insert(10);
            heap.insert(5);
            heap.insert(15);
            heap.insert(20);
            heap.insert(8);
    
            // Print the heap
            System.out.println("Heap: ");
            while (!heap.isEmpty()) {
                System.out.print(heap.delete() + " ");
            }
            System.out.println();
        }
    }
} 