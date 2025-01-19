package arraylistofarraylist;

public class Main {
    
    public static void main(String[] args) {
        
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        var temp = new ArrayList<Integer>();
        temp.add(1);
        temp.add(2);
        temp.add(3);

        list.add(temp);

        System.out.println(list.get(0).get(2)); // 1
    }
}
