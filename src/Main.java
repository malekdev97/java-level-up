public class Main{
  
  public static void main(String[] args) throws InterruptedException{  


    countDown(10);
  } 

  public static int countDown(int num) {
    if(num == 0) {
      return 0;
    } else {
      System.out.println(num);
      num = num - 1;
      return countDown(num);
    }
    
  }


  public static boolean isPrime(int n, int i) {
    if (n <= 2) {
      return (n == 2) ? true : false;
    }
    if (n % i == 0) {
      return false;
    }
    if (i * i > n) {
      return true;
    }
    return isPrime(n, i + 1);
  }
}