package List;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
class CircularQueueTest {

    @Test
    void isFull() {
        CircularQueue myList = new CircularQueue(1);

        myList.enQueue(10);
        assertTrue(myList.isFull());
    }

    @Test
    void isEmpty() {
    }

    @Test
    void enQueue() {
    }

    @Test
    void deQueue() {
    }

    @Test
    void display() {
    }

    @Test
    void countQueue() {
    }
}