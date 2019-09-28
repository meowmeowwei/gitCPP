import java.util.*;
public class dataStructure{
  
  private Stack<String> currentPages = new Stack<String>();
  private Stack<String> previousPages = new Stack<String>();
  
  public void back(){
    
    if(!currentPages.isEmpty()){
      String temp = currentPages.pop();
      if(currentPages.isEmpty()){
        currentPages.push(temp);
        System.out.println(currentPages.peek());
      }
      else{
        previousPages.push(temp);
        System.out.println(currentPages.peek());
      }
    }
     
  }
  
  public void forward(){
    if(!previousPages.isEmpty()){
      currentPages.push(previousPages.pop());
      System.out.println( currentPages.peek());
    }
    else{
      if(!currentPages.isEmpty()){
      System.out.println( currentPages.peek());
    }
    }
  }
  
  public void newPage(String page){
    currentPages.push(page);
    clear(previousPages);
    System.out.println( currentPages.peek());
  }
  
  public void clear(Stack<String> pages){
    while(!pages.isEmpty()){
      pages.pop();
    }
  }
}
      
  
  