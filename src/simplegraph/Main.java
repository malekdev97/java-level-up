package simplegraph;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

    public static ArrayList<LinkedList<String>> arrlist = new ArrayList<LinkedList<String>>();
    public static void main(String[] args) {

        LinkedList list = new LinkedList<String>();
        list.add("A");

        arrlist.add(list);
        
        System.out.println(arrlist.get(0));

        arrlist.get(0).add("b");
        arrlist.get(0).add("c");

        LinkedList list2 = new LinkedList<String>();
        list2.add("D");

        arrlist.add(list2);

        arrlist.get(1).add("e");
        





    }
    
}
