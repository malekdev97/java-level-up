package Search;

public class Search {

    // attribute

    /**
     * @desc search for the item in the array
     * @bigO Log N
     * @param item
     * @return value
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

    public static int normalSearch(int [] item, int target)
    {
        for(int i = 0; i < item.length; i++) {
            if(target == item[i]){
                return item[i];
            }
    }
        return -1;
    }

    // Interpolation Search
    // code

}
