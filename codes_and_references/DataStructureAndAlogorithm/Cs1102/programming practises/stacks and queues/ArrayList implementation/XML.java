import java.util.*;
class XML{
  public static void main(String[]args){
    Scanner scanner = new Scanner(System.in);
    String x = "";
    
    String y = scanner.nextLine();
    
    while (!y.equals("@")){
      x+=y;
      y = scanner.nextLine();
    }    
    Stack stack = new Stack();
    
    int index =0;
    
    boolean isValid = true;
    while(index<x.length()){
      
      if(x.charAt(index)=='<'&&x.charAt(index+1)=='/'){
        String temp = x.substring(index+2,x.indexOf(">",index+1));
        
        if(!stack.pop().equals(temp)){
          isValid = false;         
        }
        
        index++;
        
      }
      else if(x.charAt(index)=='<'&&x.charAt(index+1)!='/'){
        String temp = x.substring(index+1,x.indexOf(">",index+1));
        stack.push(temp);
               
        index++;
        
      }
      else{index++;}
    }    
    if(!stack.isEmpty()){
      
      isValid = false;      
    }    
    if(isValid == true){
      System.out.println("valid");
    }
    else{
      System.out.println("invalid");
    }
  }
}
