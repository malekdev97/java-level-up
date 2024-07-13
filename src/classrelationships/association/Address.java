package classrelationships.association;

public class Address {

    private String country;
    private String city;
    
    public Address(String country, String city) {
        this.country = country;
        this.city = city;
    }

    public String get_country() {
        return this.country;
    }
    
    public String get_city() {
        return this.city;
    }
}
