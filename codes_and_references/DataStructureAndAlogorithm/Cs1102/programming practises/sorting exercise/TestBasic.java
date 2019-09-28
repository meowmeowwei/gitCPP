import java.util.*;

class TestBasic {
 public static void main (String [] args) throws ItemNotFoundException {
  BasicLinkedList b1= new BasicLinkedList ();
  b1.addHead ( 10 );
  b1.addHead ( 37 );
  b1.addHead ( 14 );
  b1.addHead ( 13 );
  b1.addHead ( 29 );  
  
  int[] array = new int[b1.size()];
  
  for(int i =0; i<array.length; i++){
    array[i]= b1.getHeadElement();
    b1.deleteHead();
  }
  
  Arrays.sort(array);
  for( int i = array.length-1; i>=0; i--){
    b1.addHead(array[i]);
  }
  
  b1.print();
 }
}