import java.util.Scanner;

public class calculatorH {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);
        
        // CALLCULATOR HOMEWORK 
        System.out.println("enter first nummber (a) :" );
        float a = sc.nextFloat();

        System.out.println("enter second number (b) :");
        float b = sc.nextFloat();

        System.out.println("enter operation (add:+, sub:-,mult:*, div:/, mod:%): ");
        char operator = sc.next().charAt(0);

        switch (operator) {
            case '+': System.out.println(a + b);
                 break;
            
            case '-' : System.out.println(a - b);
                 break;
            
            case '*' : System.out.println(a * b);
                 break;
                 
            case '/' : System.out.println(a / b);
                 break;
        
            case '%' : System.out.println(a % b);
                 break;       

        
            default: System.out.println(" invalid operator");
                break;
        }

            

        // PRINT MONTH NAME BY USER ENTER NO. 
        System.out.println("enter month no. (1-12) :");
        int month = sc.nextInt();

        switch (month) {
            case 1: System.out.println("JANUARY");
                break;

            case 2: System.out.println("FEBRUARY");
                break;
            
            case 3: System.out.println("MARCH");
                break;
                   
            case 4: System.out.println("APRIL");
                break;

            case 5: System.out.println("MAY");
                break;

            case 6: System.out.println("JUNE");
                break; 
                
            case 7: System.out.println("JULY");
                break;

            case 8: System.out.println("AUGUST");
                break;
            
            case 9: System.out.println("SEPTEMBER");
                break;
                   
            case 10: System.out.println("OCTOBER");
                break;

            case 11: System.out.println("NOVEMBER");
                break;

            case 12: System.out.println("DECEMBER");
                break;      
            
            default: System.out.println("invalid no. enter only between 1 - 12");
                break;
        }
    }
    
}
