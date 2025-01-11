package classrelationships.aggregation;

// Aggregation relationship is a "has-a" relationship. Each class can be used independently.
public class BusDriver {
    private Hat hat;
    private Clothes clothes;

    public BusDriver(Hat hat, Clothes clothes) {
        this.hat = hat;
        this.clothes = clothes;
    }
}
