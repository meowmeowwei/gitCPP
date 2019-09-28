///////////////////////////////////////////////////
/////  /////  LogName: u0706987/////  FullName: Cao Hoang Dang
/////  CreationDate: 2008-11-06 13:27:57
/////  
///////////////////////////////////////////////////



///////////////////////////////////////////////////////
///
/// Name:
/// Matric No:
///
///////////////////////////////////////////////////////

import java.util.*;

public class Memory {
  
  public static void main (String[] args) {
    
    int n, b, r, m; // as stated in the question
    
    Scanner scan = new Scanner(System.in);
    n = scan.nextInt();
    b = scan.nextInt();
    
    // initialise memory manager and memory blocks
    MemoryManager manager = new MemoryManager(n);
    
    int prevAdd, currAdd; // for traversing the linked list
    prevAdd = scan.nextInt();
    
    
    for (int i = 0; i < b -1; i++) {
      
      // for loop should
      // 1. read in the starting memory address
      // 2. create new memory block
      
     
    }
   
 
    
    // fill in code to allocate memory
    r = scan.nextInt();
    for (int i = 0; i < r; i++) {
      
      // for loop should
      // 1. read in required memory size
      // 2. allocate memory
      // 3. print out suitable output
    }
  }
}