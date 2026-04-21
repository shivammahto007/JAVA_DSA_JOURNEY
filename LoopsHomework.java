import java.util.Scanner;

public class LoopsHomework {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // PRINT EVEN NO.
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        // INFINITE LOOPS
        // for (; ;) {
        // System.out.println("apna college");
        // }

        int input;
        do {
            System.out.println("press 1 to enter marks or 0 to stop");
            input = sc.nextInt();

            while (input != 1 && input != 0) {
                System.out.println("only enter input (1 or 0).");
                input = sc.nextInt();
            }

            if (input == 1) {
                System.out.println("enter students marks (out of 100)");
                int marks = sc.nextInt();

                if (marks >= 90 && marks <= 100) {
                    System.out.println("This is Good.");

                } else if (marks >= 60 && marks <= 89) {
                    System.out.println("This is also Good.");
                } else if (marks >= 0 && marks <= 59) {
                    System.out.println("This is Good as well.");

                } else {
                    System.out.println("This is invalid enter only (0 - 100).");
                }

            } else if (input == 0) {
                System.out.println("program stopped");

            } else {
                System.out.println("invalid input ' only input 1 or 0'");
            }
        } while (input == 1);

    }
}
