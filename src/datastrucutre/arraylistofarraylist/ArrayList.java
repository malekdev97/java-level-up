package arraylistofarraylist;

class ArrayList<T> {
    private T[] array;
    private int size;
    private int capacity;
    
    public ArrayList() {
        this.capacity = 10;
        this.size = 0;
        this.array = (T[]) new Object[this.capacity];
    }
    
    public void add(T element) {
        if (this.size == this.capacity) {
            this.capacity *= 2;
            T[] newArray = (T[]) new Object[this.capacity];
            for (int i = 0; i < this.size; i++) {
                newArray[i] = this.array[i];
            }
            this.array = newArray;
        }
        this.array[this.size] = element;
        this.size++;
    }
    
    public T get(int index) {
        if (index < 0 || index >= this.size) {
            throw new IndexOutOfBoundsException();
        }
        return this.array[index];
    }
    
    public int size() {
        return this.size;
    }
    
    public void clear() {
        this.size = 0;
        this.capacity = 10;
        this.array = (T[]) new Object[this.capacity];
    }
    
    public void remove(int index) {
        if (index < 0 || index >= this.size) {
            throw new IndexOutOfBoundsException();
        }
        for (int i = index; i < this.size - 1; i++) {
            this.array[i] = this.array[i + 1];
        }
        this.size--;
    }
    
    public void set(int index, T element) {
        if (index < 0 || index >= this.size) {
            throw new IndexOutOfBoundsException();
        }
        this.array[index] = element;
    }
    
    public boolean isEmpty() {
        return this.size == 0;
    }
    
    public boolean contains(T element) {
        for (int i = 0; i < this.size; i++) {
            if (this.array[i].equals(element)) {
                return true;
            }
        }
        return false;
    }
    
    public int indexOf(T element) {
        for (int i = 0; i < this.size; i++) {
            if (this.array[i].equals(element)) {
                return i;
            }
        }
        return -1;
    }
    
    public int lastIndexOf(T element) {
        for (int i = this.size - 1; i >= 0; i--) {
            if (this.array[i].equals(element)) {
                return i;
            }
        }
        return -1;
    }
}