package recursion;

class Recursion {

    public static void main(String[] args) {

        // Recursion rules 
        // 1- Base case: condition the breaks the loop
        // 2- Recursive case: condition that calls the function itself
   
        // num(0);
        
        System.out.println(sum(5));
        // System.out.println(sum(10));
        // System.out.println(sumLoop(10));
        // System.out.println(flo(2.18f));

        //System.out.println("Loop");
        //incrementLoop(5);

        // System.out.println("Recursion");
        // incrementRecursion(5);

        // two recursive functions 
        // fun1(5);
        // funcPrint(4);
    }



    public static void incrementLoop(int number) {
        int counter = 1;
        while(counter <= number) {
            System.out.println(counter);
            counter++;
        } 
    }

    public static void incrementRecursion(int number) {
        // 1- Base case = condition to break loop
        if(number <= 0) {
            return;
        }
        System.out.println(number);
        // 2- call recursion 
        incrementRecursion(number - 1);
    }


    // n = 5
    public static void fun1(int n) {
        if (n <= 0) {
            System.out.println("fun1: " + n);
            return;
        } else {
            System.out.println("fun1: " + n);
            fun2(n - 1);
        }
    }

    public static void fun2(int n) {
        if (n <= 0) {
            System.out.println("fun2: " + n);
            return;
        } else {
            System.out.println("fun2: " + n);
            fun1(n - 1);
        }
    }

    // recursion multiple return and track 
    public static void funcPrint(int num) {
        
    if(num <= 0) {
        return;
    }

    funcPrint(num - 1);

    System.out.println(num);

}

    // sum k to 1 using loop
    public static int sumLoop(int k) {
        int sum = 0;
        for(int i = k; i > 0; i--) {
            sum += i;
        }
        return sum;
    }

    // recursive function 
    // if n > 5 then return
    public static void num(int n) {
        // condition breaks the loop
        if(n >= 5) {
            System.out.println(n);
            return;
        } else {
            // self call the function
            num(n + 1);
        }
    }

    // recusrive with return float
    public static float flo(float f) {
        if(f > 10) {
            return f;
        }
        else {
            return flo(f+1.25f);
        }
        
    }

    // sum k to 1
    public static int sum(int k) {
        // Base case
        if (k <= 0) {
            return 0;
            // Recursive call
        } else {
            /* 1. Add your code here */
            k += sum(k - 1);
            return k;
        }
    }

}