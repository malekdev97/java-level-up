package servletsimple;

public class Main {
    
    public static void main(String [] args) {
        
        int [] arr = {1, 2, 3, 4, 5};
        try {
            
            try {
                System.out.println(arr[9]);
                int num = 2 / 0;

            } catch(ArithmeticException exception) {

                System.out.println("Division by zero");
            }
        }
        catch(ArrayIndexOutOfBoundsException exception) {
            
            System.out.println("Array index out of bounds");
        }
        
        catch(Exception exception) {

            System.out.println("Some other exception");
        }
        finally {

            System.out.println("Finally block");
        }
    }
}
