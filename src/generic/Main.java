package generic;

public class Main {
    
    public static void main(String[] args) {

        // Generic is a way to parametriz the type of attribute/method

        User<Integer> userOne = new User<Integer>();
        userOne.number = 10;

        System.out.println(userOne.number);
    }

    public static <T> void increaseByTen(T data) {
        System.out.println("Your data: "+ data);
    }
}
