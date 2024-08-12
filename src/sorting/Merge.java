package sorting;

public class Merge {
    
    public static void main(String[] args) {
        int[] array = {6,5,12,10,9,1};
        //System.out.println(array.length / 2);
        mergeSort(array);

        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }


    public static void mergeSort(int[] arr) {


        int mid = arr.length / 2; // get middle index
        // divide the array 
        int[] left = new int[mid]; 
        int[] right = new int[arr.length - mid];

        // copy the left half 
        System.arraycopy(arr, 0, left, 0, mid);

        System.arraycopy(arr, mid, right, 0, arr.length - mid);

        /* Recursively sort the two halves */
        mergeSort(left);
        mergeSort(right);

        /* Merge the sorted halves */
        merge(arr, left, right);
    }

    public static void merge(int[] arr, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                arr[k] = left[i];
                i++;
            } else {
                arr[k] = right[j];
                j++;
            }
            k++;
        }

        /* Copy the remaining elements of left[] if any */
        while (i < left.length) {
            arr[k] = left[i];
            i++;
            k++;
        }

        /* Copy the remaining elements of right[] if any */
        while (j < right.length) {
            arr[k] = right[j];
            j++;
            k++;
        }
    }
}