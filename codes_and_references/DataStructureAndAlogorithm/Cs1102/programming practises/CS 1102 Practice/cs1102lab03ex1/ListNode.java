import java.util.*;

// You can get some practice by implementing your own Linked List for this lab.
public class ListNode {
  
  // data members
  private char c; // this character
  private ListNode prev;
  private ListNode next;
  
  // constructor
  public ListNode(char character, ListNode p, ListNode n) {
    // complete the constructor
    c=character;
    prev=p;
    next=n;
    
  }
  
  // define accessor methods
  // get next node
  public ListNode getNext(ListNode current) throws ItemNotFoundException{

      if (current==null)
          throw new ItemNotFoundException("No next node");
      else return current.next;
  }
  
  //get current node
  public char getElement(ListNode current) throws ItemNotFoundException{

        if (current == null)
            throw new ItemNotFoundException("No such node");
        else return current.element;
  }

  //get previous node
  public 
    


  


  //public void moveBackward(){


 
  
  
  // define mutator methods
  // hint: you do not need a character mutator. Why?

  
  
  
  // method to print the list starting from current node
  public void printList() {

    // complete this method



  }
  
}
