package exam;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.function.BiFunction;

import javax.swing.event.ListSelectionEvent;

public class Main {

	public static void main(String[] args) {
		// Java SE Programmer I 1Z0-808
		// - Basic
			// ○ Scope variables
			{
				int x = 5;
				{
					System.out.println(x); // x is in scope
					// int x = 10; // x is already defined
					int y = 10;
				}
				// System.out.println(y); // y is out of scope
			}
			// System.out.println(x); // x is out of scope

			int a = 9;
			for (a = 0; a < 5; a++) {
				System.out.println(a);
			}

			for (int i = 0; i < 5; i++) {
				System.out.println(i);
			}
			int i = 100;
			System.out.println(i);

			// ○ Class structure
			class ClassName {
				// attributes 
				static int x = 5;

				// methods 
				public static void myMethod() {

					// print "I'm my method"
					System.out.println("I'm my method");
				}
			}
			//   ○ Run java via CMD
				// 1- javac Main.java -> Main.class 2- run Java Main -> output code  
				
			// ○ Compare and contrast the features and components
			// of Java such as: platform independence, object orientation, encapsulation, etc.
			// ○ Import java packages
			// import java.util.Random;
			// public class myclass {
			// 	public static void main(String[] args) {
					
			// 		Random rand = new Random();   
			// 		System.out.println(rand.nextInt(5));
			// 	}
			// }


		// - Working With Java Data Types
			// ○ All Types + Casting
			//      <- UpCasting    |    DownCasting ->
			// Double -> Float -> Long -> int -> short -> byte
			// Downcasting: parent -> child
			// Upcasting: child -> parent
				
			// ○ Object reference variables vs primitive variables
			// // ○ Object reference variables vs primitive variables
				// // call by value = primitive 
				// public static void  incFloat(float num) {
				// 	num = num * 100; // this will not change the valu of the num
					
				// }
				// // call by reference variable
				// public static void addElm(List<String> strArr) {
				// 	strArr.add("New Str"); // this will add new str to myStr 
				// 	// bcz it's call by value 
				// }
				// we can't access not primitive date directly 

				// Long npl = 1000L;
				// long pl = 1000L;
				// boolean res = pl == npl ? true : false;
				// System.out.println(res);

				// @@ I have stoped here 7/June/2024
			// ○ Read object field
			// ○ Object lifecycle (creation, dereference, reassignment and garbage
			// collection
			// ○ Wrapper classes Boolean, Double, Integer

		// - Using Operators and Decision Constructs
		// ○ Java operators and parentheses
		// ○ == and equals()
		// ○ If, if else, and else statement
		// ○ Switch statement
		// - Creating and Using Arrays
		// ○ One dimensional array
		// ○ Multi dimensional array
		// - Using Loop Constructs
		// ○ while loops
		// ○ Enhanced for loop
		// ○ Do while
		// ○ Break and Continue
		// ○ Compare loop constructs
		// ○
		// - Working with Methods and Encapsulation
		// ○ Access modifiers
		// ○ Encapsulation
		// ○ Method with return value + overloaded
		// ○ Static methods and attributes
		// ○ Default and user defined + overload constructors

		// - Working with Inheritance
		// ○ Describe inheritance and its benefits
		// ○ When casting is necessary
		// ○ Polymorphism + overrides + type reference and object
		// ○ Super keword
		// ○ Abstract class
		// ○ Interface
		// - Handling Exceptions
		// ○ Checked exceptions, unchecked exception, and errors
		// ○ Method that throws an exception
		// ○ Try-catch
		// ○ Common exception classes(NullPointerExc, ArrayIndexOutOfBounds)
		// ○ Advantages of exception handling

		// - Working with Selected classes from the Java API
		// ○ StringBuilder class and its methods
		// ○ ArrayList
		// ○ Manipulate String
		// ○ Manipulate calendar data from java.time.LocalDateTime, formatter, period
		// ○ Lambda expression and predicate expression
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
