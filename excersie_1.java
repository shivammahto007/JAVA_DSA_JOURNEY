import java.util.Scanner;

public class excersie_1 {

    // 1.Q first question average of 3 numbers
    public static float average(float a, float b, float c) {

        float Average = (a + b + c) / 3;
        return Average;
    }

    // 2.Q questio sum of odd no.

    public static int sumOfOddno(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                sum = sum + i;
            }
        }
        return sum;

    }

    // 3.Q find the greater no. between two no.

    public static int greater(int e, int f) {
        if (e > f) {
            return e;
        } else {
            return f;
        }
    }

    // 4.Q circumference of a circle

    public static double circumferenceOfCircle(double r) {

        double Circle = 2 * Math.PI * r;

        return Circle;
    }

    public static boolean votingEligibility(int age) {

        if (age >= 18) {
            return true;
        } else {
            return false;

        }
    }

    // 6.Q make infinite loop

    public static void makeInfinite() {
        do {
            System.out.println("Infinite Loop");
        } while (true);
    }

    // 8.Q calculate the power

    public static int power(int x, int n) {
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result = result * x;
        }
        return result;
    }

    // 9.Q = make the function of GCD/HCF

    public static int calculatteGCD(int n1, int n2) {

        int min = (n1 < n2) ? n1 : n2;
        int gcd = 1;

        for (int i = min; i >= 1; i--) {

            if (n1 % i == 0 && n2 % i == 0) {

                gcd = i;
                break;
            }

        }
        return gcd;
    }

    // 10.Q = funtion of fibonacci series

    public static void printFibonacci(int f) {
        int a = 0;
        int b = 1;

        for (int i = 1; i <= f; i++) {
            System.out.print(+a + " ");
            int nextnum = a + b;

            a = b;
            b = nextnum;
        }
        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1.Q call the avearage function

        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();

        float result = average(a, b, c);
        System.out.println("1.Q = The avearge is = " + result);

        // 2.Q call the sum function
        int d = sc.nextInt();

        System.out.println("2.Q = The sum of odd no. = " + sumOfOddno(d));

        // 3.Q call the function
        int e = sc.nextInt();
        int f = sc.nextInt();

        int Greater = greater(e, f);
        System.out.println("3.Q = The greater no. is = " + Greater);

        // 4.Q call the circle function

        double r = sc.nextDouble();

        System.err.println("4.Q = The circumference of circle = " + circumferenceOfCircle(r));

        // 5.Q call the age function

        int age = sc.nextInt();

        boolean finalage = votingEligibility(age);

        if (finalage) {
            System.out.println("5.Q = eligible for voting give vote = " + age);
        } else {
            System.out.println("5.Q = NOT eleigible for voting = " + age);
        }

        // 6.Q call the infinite function

        // makeInfinite();

        // 7.Q = Write a program to enter the numbers till the user wants and at the end
        // it
        // should display the count of positive, negative and zeros entered.

        int positive = 0, negative = 0, zeros = 0;
        int num;

        int choice;

        do {

            System.out.println("enter the number");

            num = sc.nextInt();

            if (num > 0) {
                positive++;
            } else if (num < 0) {
                negative++;
            } else {
                zeros++;
            }
            System.out.println("Do you want to continue ? (press 1 for Yes or press 0 for No)");

            choice = sc.nextInt();

            while (choice != 1 && choice != 0) {
                System.out.println("enter only 1 for continue or 0 for stop");
                choice = sc.nextInt();
            }
        } while (choice == 1);

        System.out.println("positive numbers = " + positive);
        System.out.println("negative numbers = " + negative);
        System.out.println("zeros entered = " + zeros);

        // 8.Q call the power function
        int x = sc.nextInt();
        int n = sc.nextInt();

        int finalResult = power(x, n);
        System.out.println("8.Q = The power of two no. = " + finalResult);

        // 9.Q = call the GCD function

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        // int finalGCD = calculatteGCD(n1, n2);
        System.out.println("9.Q = The GCD/HCF is = " + calculatteGCD(n1, n2));

        // 10.Q = call the fibonacci function
        int p = sc.nextInt();
        printFibonacci(p);

    }

}
