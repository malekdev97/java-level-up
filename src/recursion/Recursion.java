package recursion;

class Recursion {

    public static void main(String[] args) {

        // Recursion rules 
        // 1- Base case: condition the breaks the loop
        // 2- Recursive case: condition that calls the function itself
   
        num(0);

        // System.out.println(flo(2.18f));
    }

    // recursive func
    public static void num(int n) {
        // condition breaks the loop
        if(n == 5) {
            System.out.println(n);
            return;
        } else {
            System.out.println(n);
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

    public static void display(int n) {
        if(n == 0) {
            return;
        }
        else {

        }
    }

    
}