package exam;

public class Exam {
    public static void main(String[] args) {
		// Java SE Programmer I 1Z0-808
		// - Basic
			// ○ Scope variables
			// ○ Class structure
			//   ○ Run java via CMD
				// 1- javac Main.java -> Main.class 2- run Java Main -> output code  
				
			// ○ Compare and contrast the features and components of Java such as platform independence, object orientation, encapsulation, etc.
			// of Java such as: platform independence, object orientation, encapsulation, etc.
			// ○ Import java packages
			
		// - Working With Java Data Types
			// ○ Declare and initialize variables, All Types + Casting
                //      <- UpCasting    |    DownCasting ->
                // Double -> Float -> Long -> int -> short -> byte
                // Downcasting: parent -> child
                // Upcasting: child -> parent	
			// ○ Object reference variables vs primitive variables
			// ○ Know how to read or write to object fields 
            // Explain an Object's Lifecycle creation, dereference by reassignment and garbage collection
			// ○ Develop code that uses wrapper classes such as Boolean, Double, and Integer

		// - Using Operators and Decision Constructs
            // ○ Java operators; use parentheses to override operator precedence 
            // ○ Create if and if,else and ternary constructs
            // ○ Test equality between String and other objects using == and equals()
            // ○ Switch statement

		// - Creating and Using Arrays
            // ○ Declare, instantiate, initialize and use a one-dimensional array
            // ○ Declare, instantiate, initialize and use mulit-dimensional arrays

		// - Using Loop Constructs
            // ○ Create and use while loops
            // ○ Create and use for loops including the enhanced for loop
            // ○ Create and use do/while loops
            // ○ Compoare loop constructs 
            // ○ Use break and continue 

		// - Working with Methods and Encapsulation
            // ○ Cretet with arguments and return values; including overloaded methods
            // ○ Apply the static keyword to methods and fields 
            // ○ Create and overload constructors; differentiate between default and user defined constructors
            // ○ Apply access modifiers
            // ○ Apply encapsulation principles to a class
            // ○ Determine the effect upon object reerences and primitive values when they are passed into methods that change the values
            

		// - Working with Inheritance
            // ○ Describe inheritance and its benefits
            // ○ Devleop code taht makes use of polymorphism; develop code that overrides methods; differentiate between the type of a reference and the type of an object
            // ○ Determine when casting is necessary 
            // ○ Use super and this to access objects and constructors 
            // ○ Use abstract classes and interfaces

		// - Handling Exceptions
            // ○ Differentiate among checked exceptions, unchackedd exception, and Erros
            // ○ Create a try-catch block and determine how exceptions alter normal program flow
            // ○ Describe the advantages Exception handling
            // ○ Create and invoke a method taht throws an exception 
            // ○ Recognize Common exception classes(NullPointerExc, ArrayIndexOutOfBounds, ArthmeticException, and ClassCastException)

		// - Working with Selected classes from the Java API
            // ○ StringBuilder class and its methods
            // ○ Manipulate String
            // ○ Create and Manipulate calendar data from java.time.LocalDateTime, LocalDate, LocalTime, DateTimeFormatter, Period, finally formatter
            // ○ Lambda expression and predicate expression
            // ○ Declare and use an ArrayList of a give type
            // ○ Write a simple Lambda expersssion that consumes a Lambda Predicate experssion 
                // BiFunction<Integer, Integer, Integer> add = (x, z) -> x + z;
                // BiFunction<Float, Long, Boolean> func = (one, two) -> one > two;
                // boolean res = func.apply(10.0f, 500L);
                // System.out.println(res);

                // int result = add.apply(5, 3);
                // System.out.println("The sum is: " + result);


            // float myFloat = 0.30f;
            // incFloat(myFloat);

            // List<String> myStr = new LinkedList<String>();
            // myStr.add("old Str");

            // addElm(myStr);
            
            // System.out.println(myStr);

	}

}
