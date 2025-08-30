package heap;


public class MaxHeap {
    public int[] heap; // Array to store the heap elements.
    public int count; // The number of elements in the heap. 
  
    public MaxHeap(int capacity) {
        heap = new int[capacity];
        count = 0; // Initialize the count to -1 (empty heap).
    }
  
    public boolean isEmpty() {
        return count == 0; 
    }

    public void ensureCapacity() {
        if (count == heap.length) { // Check if the array is full.
           // Resizes the array with double the length of the current array.
            int[] newHeap = new int[heap.length * 2];
            System.arraycopy(heap, 0, newHeap, 0, count);
            heap = newHeap;
        }
    }
  
    public void insert(int value) {
        ensureCapacity(); // Ensures that the heap has enough capacity.
        heap[count++] = value; // Adds the new element at the current count index and increments it.  
        heapifyUp(count - 1); // Apply the concept of heap. 
    }

    public void delete(int value) {
        if (isEmpty()) {
            System.out.println("the heap is empty ");
        }
        // Search for the index of the required value
        int index = -1;
        for (int i = 0; i < count; i++) {
            if (heap[i] == value) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println("the element is not found ");
        }
        // Replaces the value with the last element in the heap and reduces the count by 1, then resizes the array.
        heap[index] = heap[--count];
        int[] newHeap = new int[heap.length -1];
        System.arraycopy(heap, 0, newHeap, 0, count);
        heap = newHeap;
        heapifyDown(index); // Apply the concept of heap.
        System.out.println("Number " + value + " has been deleted");
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
            System.out.print("Extract method: ");
            delete(heap[0]);
        }
        return max;
    }

    public void heapifyUp(int index) {
        int parent = (index - 1) / 2; // Calculates the index of the parent element.

        /* enters a loop that continues until the `index` reaches the root of the heap (index 0),
           or the element at the current `index` is not greater than its parent.*/

        while (index > 0 && heap[index] > heap[parent]) {
            swap(index, parent); // If the element is not the root and its value is greater than its parent's, swap them.
            index = parent;
            heapifyUp(index);
        }
    }

    public void heapifyDown(int index) {
        int leftChild = 2 * index + 1; // Calculates the index of the left Child element.
        int rightChild = 2 * index + 2; // Calculates the index of the right Child element.
        int largest = index; // Store the index of the largest element, initializing it as the current index.

        /* Checks if the leftchild index in the heap bounds, and the element in the leftchild index
         is larger than the element at the largest index.*/
        if (leftChild < count && heap[leftChild] > heap[largest]) {  
            largest = leftChild; 
        }
        // Perform a similar check for the right child index, updating largest if necessary.
        if (rightChild < count && heap[rightChild] > heap[largest]) { 
            largest = rightChild; 
        }

        // If the current index is not equal to the largest, the heap property is violated. Needs to swap them.
        if (largest != index) { 
            swap(index, largest);
            heapifyDown(largest);
        }
    }

    public void swap(int i, int j) {
        int temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }
} 