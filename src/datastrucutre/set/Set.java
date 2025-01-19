package set;
import java.util.HashSet;

class Set {
    public static void main(String[] args) {
        
        HashSet<Integer> hashadd = new HashSet<Integer>();
        hashadd.add(13);
        hashadd.add(24);
        hashadd.add(5);
        
         System.out.println(hashadd);
         System.out.println(hashadd.isEmpty());
         System.out.println(hashadd.contains(24));
         hashadd.clear();
         System.out.println(hashadd);
    }
}


