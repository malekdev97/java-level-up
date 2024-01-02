package Practice;

public class MyGenericClass <T, V> {

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
