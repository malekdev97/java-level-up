public class Main{
  
  public static void main(String[] args) throws InterruptedException{  

    // Create a subclass of Thread
    MyThread thread1 = new MyThread();
      
    //or 
    
    //implement Runnable interface and pass instance as an argument to Thread() 
    MyRunnable runnable1 = new MyRunnable();
    Thread thread2 = new Thread(runnable1);
    
    
    //thread1.setDaemon(true);
    //thread2.setDaemon(true);
    // This is asynchronous thread execution
    //thread1.start();
    //thread1.join(); //calling thread (ex.main) waits until the specified thread dies or for x milliseconds
    //thread2.start();
    
    // This is synchronous thread execution
    thread1.run();
    thread2.run();

  } 
}