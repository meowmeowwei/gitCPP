// after deleting away the node, the the link is still there ?  current still pointing at the node 
// get prev method !
public class MyList {
  protected Prince head =null;
  protected Prince tail =null;
  
  
  private int numPrince = 0;
  
  public boolean checkFinished(){
    return (numPrince==1) ;
  }
  
  public void addHead(int number){
    head = new Prince(number,head);
    
    numPrince++;
  }
  
  
  
  public Prince getHead(){
    return head;
  }
  
  public void setTail(){
    for(Prince temp = head; temp!=null;temp=temp.next){
      tail = temp;
    }
    
    tail.next = head;
  }
  
  
  
  
  public void deletePrince(int num){
    
    
    Prince current = head;
    Prince prev    = tail;
    
    do{
      
      if(current.number==num){
        if(current==head){
          head=head.next;
          tail.next=head;
          System.out.print(current.number+" ");
          numPrince--;
        }
        
        else if(current==tail){
          tail=prev;
          tail.next=head;
          System.out.print(current.number+" ");
          numPrince--;
        }
        else{
          prev.next=current.next;
          System.out.print(current.number+" ");
          numPrince--;
        }
        
        
        
      }
      prev = current;
      current = current.next;
    } while(current!=head);
    
  }
  public String toString(){
    String a = head.number+" ";
    for ( Prince b= head.next; b!=head;b= b.next){
      a+=b.getNumber()+" ";
    }
    return a;
  }
  
  public Prince getPrev(Prince prince){
    Prince previous = null;
    for(Prince prev= tail, current = head;prev!=prince;prev=current, current=current.next){
    previous=prev;
    }
    return previous;
    
  
    
  }
}

class Prince{
  protected int number;
  protected  Prince next;
  
  public Prince(int number){
    this.number = number;
    next = null;
  }
  
  public Prince(int number, Prince prince){
    this.number = number;
    next = prince;
  }
  
  public Prince getNext(){
    return next;
  }
  
  public int getNumber(){
    return number;
  }
  
}

