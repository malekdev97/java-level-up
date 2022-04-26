package Search;

public class Search {

    // attribute

    // Binary Search Tree
    // code
    public static int search(int item)
    {
        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80};
        int middle = 0, low = 0, high = arr.length-1;
        while(low <= high)
        {
            middle = low + high / 2;
            if (item == arr[middle]) {
                return middle;
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

    // Interpolation Search
    // code

}
