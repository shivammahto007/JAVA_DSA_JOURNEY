import java.util.*;

public class Variables {
    public static void main(String[] args) {
        //Varables
        int a = 10;
        int b = 25;
        int sum = a + b ;
        System.out.println(sum); 

        int mult = a * b;
        System.out.println(mult);


        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println(name);

        // sum of two numbers by user input
        a = sc.nextInt();
        b = sc.nextInt();
        sum = a + b ;
        System.out.println(sum);




    //area of circle 
    float r = sc.nextFloat();
    float areaofcircle= 3.14f * (r*r);
    System.out.println(areaofcircle);
    }
}
