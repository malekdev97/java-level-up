package search;

public class Search {


    /**
     * Binary Search
     * Big O = Log N
     */
    public static int binarySearch(int[] arr ,int item)
    {
        int middle = 0, low = 0, high = arr.length-1;
        while(low <= high)
        {
            middle = low + high / 2;
            if (item == arr[middle]) {
                return item;
            }
            else if (item < arr[middle]) {
                high = middle - 1;
            }
            else if (item > arr[middle]) {
                low = middle + 1;
            }
        }
        return -1;
    }

    /**
     * interpolation search
     * BIG O = Log N
     */
    public static int InterSearch(int[] array, int target)
    {
        int low = 0, middle = 0, count = 0, high = array.length -1;
        while(low <= high)
        {
            // interpolation
            middle = low + ((target - array[low])*(high - low) / (array[high] - array[low]));

            if(middle > array.length -1) {
                return -1;
            }
            else if(target == array[middle]){
                return middle;
            }
            else if(target > array[middle]) {
                low = middle + 1;
            }
            else if(target < array[middle]) {
                high = middle -1;
            }
        }
        return -1;
    }

    /**
     * Normal search
     * Big O = N
     */
    public static int normalSearch(int [] item, int target)
    {
        for(int i = 0; i < item.length; i++) {
            if(target == item[i]){
                return item[i];
            }
    }
        return -1;
    }

    public static void main(String[] args) {

        int[] arr = { 2, 4, 0, 1, 9 ,5};

        // Binary Search | Log N
      //  System.out.println(binarySearch(arr, 3));

        // Interpolation Search | Log N
        System.out.println(InterSearch(arr, 2));

        //  Search | N
        System.out.println(normalSearch(arr, 0));
    }
}
