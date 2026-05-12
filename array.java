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

        // Take an array of names as input from the user and print them on the screen.
        System.out.print("enter the size of string = ");
        int size1 = sc.nextInt();

        String names[] = new String[size1];

        System.out.println("enter the names : ");
        for (int i = 0; i < size1; i++) {
            names[i] = sc.next();
        }

        /*
         * System.out.print("The final names of array = ");
         * for(int i=0; i<size1; i++){
         * System.out.print(names[i] +" , ");
         */

        // }
        for (int i = 0; i < names.length; i++) {
            System.out.println("name " + (i + 1) + " is = " + names[i]);
        }

        // Find the maximum & minimum number in an array of integers.

        System.out.print("Enter the size of array : ");
        int size2 = sc.nextInt();

        int[] numbers1 = new int[size2];

        System.out.print("enter the value of array : ");

        for (int i = 0; i < size2; i++) {
            numbers1[i] = sc.nextInt();
        }

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < numbers1.length; i++) {
            if (numbers1[i] < min) {
                min = numbers1[i];
            }
            if (numbers1[i] > max) {
                max = numbers1[i];
            }
        }

        System.out.println("largest numbers is = " + max);
        System.out.println("smallest numbers is = " + min);

        // Take an array of numbers as input and check if it is an array sorted in
        // ascending order.

        System.out.print("enter the size of array : ");
        int size3 = sc.nextInt();

        int numbers2[] = new int[size3];

        System.out.println("input the value of array : ");
        for (int i = 0; i < size3; i++) {
            numbers2[i] = sc.nextInt();
        }

        boolean isAscending = true;

        for (int i = 0; i < numbers2.length -1 ; i++) {
            if (numbers2[i] > numbers2[i + 1]) {
                isAscending = false;
            }
        }
        if (isAscending) {
            System.out.print("This is sorted array : ");

            for (int i = 0; i < numbers2.length; i++) {
                System.out.print(numbers2[i] + " , ");
            }
        }

        else {
            System.out.print("This is not sorted array:");

            for (int i = 0; i < numbers2.length; i++) {
                System.out.print(numbers2[i] + " , ");
            }

            int temp = 0;
            for (int i = 0; i < numbers2.length; i++) {
                for (int j = 0; j < numbers2.length - 1; j++) {
                    if (numbers2[j] > numbers2[j + 1]) {
                        temp = numbers2[j];
                        numbers2[j] = numbers2[j + 1];
                        numbers2[1 + j] = temp;
                    }
                }
            }

            System.out.println();
            System.out.print("Now This is sorted array : ");
            for (int i = 0; i < numbers2.length; i++) {
                System.out.print(numbers2[i] + " , ");
            }
        }
    }
}
