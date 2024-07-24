package heap;

public class Main {
    public static void main(String[] args) {
        MaxHeap heapNumbers = new MaxHeap(6);
        // Insert elements into the heap
        heapNumbers.insert(10);
        heapNumbers.insert(5);
        heapNumbers.insert(15);
        heapNumbers.insert(20);
        heapNumbers.insert(8);
        heapNumbers.insert(13);

        // Print the heap.
        System.out.print("Heap: ");
        for (int element : heapNumbers.heap) {
            System.out.print(element + " ");
        }
        System.out.println();

        // Print the peek of the heap.
        System.out.println("Heap peek: "+ heapNumbers.peek());
        // Call the extract.
        heapNumbers.extract();
        // Print the peek of the heap.
        System.out.println("Heap peek: "+ heapNumbers.peek());
       // Delete number 10 from the heap.
        heapNumbers.delete(10);
        // Print the heap.
        System.out.print("Heap: ");
        for (int element : heapNumbers.heap) {
            System.out.print(element + " ");
        }
        
    }
}