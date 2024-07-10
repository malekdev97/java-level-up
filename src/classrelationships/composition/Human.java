package classrelationships.composition;

public class Human {
    // Composition is a "has-a" relationship. A Human "has-a" Head and a Body.
    Head head;
    Body body;
    public void set_head(Head head) {
        this.head = head;
    }

    public void set_body(Body body) {
        this.body = body;
    }
}
