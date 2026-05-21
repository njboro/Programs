import java.util.Scanner;

public class CheckOddEven {

        public static void main(String[] args) {
              
         Scanner scanner = new Scanner(System.in);
         System.out.println("Input your number:");
         int a = scanner.nextInt();
        
         if(a %2==0) {
                System.out.println("Given number " +a +" is an even number");
         } else {
                System.out.println("Given number " +a +" is an odd number");
         }
         scanner.close();
                
       }
}
