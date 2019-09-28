import java.util.*;
class WebPages{
  public static void main(String[]args){
    Scanner scanner = new Scanner(System.in);
    
    int numOfInstructions = scanner.nextInt();
    
    dataStructure stack = new dataStructure();
    
    for( int i = 1; i <=numOfInstructions; i++){
      String option = scanner.next();
      
      if(option.equals("BACK")){
        stack.back();
      }
      else if(option.equals("FORWARD")){
        stack.forward();
      }
      else{ stack.newPage(option);}
      }
  }
}