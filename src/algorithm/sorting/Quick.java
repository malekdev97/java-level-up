package sorting;

public class Quick {

    // swap function (array, i, j)
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // function partiation (array, int low, int high)
    static int partition(int[] arr, int low, int high) {
        int pivot = arr[high]; /* Choosing the last element as the pivot */
        int i = low - 1;
        
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                swap(arr, i, j);
            }
        }

        swap(arr, i + 1, high);
        return i + 1;
    }

    // recursive quicksort
    static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);

            // recursive call on the left of pivot
            quickSort(arr, low, pivotIndex - 1);
            // recursive call on the right of pivot
            quickSort(arr, pivotIndex + 1, high);
        }
    }

   
    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] array = {20, 2, 9, 7, 12, 15, 1, 6, 8};
        int n = array.length;

        print(array);

        quickSort(array, 0, n - 1);

        print(array);
    }
}