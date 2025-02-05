package classrelationships.association;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    

    public static final void main(String[] args) {

        Address ad1 = new Address("Japan", "Tokyo");
        
        // ArrayList<Hobby> hobbies = new ArrayList<>();
        // hobbies.add(new Hobby("Reading"));
        // hobbies.add(new Hobby("Listening to music"));

        // ArrayList<Hobby> hobbies2 = new ArrayList<>(Arrays.asList(new Hobby("Running"), new Hobby("Sleeping"))); 

        // ArrayList<User> friends = new ArrayList<>();
        // friends.add(new User(new Address("USA", "New York"), hobbies, new ArrayList<>()));
        // friends.add(new User(new Address("Japan", "Tokyo"), hobbies2, new ArrayList<>()));
        // User user1 = new User(new Address("USA", "New York"), hobbies, friends);

        // System.out.println(user1.toString());
        
        // Address ad1 = new Address("Japan", "Tokyo");
        // Address ad2 = new Address("USA", "New York");
        
        // ArrayList<Hobby> hob1 = new ArrayList<>(
        //     Arrays.asList(new Hobby("Reading"), new Hobby("Swimming")
        //     ));
        
        // User u1 = new User(ad1, hob1, new ArrayList<>());

        // User u2 = new User(ad1, hob1, new ArrayList<>(Arrays.asList(u1)));

        // User u3 = new User(ad2, hob1, new ArrayList<>(Arrays.asListg(u1,u2, u1, u1)));

        // System.out.println(u3.toString());

    }
}
