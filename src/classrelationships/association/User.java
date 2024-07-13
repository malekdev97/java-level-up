package classrelationships.association;

import java.util.ArrayList;

// Association relationship is a "uses-a" relationship. Each class can be used independently.   
final class User {
    
    // self-association relationship
    public User selfUser;

    // one-to-one association relationship
    public Address address;

    // one-to-many association relationship
    public ArrayList<Hobby> hobbies;

    // many-to-many association relationship
    public ArrayList<User> friends;

    public User(Address address, ArrayList<Hobby> hobbies, ArrayList<User> friends) {
        this.address = address;
        this.hobbies = hobbies;
        this.friends = friends;
    }

    public String toString() {
        return "User: " + this.address.get_country() + ", " + this.address.get_city()+ ", " + hobbies.get(0).get_name();
    }   
}
