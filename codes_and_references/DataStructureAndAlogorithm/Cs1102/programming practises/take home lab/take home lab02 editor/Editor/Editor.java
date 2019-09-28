import java.util.*;

class Editor{
  public static void main(String[]args){
    Scanner scanner = new Scanner(System.in);
    String command = scanner.nextLine();
    String finalCommand ="";
    
    for(int i = 0; i < command.length();i++){
      if( !command.substring(i,i+1).matches("[>|<|^]")){
        finalCommand = command.substring(i);
        break;
      }
    }
    
    MyList list = new MyList();
    
    for ( int i =0; i < finalCommand.length();i++){
     if(finalCommand.charAt(i)=='<'){
        list.cusorLeft();
      }
      
      else  if(finalCommand.charAt(i)=='>'){
        list.cusorRight();
      }
      else if(finalCommand.charAt(i)=='^'){
        list.delete();
      }
      else{
        list.addNode(finalCommand.charAt(i));
      }
    }
    System.out.println(list.toString());
    
  }
}