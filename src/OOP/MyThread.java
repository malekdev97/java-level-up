package OOP;

/**
 * Threads
 *
 *
 * Java is a multi-threaded programming language. This means that our program can make optimal use of available resources
 * by running two or more components concurrently, with each component handling a different task.
 * You can subdivide specific operations within a single application into individual threads that all run in parallel.
 * The following diagram shows the life-cycle of a thread.
 */
public class MyThread extends Thread {
    static int counter =0;

    public MyThread(){
        counter++;
    }
    public void run() {

        System.out.println("Hi Thread");
    }

}

// exmaple class
class MyClass {
    public static void main(String[] args) {
        MyThread obj = new MyThread();
        obj.start();
        obj.setPriority(9);
        MyThread obj2 = new MyThread();
        obj2.start();

        System.out.println(MyThread.counter);
    }
}