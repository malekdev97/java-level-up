package dynamicprogramming;
class Main {

    public static void main(String[] args) {
        System.out.println(fibonacci(6)); // Example usage
    }

    public static int fibonacci(int number) {
      if (number <= 2) {
          return 1;
      }
  
      // store the solution to the subproblem in an array
      int[] fib = new int[number + 1];
      fib[1] = fib[2] = 1;
  
      for (int i = 3; i <= number; i++) {
          fib[i] = fib[i - 1] + fib[i - 2];
      }
  
      return fib[number];
  }
}