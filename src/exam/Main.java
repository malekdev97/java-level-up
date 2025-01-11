package exam;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Method;
import java.sql.Date;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.function.BiFunction;

import javax.swing.event.ListSelectionEvent;

import exception.ExcpetionHandler;

public class Main {

	public static void checkNum(int num) throws ExcpetionHandler {
		if(num > 20) {
			throw new ExcpetionHandler("you're old");
		} else {
			System.out.println("you're young");
		
		}
	}

	public static void main(String[] args) throws FileNotFoundException, IOException {

		int num = 25;

		try {
			checkNum(num);
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("This is finally block");
		}


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
			// ○ Object lifecycle (creation, dereference, reassignment and garbage collection
			// create object
			Object obj = new Object();

			// dereference object
			System.out.println(obj.getClass());
			// Use the dot (.) operator to access fields or methods: This is where dereferencing happens. You use the object reference followed by the dot operator and the field or method name to access or modify the object's state or behavior.

			// reassign object
			obj = new Object();

			// garbage collection
			obj = null;

			// ○ Wrapper classes Boolean, Double, Integer

		// - Using Operators and Decision Constructs
		// ○ Java operators and parentheses
		// ○ == and equals()
			// == Operator:

		// Primitive Types: For primitive data types (int, float, char, etc.), == compares the values for equality.
		// Object References: For objects, == compares the references, not the content. Two references are equal if they point to the same object in memory.
		// equals() Method:

		// Object Content Comparison: The equals() method is used to compare the contents of two objects.
			//  By default (as implemented in Object class), it behaves the same as ==,
			// comparing object references. However, many classes override equals() to compare the actual
			//  data of objects. For example, String, Box, and wrapper classes like Integer, Character, etc.,
			//  have their own implementation of equals() to check content equality.
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
		// 	try {

		// 		float res = divide(8, 0);
		// 	} 
		// 	catch (ArithmeticException e) {
		// 		System.out.println("Can't divide by zero");
		// 	} finally {
		// 		System.out.println("This is finally block");

		// }

		// 	var res = divide(8, 0);
		// 	System.out.println(res);

		// 	System.out.println("Wokring...");
		// 	try {
		// 	testException(-5);
		// 	testException(-10);
		// } catch(FileNotFoundException e) {
		// 	e.printStackTrace();
		// } catch(IOException e) {
		// 	e.printStackTrace();
		// } finally {
		// 	System.out.println("Releasing resources");
		// }
		// testException(15);
		

		// ○ Manipulate calendar data from java.time.LocalDateTime, formatter, period
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now);
		String curr = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss").format(now);
		System.out.println(curr);

		// Exception 

		

	} // Main close 

	public static void login (String username, String password) throws Exception {
		if (username == null || password == null) {
			throw new Exception("Username or password can't be null");
		}
		if (username.equals("admin") && password.equals("admin")) {
			System.out.println("Welcome Admin");
		} else {
			System.out.println("Invalid username or password");
		}
	}

	public static void testException(int i) throws FileNotFoundException, IOException {
		if (i < 0) {
			FileNotFoundException myException = new FileNotFoundException("Negative Integer " + i);
			throw myException;
		} else if (i > 10) {
			throw new IOException("Only supported for index 0 to 10");
		}
	
	}
		// - Handling Exceptions

		public static float divide(int a, int b) throws ArithmeticException {
			try {

				return a / b;
			}
			catch (ArithmeticException e) {
				throw e;
			}

		}
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


	
	// for(int i = 0; i < 5; i++) {
	// 	System.out.println(i);
	// }
	// int i = 100;
	// System.out.println(i);

	// 	○ Class structure
	/* public class ClassName {
		// Fields (or instance variable)
		private String field1;
		private int field2;
	
		// Constructor
		public ClassName(String field1, int field2) {
			this.field1 = field1;
			this.field2 = field2;
		}
	
		// Methods
		public String getField1() {
			return this.field1;
		}
	
		public void setField1(String field1) {
			this.field1 = field1;
		}
	
		// ... more methods
	} */
	// 	○ Run java via CMD
	   // Javac ClassName.java -> create ClassName.class
	   // Java ClassName -> run ClassName.class which is java bytecode  
	   // This .class file can then be run on any machine that has a JVM, which is what makes Java a platform-independent language.
	
	   // 	○ Compare component oo, platform independence, etc.
	// 	○ Import java packages 
	// import java.util.regex.*;

		// String email = "a@a.com";
		// String regex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$";
		// Pattern pattern = Pattern.compile(regex);
		// Matcher matcher = pattern.matcher(email);
		// System.out.println("result");
		// System.out.println(matcher.matches());
		// - Working With Java Data Types
		
	

	// 	○ All Types + Casting 
	// long l = 1000000000000000000L;
	// int integer = 1;
	// short s = 1;
	// float f = 1.0f;
	// double d = 1.0d;
	// char c = 'a';
	// boolean b = true;
	// byte by = 100;

	// 	○ Object reference variables vs primitive variables
	
	// 	○ Read object field
	// 	○ Object lifecycle (creation, dereference, reassignment and garbage collection
	// 	○ Wrapper classes Boolean, Double, Integer
		
	// - Using Operators and Decision Constructs
	// 	○ Java operators and parentheses
	// 	○ == and equals()
	// 	○ If, if else, and else statement
	// 	○ Switch statement
	// - Creating and Using Arrays
	// 	○ One dimensional array
	// 	○ Multi dimensional array
	// - Using Loop Constructs
	// 	○ while loops
	// 	○ Enhanced for loop
	// 	○ Do while
	// 	○ Break and Continue
	// 	○ Compare loop constructs
	// 	○  
	// - Working with Methods and Encapsulation
	// 	○ Access modifiers
	// 	○ Encapsulation
	// 	○ Method with return value + overloaded
	// 	○ Static methods and attributes
	// 	○ Default and user defined + overload constructors 
		
	
	// - Working with Inheritance
	// 	○ Describe inheritance and its benefits 
	// 	○ When casting is necessary
	// 	○ Polymorphism + overrides + type reference and object
	// 	○ Super keword 
	// 	○ Abstract class 
	// 	○ Interface 
	// - Handling Exceptions
	// 	○ Checked exceptions, unchecked exception, and errors
	// 	○ Method that throws an exception
	// 	○ Try-catch
	// 	○ Common exception classes(NullPointerExc, ArrayIndexOutOfBounds)
	// 	○ Advantages of exception handling
		
	// - Working with Selected classes from the Java API
	// 	○ StringBuilder class and its methods
	// 	○ ArrayList
	// 	○ Manipulate String
	// 	○ Manipulate calendar data from java.time.LocalDateTime, formatter, period 
	// 	○ Lambda expression and predicate expression

	// String [] arr = {"a", "b", "c"};
	// objectReference(arr);
	// System.out.println(arr[0]);
	// System.out.println(arr[2]);

	// int count = 5;
	// primitive(count);

	// System.out.println(count);

    

	// 	○ Object reference variables vs primitive variables
	public static void objectReference(String[] arr) {
		
		arr[0] = "new value";
	}

	public static int primitive(int a) {
		a = 10;
		return a;
	}

}
