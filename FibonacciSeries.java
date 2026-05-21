import java.util.*;

public class FibonacciSeries {
    public static void main(String[] args) {
     printFibonacci(10);
    }
    
    public static void printFibonacci(int num){
      
      int a = 0;
      int b = 1;
      int c = 1;
      
      System.out.println(a);
      System.out.println(b);
      System.out.println(c);
      
      for(int i=1;i<=num-3;i++){
        
        a=b;
        b=c;
        c=a+b;
        
        System.out.println(c);
      }
    } 
}
