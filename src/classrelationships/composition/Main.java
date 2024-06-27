package classrelationships.composition;

public class Main {
    
    public static void main(String [] args) {

        Building building = new Building();
        
        building.addRoom(new Room(101));
        building.addRoom(new Room(154));
        
    }
}
