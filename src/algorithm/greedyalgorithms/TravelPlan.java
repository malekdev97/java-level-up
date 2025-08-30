package greedyalgorithms;


public class TravelPlan {

    int timeCapacity = 3;
    Place places[] = { new Place("Place 1", 1, 5), new Place("Place 2", 2, 10), new Place("Place 3", 1, 15),
            new Place("Place 4", 3, 5) };


    public Place[] greedyAlgorithm() {

        Place plan[] = new Place[this.places.length];
        Place[] temp_place_arr = this.places;
        Place currentPlace = temp_place_arr[0];
        int currentTimeCapacity = 0;

        // counter for plan [] 
        int k = 0;
        // index of the element to delete
        int removeIndex = 0;

        while (currentTimeCapacity < this.timeCapacity) {

            // find highest score place that fits the time capacity
            for (int i = 0; i < temp_place_arr.length; i++) {

                if (temp_place_arr[i].time <= (this.timeCapacity - currentTimeCapacity)
                        && temp_place_arr[i].score >= currentPlace.score) {
                    currentPlace = temp_place_arr[i];
                    removeIndex = i;

                }

            }

            // add the place to the plan
            plan[k++] = currentPlace;
            // add the place time to the time capacity counter
            currentTimeCapacity += currentPlace.time;
            // delete the place from the temp array
            delete(temp_place_arr, removeIndex);
            currentPlace = temp_place_arr[0];
        }

        return plan;
    }

    public Place[] delete(Place[] temp_place_arr, int elementIndex) {

        for (int i = elementIndex; i < temp_place_arr.length - 1; i++) {
            temp_place_arr[i] = temp_place_arr[i + 1];
        }

        return temp_place_arr;

    }

    public void display() {
        for (Place place : places) {
            System.out.println("Name: " + place.name + " Time: " + place.time + " Score: " + place.score);

        }
    }

    public void displayPlan(Place plan[]) {

        for (Place place : plan)
            if (place != null)
                System.out.println("Name: " + place.name + " Time: " + place.time + " Score: " + place.score);

    }

    public static void main(String[] args) {
        TravelPlan tp = new TravelPlan();

        System.out.println();
        System.out.println("List of places : ");
        tp.display();

        System.out.println();

        Place[] plan = tp.greedyAlgorithm();
        System.out.println("Plan : ");
        tp.displayPlan(plan);
        System.out.println();

    }

}



