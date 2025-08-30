package distribution;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Mian {

    public static void main(String[] args) {

        ArrayList<String> bigData = new ArrayList<>(Arrays.asList("one", "two", "three", "four", "five", "six", "seven", "eight"));

        String name = "java";
        // distribute(bigData);
        stringDistribute(name);

    }

    public static void distribution(ArrayList<String> arr) {

        ArrayList<ArrayList <String>> tempArr = new ArrayList<ArrayList <String>>();
    }

    // Length of the array
    // distrubation unit 
    public static void stringDistribute(String name) {
        
        for(int i = 0; i < name.length(); i++) {
            if(i < name.length() / 2) {
                System.out.println(name.charAt(i) + " " + (i * 10));
            }
            else {

                System.out.println(name.charAt(i) + " " + i);
            }
        }
    
    }
    
    public static void combine(ArrayList<ArrayList <String>> arrs) {

        ArrayList<String> tempArr = new ArrayList<String>();
        
        for(ArrayList<String> temp : arrs) {
            for(String tempStr : temp) {
            tempArr.add(tempStr);
            }
        }

    }

}
