package sorting;

public class Sort {

    // Quick Sort

    // Insertion Sort
    public static void inertionSort(int [] array) {
        int key = 0;
        int pointer = 0;

        for(int i = 1; i < array.length; i++) {

            key = array[i];
            pointer = i -1;

            while(pointer >= 0 && key < array[pointer]) {

                array[pointer + 1] = array[pointer];
                pointer--;
            }
            array[pointer + 1] = key;
        }
    }
    /**
     * Bubble Sorting
     * @param array
     */
    public static void bubbleSort(int array[]) {
        int size = array.length;

        // loop to access each array element
        for (int i = 0; i < size - 1; i++)

            // loop to compare array elements
            for (int j = 0; j < size - i - 1; j++)

                // compare two adjacent elements
                // change > to < to sort in descending order
                if (array[j] > array[j + 1]) {

                    // swapping occurs if elements
                    // are not in the intended order
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
    }

    /**
     * Selection Sorting
     * @param array
     */
    public void selectionSort(int array[]) {
        int size = array.length;

        for (int step = 0; step < size - 1; step++) {
            int min_idx = step;

            for (int i = step + 1; i < size; i++) {

                // To sort in descending order, change > to < in this line.
                // Select the minimum element in each loop.
                if (array[i] < array[min_idx]) {
                    min_idx = i;
                }
            }
            // put min at the correct position
            int temp = array[step];
            array[step] = array[min_idx];
            array[min_idx] = temp;
        }
    }

    /**
     * merge Sorting
     */
    public static void divideArray(int arr[],int lowerIndex, int higherIndex) {

        if(lowerIndex < higherIndex) {

            // find the middle index
            int middle = lowerIndex + (higherIndex - lowerIndex) / 2;

            // Sorting recursion sort and second half

            divideArray(arr, lowerIndex, middle);
            divideArray(arr, lowerIndex + 1, higherIndex);

            merging(arr, lowerIndex, middle, higherIndex);

        }


        }

    /**
     * Merge Sorting helper
     * @param arr
     * @param lowerIndex
     * @param higherIndex
     */
    private static void merging(int[] arr, int lowerIndex, int middle, int higherIndex) {

        // find the size of two sub-array to merge them later
        int lowerNumber = middle - lowerIndex + 1;
        int higherNumber = higherIndex - middle;

        // temp array to do the merge
        int leftArray [] = new int[lowerNumber];
        int rightArray [] = new int[higherNumber];

        // Insert data into the new two temp array
        for (int i = 0; i < lowerNumber; ++i) {
            leftArray[i] = arr[lowerIndex + i];
        }
        for (int j = 0; j < higherNumber; ++j) {
            rightArray[j] = arr[middle + 1 + j];
        }

        // reset Indexes
        int i = 0;
        int j = 0;

        int merge = lowerIndex;
        while( i < lowerNumber && j < higherNumber) {
            if(leftArray[i] <= rightArray[j]) {
                arr[merge] = leftArray[i];
                i++;
            }
            else {
                arr[merge] = rightArray[j];
                j++;
            }
            merge++;
        }

        while(i < lowerNumber) {
            arr[merge] = leftArray[i];
            i++;
            merge++;
        }

        while(j < higherNumber) {
            arr[merge] = rightArray[j];
            j++;
            merge++;
        }


    }
}
