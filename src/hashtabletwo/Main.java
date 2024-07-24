package hashtabletwo;

import java.util.LinkedList;

public class Main {

    
    public static void main (String[] args) {

        LinkedList<Integer> list[] = new LinkedList[3];

        // add elements to the linked list 

        list[0] = new LinkedList<>();
        list[0].add(10);
        list[0].add(20);
        list[0].add(30);

        list[1] = new LinkedList<>();
        list[1].add(40);
        list[1].add(50);
        list[1].add(60);


        for(int i : list[0]) {
            System.out.println(i);
        }
        

        
    }
}
