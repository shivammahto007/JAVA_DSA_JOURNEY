import java.util.*;

public class functions__methods {
    // NAME function
    public static void printMyName(String name) {
        System.out.println("my name is = " + name);
        return;
    }

    // ADD function
    public static int calculateSum(int a, int b) {
        int sum = a + b;
        return sum;
    }

    // MULTIPLICATION function
    public static int multiplication(int c, int d) {
        return c * d;
    }

    // print factorial
    public static void factorial(int n) {

        if (n < 0) {
            System.out.println("invalid number");
            return;
        }

        // loop
        int factorial = 1;

        for (int i = n; i >= 1; i--) {
            factorial = factorial * i;
        }
        System.out.println("factorial = " + factorial);
        return;
    }

    // check the prime number is or not
    public static boolean isPrime(int e) {

        if (e <= 1) {
            return false;
        }

        for (int i = 2; i <= e / 2; i++) {

            if (e % i == 0) {
                return false;
            }
        }
        return true;
    }

    // check even/ odd no.
    public static boolean isEven(int n) {
        if (n % 2 == 0) {
            return true;
        }
        return false;
    }

    // Print the table
    public static void table(int t) {
        for (int i = 1; i <= 10; i++) {
            int table = t * i;
            System.out.println(table);
        }
        return;
    }

    public static void main(String args[]) {

        // call the name function in mainn function
        Scanner sc = new Scanner(System.in);
        String name = sc.next();

        printMyName(name);// call kiya function ko

        // call the add function in main
        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = calculateSum(a, b);
        System.out.println("sum of two numbers = " + sum);

        // call the multiply function in main
        int c = sc.nextInt();
        int d = sc.nextInt();

        System.out.println("product of two numbers = " + multiplication(c, d));

        // call the factorial function
        int n = sc.nextInt();

        factorial(n);

        // call the prime function
        int e = sc.nextInt();

        if (isPrime(e)) {
            System.out.println("this is prime number = " + e);
        } else {
            System.err.println("this is NOT prime number = " + e);
        }

        // call the even function
        int f = sc.nextInt();

        if (isEven(f)) {
            System.out.println("This is even no. = " + f);
        } else {
            System.err.println("This is odd no. = " + f);
        }

        // call table function
        int t = sc.nextInt();

        table(t);
    }
}
