import java.util.*;
class ClassPhoto{
  public static void main(String[]args){
    Scanner scanner= new Scanner(System.in);
    int num = scanner.nextInt();
    int [] array = new int[num];
    
    myList list = new myList();
    for(int i =0; i <num; i++){
      int height = scanner.nextInt();
      list.addNode(height);
      array[i]=height;
    }
    
   
    
    for( int p:array){
      System.out.println(list.findPosition(p));
    }
  }
}
      