package exam;
class Main {

    static int number = 10;
  
    // can't have two public class in one file
    public static void main(String[] args) {
      
      for(int number = 0; number < 5; number++){
        System.out.println(number);
      }
  
      // Data types
      long numLong = 99999999999999L;
   
      int numInt = 4_5_3;
  
      float f1=5f, f2=10f;
  
      // Double vs Float
      double numDouble = 3.14d; // 64 bit
      float numFloat = 3.14f; // 32 bit
  
      System.out.println(numInt);
  
      System.out.println("Hello World");
  
      /**
       * Default values
       * byte 0
       * short 0
       * int 0
       * long 0L
       * float 0.0f
       * double 0.0d
       * char '\u0000'
       * boolean false
       * String(or any object) null
       */
  
      /*
       * In Java, `double` and `float` are both used to represent floating point numbers, but they have some differences:
  
        1. Precision: `double` is more precise than `float`. `double` has 64 bits of precision while `float` has 32 bits of precision. This means that `double` can represent numbers with more decimal points more accurately than `float`.
  
        2. Range: `double` has a larger range than `float`. `double` can represent numbers from approximately 5.0e-324 to 1.7e308, while `float` can represent numbers from approximately 1.4e-45 to 3.4e38.
  
        3. Default: In Java, if you declare a floating point number without specifying the type, it is treated as a `double`. For example, `double num = 3.14;` is valid, but `float num = 3.14;` is not valid because 3.14 is a `double` by default. To specify a `float`, you need to append an `f` or `F` to the end of the number, like `float num = 3.14f;`.
  
        In your code, `numDouble` is a `double` with the value 3.14, and `numFloat` is a `float` also with the value 3.14. However, `numDouble` is more precise than `numFloat`.
       */
  
       int []a = {1, 2,3};
       System.out.println(a instanceof Object);
       System.out.println(" " + true);
       int num = 053; // The number 053 in octal is equal to 43 in decimal
       // Octal 053 = 5*(8^1) + 3*(8^0) = 40 + 3 = 43 in decimal.
        System.out.println(num);
  
        int x [][] = new int[3][];
        x[1] = new int[]{1,2,3};
        x[2] = new int[]{4,5};
        System.out.println(x[1][1]);
  
  
        String $ = "John";
        String __$_ = "Doe";
        System.out.println($ + " " + __$_);
  
        
    }
  }
  