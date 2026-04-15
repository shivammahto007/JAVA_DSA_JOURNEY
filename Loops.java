import java.util.*;

public class Loops {
    public static void main(String[] args) {
       
         //FOR LOOPS 
        for(int i = 1; i<10; i++){
            
           System.out.println("Hello Loops");
           System.out.println(i+"");
        }

        // WHILE LOOPS
        int i = 0;
        while (i<10) {
            System.out.println(i);
            i++;
        }

        // DO WHILE LOOPS
        int f = 0;
        do{
            System.out.println(f);
            f++;
        }while(f<10);

        // PRINT SUM OF FIRST NATURAL NO.
        Scanner sc = new Scanner(System.in); 
        int n = sc.nextInt();

        int sum = 0;
        for (int s = 1; s<=n; s++){
             sum+=s;
        } System.out.println(sum);

        // print a table of a no. enter by user
        int t = sc.nextInt();

        for(int c = 1; c<=10; c++){
            System.out.println(t*c);
        }
    }
}
