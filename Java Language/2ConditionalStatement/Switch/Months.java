import java.util.Scanner;

public class Months {
        public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number (1-12): ");
        int num = sc.nextInt();

         switch (num) {
            case 1 : 
            System.out.println(num + " --> January");
            break;

            case 2 : 
            System.out.println(num + " --> February");
            break;

            case 3 : 
            System.out.println(num + " --> March");
            break;

            case 4 : 
            System.out.println(num + " --> April");
            break;
        
            case 5 : 
            System.out.println(num + " --> May");
            break;  

            case 6 : 
            System.out.println(num + " --> June");
            break;  
            
            case 7 : 
            System.out.println(num + " --> July");
            break;   

            case 8 : 
            System.out.println(num + " --> August");
            break;   

            case 9 : 
            System.out.println(num + " --> September");
            break;  

            case 10 : 
            System.out.println(num + " --> October");
            break;  

            case 11 : 
            System.out.println(num + " --> November");
            break; 

            case 12 : 
            System.out.println(num + " --> December");
            break;

            default :
            System.out.println("Invalid.....\nPlease enter (1-12)");

         }
        sc.close();
    }   
}
