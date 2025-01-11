package sorting;

public class Merge {
    
    public static void main(String[] args) {
        int [] array = {8, 2, 5, 3, 4, 7, 6, 1};

        mergeSort(array);
    }

    public static void mergeSort(int[] array) {

        
        // base case 
        // if array has one elm no need to divide
        if(array.length < 2) {
            return;
        }

        int middle = array.length;
        int[] leftArray = new int[middle];
        int[] rightArray = new int[array.length - middle];

        

    }

    private static void merge(int[] leftArr, int[] rightArr, int[] tempArr) {

    }
}