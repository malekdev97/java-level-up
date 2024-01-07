package Practice;

import java.util.ArrayList;
import java.util.HashMap;

public class GenericJava {

    public static <T> void displayArray(T[] array) {
        for(T item : array) {
            System.out.println(item);
        }
    }

    public static <T> void helloGeneric(T item) {
        System.out.println(item);
    }

    public static void main(String[] args) {
        // Your code here

        // try call generic method
        Integer[] arrNumber = {10, 20, 30, 40};
        char[] arrChar = {'a', 'b', 'c', 'd'};

        int numx = 1997;
        String namex = "Naruto";

        GenericJava.<String>helloGeneric(namex);
        GenericJava.<Integer>helloGeneric(numx);

        // Generic Class
        MyGenericClass<Integer, Character> objNum = new MyGenericClass<>(100, '#');
        MyGenericClass<Double, Double> objString = new MyGenericClass<>(2.1, 2.5);

        ArrayList<String> arrString = new ArrayList<>();

        // AN example of using generic is hashmap
        HashMap<Integer, String> myMap = new HashMap<>();
        myMap.put(1, "Naruto");

        System.out.println(myMap.get(1));

        HashMap<Character, String> myMapTwo = new HashMap<>();

        myMapTwo.put('a', "Son Goku");
        myMapTwo.put('b', "Vegeta");

        System.out.println(myMapTwo.get('b'));

        // displayArray(arrNumber);
    }
}
