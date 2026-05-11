import java.util.Scanner;

public class array {
    public static void main(String args[]) {

        int[] marks = new int[3];

        marks[0] = 97;
        marks[1] = 99;
        marks[2] = 100;

        // int Marks[] ={97 , 99, 100};

        for (int i = 0; i <= 2; i++) {
            System.out.println(marks[i]);

        }
        // Desfine array size by input from user

        Scanner sc = new Scanner(System.in);

        System.out.print("enter the size of array :");
        int size = sc.nextInt();

        int[] numbers = new int[size];

        System.out.println("enter the value of array :");
        for (int i = 0; i < size; i++) {

            numbers[i] = sc.nextInt();
        }
        System.out.print(" The final array : ");
        for (int i = 0; i < size; i++) {

            System.out.print(numbers[i] + ", ");
        }
        System.out.println();

        // make a array and find index of x number
        System.out.print("enter the size of array : ");
        int Size = sc.nextInt();

        int Numbers[] = new int[Size];

        System.out.println("enter the value of array :");
        for (int i = 0; i < Size; i++) {
            Numbers[i] = sc.nextInt();
        }

        System.out.print("The final array : ");
        for (int i = 0; i < Size; i++) {
            System.out.print(Numbers[i] + ", ");
        }
        System.out.println();
        System.out.print("enter the x number to find their index position :");
        int x = sc.nextInt();

        for (int i = 0; i < Numbers.length; i++) {

            if (Numbers[i] == x) {
                System.out.println("x found at index = " + i);
            }
        }
    }
}
