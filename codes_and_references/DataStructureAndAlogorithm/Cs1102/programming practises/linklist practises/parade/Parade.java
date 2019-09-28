import java.util.*;
class Parade{
  public static void main(String[]args){
    Scanner scanner = new Scanner(System.in);
    int numSoliders = scanner.nextInt();
    MyList list = new MyList();
    
    
    
    int head = scanner.nextInt();
    list.addHead(head);
    
    for ( int i = 2; i <= numSoliders; i++){
      int number = scanner.nextInt();
      list.addTail(number);
    }
    
    int numAwards = scanner.nextInt();
    
    ArrayList<Integer> awardees = new ArrayList<Integer>();
    
    
    
    while(numAwards>0){
      int position = scanner.nextInt();
      DlistNode current = list.locateSolider(position);
      
      list.shiftSolider(current);
      awardees.add(current.number);
      numAwards--;
    }
    
    for(int q:awardees){
      System.out.println(q);
    }
    System.out.println();
    
    DlistNode start = list.head;
    while(start!=null){
      System.out.println(start.number);
      start = start.next;
    }
  }
}
      
   
    
    