package exception;

public class Main {
    
    public static void main(String [] args) {

        System.out.println("working...");

        try {
            System.out.println(reString(""));
            
        } catch(ExcpetionHandler e) {
            System.out.println(e);
        }
    }

    public static String reString(String name) throws ExcpetionHandler {
        if(name == null || name.isEmpty()) {
            throw new ExcpetionHandler("Input string is either empty or null");
        }

        name = name.toUpperCase();

        return name;
    }
    

}
