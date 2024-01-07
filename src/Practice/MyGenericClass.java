package Practice;

// generic bonded type parameter
public class MyGenericClass <T extends Number, V> {

    T x;
    V something;

    MyGenericClass(T x, V something) {
        this.x = x;
        this.something = something;
    }

    public T getValue() {
        return x;
    }
}
