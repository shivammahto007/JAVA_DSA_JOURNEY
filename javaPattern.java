import java.util.*;

public class javaPattern {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        // full rectangle pattern

        System.out.println("print full rectangle !");
        int n = sc.nextInt();
        // int m = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n; j++) {
                System.out.print('*');

            }
            System.out.println();
        }

        // HOLLOW RECTANGLE PATTERN
        System.out.println("print hallow rectangle !");
        int a = sc.nextInt();
        // int b = sc.nextInt();

        for (int i = 1; i <= a; i++) {

            for (int j = 1; j <= a; j++) {

                if (i == 1 || j == 1 || i == a || j == a) {

                    System.out.print("*");

                } else {
                    System.out.print(" ");

                }
            }
            System.out.println();

        }

        // HALF pyramid
        System.out.println("print half pyramid !");
        int c = sc.nextInt();

        for (int i = 1; i <= c; i++) {

            for (int j = 1; j <= i; j++) {

                System.out.print("*");

            }
            System.out.println();

        }

        // inverted half pyramid
        System.out.println("print inverted half pyramid !");
        int d = sc.nextInt();

        for (int i = 1; i <= d; i++) {

            for (int j = 1; j <= d - i + 1; j++) {

                System.out.print("*");
            }
            System.out.println();
        }

        // inverted half pyramid rotated by 180 degree
        System.out.println("print half inverted pyramid rotated by 180 degree !");
        int e = sc.nextInt();

        for (int i = 1; i <= e; i++) {

            for (int j = 1; j <= e - i; j++) {
                System.out.print(" ");

            }

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // half pyramid with no.
        System.out.println("print half pyramid with no. !");
        int f = sc.nextInt();

        for (int i = 1; i <= f; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        // inverted half pyramid with no.
        System.out.println("print inverted half pyramid with no. !");
        int g = sc.nextInt();

        for (int i = g; i >= 1; i--) {

            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        // Flyod's triangle
        System.out.println("print flyod's trinagle !");
        int h = sc.nextInt();
        int number = 1;

        for (int i = 1; i <= h; i++) {

            for (int j = 1; j <= i; j++) {

                System.out.print(number + " ");
                number++;
            }
            System.out.println();
        }

        // 0-1 triangle

        System.out.println("print 0-1 triangle !");
        int k = sc.nextInt();

        for (int i = 1; i <= k; i++) {

            for (int j = 1; j <= i; j++) {

                if ((i + j) % 2 == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }

        // SOID Rhombus
        System.out.println("print solid rhombus !");
        int l = sc.nextInt();

        for (int i = 1; i <= l; i++) {

            for (int j = 1; j <= l - i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= l; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // ADVANCED PATTERN
        // Butterfly pattern
        System.out.println("print the Butterfly pattern !");
        int o = sc.nextInt();

        for (int i = 1; i <= o; i++) {
            // first part star *
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // for spaces
            for (int j = 1; j <= 2 * (o - i); j++) {
                System.out.print(" ");
            }

            // second part star *
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // second half inverted butterfly
        for (int i = o; i >= 1; i--) {
            // first part star *
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // for spaces
            for (int j = 1; j <= 2 * (o - i); j++) {
                System.out.print(" ");
            }

            // second part star *
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Number Pyramid
        System.out.println("print the number pyramid !");
        int p = sc.nextInt();

        for (int i = 1; i <= p; i++) {
            for (int j = 1; j <= p - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        // Palindromic Pattern
        System.out.println("Print the Palindromic Pattern !");
        int q = sc.nextInt();

        for (int i = 1; i <= q; i++) {
            // for spaces
            for (int j = 1; j <= q - i; j++) {
                System.out.print("  ");

            }

            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            for (int j = 2; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        // Diamond pattern
        System.out.println("print the Diamond pattern !");
        int r = sc.nextInt();

        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= r - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = r; i >= 1; i--) {
            for (int j = 1; j <= r - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // hallow buutterfly
        System.out.println("print the hallow butterfly !");
        int s = sc.nextInt();

        for (int i = 1; i <= s; i++) {
            // first part star
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            // for spaces
            for (int j = 1; j <= 2 * (s - i); j++) {
                System.out.print(" ");
            }

            // second part star *
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
        // Second half butterfly iverted
        for (int i = s; i >= 1; i--) {
            // first part star
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            // for spaces
            for (int j = 1; j <= 2 * (s - i); j++) {
                System.out.print(" ");
            }

            // second part star *
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }

        // Hallow Rombus
        System.out.println("print the hallow rohmbus !");
        int t = sc.nextInt();

        for (int i = 1; i <= t; i++) {
            for (int j = 1; j <= t - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= t; j++) {
                if (i == 1 || i == t || j == 1 || j == t) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        // pascal's triangle
        System.out.println("print the pascal's triangle !");
        int u = sc.nextInt();

        for (int i = 0; i < u; i++) {
            for (int j = 1; j <= u - i; j++) {
                System.out.print("  ");
            }
            int current_no = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(current_no + "   ");
                current_no = current_no * (i - j) / (j + 1);
            }
            System.out.println();
        }

        // print half pyraid with number
        System.out.println("print half pyramid with  numbers !");
        int v = sc.nextInt();

        for (int i = 1; i <= v; i++) {
            for (int j = 1; j <= v - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        // half inverted pyramid
        System.out.println("print the half inverted pyramid !");
        int w = sc.nextInt();

        for (int i=1; i<=w; i++) {
            for(int j=1; j<=w-i; j++){
                System.out.print(" ");
            }

            for (int j = 1; j <= w-i+1; j++) {
                System.out.print(i);
            }

            System.out.println();
        }
    }
}
