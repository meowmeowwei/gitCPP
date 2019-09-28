import java.util.*;
class Josephine{
  public static void main(String[]args){
    Scanner scanner = new Scanner(System.in);
    int numRounds = scanner.nextInt();
    int[] input = new int[numRounds*2];
    
    for( int i = 0; i < numRounds*2; i++){
      
      input[i]= scanner.nextInt();
      
      
    }
    
    for( int i=0; i <= input.length-2;i+=2){
      int numPrince = input[i];
      int k = input[i+1];
      computeResult(numPrince,k);
    }
  }
  public static void computeResult(int numPrince,int k){
    MyList list = new MyList();
    for( int i = numPrince; i >0; i--){
      list.addHead(i);
    }
    
    list.setTail();
    
    Prince current = list.tail;
    
    while(!list.checkFinished()){
      for ( int i=1; i<=k;i++){
        current=current.next;
      }
      list.deletePrince(current.number);
      //current= current.getPrev();
    }
      System.out.println(list.head.number+" ");
  }
  
  
  
}
