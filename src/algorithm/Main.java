package algorithm;

public class Main {
    
    public static void main(String[] args) {
        
        int [] arr = {10, 20, 30, 40, 50, 60, 80, 90};

        sort(arr);

        System.out.println();

    }

    // Big O notation: O(1) time complexity 
    public static void getFirst(int [] arr) {
        // Time complexity CPU  Call function , math operation, assighment   
        System.out.println(arr[0]);// 1
        int num = 20 + 80; // 2 

    }
    // OUTPUT: 2 + 1 + 80 + 10 = 93 O(1)


    // Big O notation: O(log n)
    public static void binarySearch(int [] arr, int key) {
        int low = 0;
        int high = arr.length - 1;
        int mid = 0;

        while(low <= high)
        {
            mid = (low + high) / 2;

            if(arr[mid] == key)
            {
                System.out.println("Element found at index: " + mid);
                return;
            }
            else if(arr[mid] < key)
            {
                low = mid + 1;
            }
            else
            {
                high = mid - 1;
            }
        }

        System.out.println("Element not found");
    }


    // Big O notation: O(n)
    public static void printArray(int [] arr) {
        for(int i = 0; i < arr.length; i++)
        {
            
            System.out.print(arr[i] + " "); // N 
        }
    }


    // Big O notation: O(n^2)
    public static void sort(int [] arr) {

        for(int i = 0; i < arr.length; i++)
        {
            for(int j = i + 1; j < arr.length; j++)
            {
                if(arr[i] > arr[j])
                {
                    int temp = arr[i]; 
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    // Big O notation: O(n log n)
    public static void mergeSort(int [] arr) {
        if(arr.length > 1)
        {
            int mid = arr.length / 2;

            int [] left = new int[mid];
            int [] right = new int[arr.length - mid];

            for(int i = 0; i < mid; i++)
            {
                left[i] = arr[i];
            }

            for(int i = mid; i < arr.length; i++)
            {
                right[i - mid] = arr[i];
            }

            mergeSort(left);
            mergeSort(right);

            merge(arr, left, right);
        }
    }

    public static void merge(int [] arr, int [] left, int [] right) {
        int i = 0;
        int j = 0;
        int k = 0;

        while(i < left.length && j < right.length)
        {
            if(left[i] < right[j])
            {
                arr[k] = left[i];
                i++;
            }
            else
            {
                arr[k] = right[j];
                j++;
            }
            k++;
        }

        while(i < left.length)
        {
            arr[k] = left[i];
            i++;
            k++;
        }

        while(j < right.length)
        {
            arr[k] = right[j];
            j++;
            k++;
        }
    }

    // Big O notation O(2^n)
    public static int fibonacci(int n) {
        if(n <= 1)
        {
            return n;
        }

        return fibonacci(n - 1) + fibonacci(n - 2);
    }

}