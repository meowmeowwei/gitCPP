import java.util.*;

public class Windows {

  // data members
  private Stack <Integer> openedWindows;
  private int frontWindow; // stores id of window at front
  private int counter;     // stores the next id to initialize program with
  
  // constructor
  public Windows() {
  
    
    // write your code here
    
  }
  
  
  // implement accessor methods


  
  
  // implement other methods here
  
  // this method performs the operation minimize
  public void minimize() {
    
    // implement your code here
    // 1. remove the current front window on the screen
    // 2. window previously directly below will be new front window
    
  }
  
  // this method performs the operation open
  public void open() {
    
    // implement your code here
    // 1. create a new program window
    // 2. place the new window in front
    
  }
  
  
  // this method performs the operation switch
  public void switchWindow(int id) {
   
    // implement your code here
    // 1. retrieve the desired program
    // 2. move the desired program (id) in front
    // 3. order of all other windows not changed
 
  }

}