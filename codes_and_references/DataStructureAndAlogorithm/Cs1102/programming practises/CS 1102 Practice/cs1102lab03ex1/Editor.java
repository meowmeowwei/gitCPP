///////////////////////////////////////////////////
/////  /////  LogName: u0706987/////  FullName: Cao Hoang Dang
/////  CreationDate: 2008-09-11 15:55:55
/////  
///////////////////////////////////////////////////



import java.util.*;

public class Editor {
  public static void main(String[] args) {
    
    ListNode head   = null; // points to the head of the list
    ListNode cursor = null; // node that it is currently pointing to
    
    Scanner scan = new Scanner(System.in); // to read from user input
    String input = scan.next();
    
    char c;    // stores the input character
    int i = 0; // denote the char position in input string
    while (i < input.length()) {
      
      c = input.charAt(i++);
      
      switch(c) {
        // complete this
        
        case "<": //move cursor backward, what if cursor already null?
            
        case ">": //move cursor forward, what if cursor already null?
        case "^": //delete the next node of cursor
        default: //take in the character, what if the input are "&"...
            

      }
    }
    
    // remember to print the output!


  }
}
