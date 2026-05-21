import java.util.*;
/**
Write a program to remove consecutive (duplicate) character in a given string. 
Input: It is a sunny day. I feel like swim in the pool. 
Output: It is a suny day. I fel like swim in the pol. 
*/
public class RemoveRepeatingString {
    public static void main(String[] args) {
      
    String str = "It is a sunny day. I feel like swim in the pool.";
  
    char[] ch = str.toCharArray();
    
    StringBuilder output = new StringBuilder();
    
     for(int i = 0;i<ch.length;i++){
       if(i == 0 || ch[i] !=ch[i-1]){
         output.append(ch[i]);
       }
      
     }  
     
     System.out.println(output);
    
  }
}
