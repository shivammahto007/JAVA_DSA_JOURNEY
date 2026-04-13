import java.util.*;
public class conditional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if( age>=18){
            System.out.println("adult");
            }
            else{
                System.out.println("young");
            }

        int x = sc.nextInt();
        
          if ( x % 2 == 0){
            System.out.println("even");
          }
          else{
            System.out.println("odd");
          }

          int a = sc.nextInt();
          int b = sc.nextInt();

          if (a == b ){
            System.out.println("equal");
          }
          else 
            if (a > b){
            System.out.println("a greater than");
          }
          else{
            System.out.println("b is greater");
          }

          int button = sc.nextInt();
             
            if ( button == 1){
                System.out.println("Hello");
            }
            else if( button == 2){
                System.out.println("Namaste");
            }
            else if( button == 3){
                System.out.println("bonjour");
            }
            else{
                System.out.println("invalid");
            }

            switch (button) {
                case 1: System.out.println("Hello");
                break;
                
                case 2: System.out.println("Namaste");
                break;
                
                case 3: System.out.println("bonjour");
                break;

                default : System.out.println("Invalid button");
                    
            }
          }
        }
    

