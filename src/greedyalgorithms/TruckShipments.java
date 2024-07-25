package greedyalgorithms;


class Item {

    String name;
    int value;
    int weight;

    Item(String itemName, int value, int weight){
        this.name = itemName;
        this.value = value;
        this.weight = weight;
    }
    
}


public class TruckShipments {

    int capacity = 100;
    Item [] items = {(new Item("item 1", 4000, 50)), (new Item("item 2", 3000, 30)), (new Item("item 3", 2000, 20)), (new Item("item 4", 1500, 10))};


    public Item[] greedyAlgorithm() {

        Item plan[] = new Item[this.items.length];
        Item[] temp_item_arr = this.items;
        Item currentItem = temp_item_arr[0];
        int currentCapacity = 0;

        // counter for plan [] 
        int k = 0;
        // index of the element to delete
        int removeIndex = 0;

        while (currentCapacity < this.capacity && k < plan.length) {

            // find the most valuable item that fits the truck capacity
            for (int i = 0; i < temp_item_arr.length; i++) {

                /* add your code here */

            }

            plan[k++] = currentItem;
            currentCapacity += currentItem.weight;
            delete(temp_item_arr, removeIndex);
            currentItem = temp_item_arr[0];
        }

        return plan;
    }

    public Item[] delete(Item[] temp_item_arr, int elementIndex) {

        for (int i = elementIndex; i < temp_item_arr.length - 1; i++) {
            temp_item_arr[i] = temp_item_arr[i + 1];
        }

        return temp_item_arr;

    }

    public void display() {
        for (Item item : items) {
            System.out.println("Name: " + item.name + " Time: " + item.weight + " Score: " + item.value);

        }
    }

    public void displayPlan(Item plan[]) {

        for (Item item : plan)
            if (item != null)
                System.out.println("Name: " + item.name + " Time: " + item.weight + " Score: " + item.value);

    }

    public static void main(String[] args) {
        TruckShipments ts = new TruckShipments();

        System.out.println();
        System.out.println("List of places : ");
        ts.display();

        System.out.println();

        Item[] plan = ts.greedyAlgorithm();
        System.out.println("Plan : ");
        ts.displayPlan(plan);
        System.out.println();

    }


}
