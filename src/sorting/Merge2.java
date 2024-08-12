package sorting;

public class Merge2 {
    
    public static void main(String[] args) {
        int[] array = {10 , 30, 20};
        //System.out.println(array.length / 2);
        mergeSort(array);

        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
    // divide
    public static void mergeSort(int[] arr) {
        if (arr.length <= 1) {
            return;
        }
        
        int mid = arr.length / 2;
        int[] left = new int[mid];
        int[] right = new int[arr.length - mid];
        
        /* Divide the array  */
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
        
        while (i < left.length && j < right.length) { // if left is less than right 
            if (left[i] <= right[j]) {
                arr[k] = left[i];
                i++;
            } else { // if right is less than left 
                arr[k] = right[j];
                j++;
            }
            k++;
        }
        
        int check = left.length;
        while (i < left.length) { 
            arr[k] = left[i];
            i++;
            k++;
        }
        
        check = right.length;
        while (j < right.length) {
            arr[k] = right[j];
            j++;
            k++;
        }
    }
}
