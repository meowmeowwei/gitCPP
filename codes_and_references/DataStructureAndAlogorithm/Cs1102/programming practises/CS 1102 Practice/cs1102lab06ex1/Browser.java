import java.util.*;

public class Browser {
  
  // data members
  private Stack <String> prevPages;
  private Stack <String> fwdPages;
  private String currPage;
  
  // constructor
  public Browser() { 
    
    // implement your code here
    
  }
  
  
  //
  // accessor methods
  //

  
  // implement other methods here
  
  
  // this method should perform the operations of back button
  public void goBack() {
    
    // 1. redirect browser to previous URL
    // 2. add the current URL to the forward stack
    
    
  }
  
  
  // this method should perform the operations of fwd button
  public void goForward() {
    
    // 1. goes to next page in browsing history
    // 2. push current URL to the prev pages stack
    
    
  }

  
  
  // this method should simulate the action of user entering new URL
  public void newURL(String input) {
    
    // 1. direct current page to new URL
    // 2. insert current page to prev page
    // 3. clear the list of "forward" URLS
    
    
  }
}