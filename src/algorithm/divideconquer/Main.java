package divideconquer;

import java.util.Arrays;

public class Main {


    public static int findMax(int[] numbers){

        if(numbers.length == 1){ //if the array contains only one element return it
            return numbers[0];
        }
    


    int mid = numbers.length/2; //divide the array into two
    int[]left  = Arrays.copyOfRange(numbers,0,mid);
    int[]right = Arrays.copyOfRange(numbers,mid,numbers.length);

    //conquer the array 
    int maxleft = findMax(left);
    int maxright = findMax(right);


    return Math.max(maxleft, maxright);

    }
    public static void main(String[] args) {
        int[] numbers = {16,3,24,47,21,32}; // create the array 
        int max = findMax(numbers); // create variable
        System.out.println("The maximum numbers is: " + max);
        
    }
}