class Main {
  public static void main(String[] args) {
    int n = 6;
    // 0 + 1 = 1
    // 1 + 1 = 2
    // 2 + 3 = 5
    // 3 + 5 = 8
    System.out.println(fib(n));
}

  public static int fib(int n) {
      if (n <= 1) {
          return n;
      }
      return fib(n - 1) + fib(n - 2);
    }
  
  
}
