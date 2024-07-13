package classrelationships.association;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    

    public static final void main(String[] args) {
        ArrayList<Hobby> hobbies = new ArrayList<>();
        hobbies.add(new Hobby("Reading"));
        hobbies.add(new Hobby("Listening to music"));

        ArrayList<Hobby> hobbies2 = new ArrayList<>(Arrays.asList(new Hobby("Running"), new Hobby("Sleeping"))); 

        ArrayList<User> friends = new ArrayList<>();
        friends.add(new User(new Address("USA", "New York"), hobbies, new ArrayList<>()));
        friends.add(new User(new Address("Japan", "Tokyo"), hobbies2, new ArrayList<>()));
        User user1 = new User(new Address("USA", "New York"), hobbies, friends);

        System.out.println(user1.toString());
    }
}
