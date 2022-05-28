package OOP;

public abstract class myAbstract {

    // Attrebuite
    public static int countTotal;
    private int count;

    // constract
    public void myAbstract(){
        countTotal = 0;
        count = 0;
    }

    public abstract int countPlus();

    public void login() {
        System.out.println("You're login Welcome");
    }
}
