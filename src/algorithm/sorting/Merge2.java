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
        // base case 
        // if array has one element
        if (arr.length <= 1) {
            return;
        }
        // get index middle of array 
        int mid = arr.length / 2;
        // create left array
        int[] left = new int[mid];
        // create right array 
        int[] right = new int[arr.length - mid];
        
        /* Divide the array  */
        System.arraycopy(arr, 0, left, 0, mid);
        // temparr = list[0:3]
        System.arraycopy(arr, mid, right, 0, arr.length - mid);
   

        /* Recursively sort left*/
        mergeSort(left);
        // Recursively sort right
        
        
        /* call merge */
        

    }
    
    public static void merge(int[] arr, int[] left, int[] right) {
        // create leftIndex integer 
        // create rightIndex integer
        // create arrIndex 
        int i = 0, j = 0, k = 0;
        
        // while leftIndex is less than left.length and rightIndex is less than right.length
        while (i < left.length && j < right.length) { // if left is less than right 
            // if left is less than right
            if (left[i] <= right[j]) {
                // add left to arr
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
