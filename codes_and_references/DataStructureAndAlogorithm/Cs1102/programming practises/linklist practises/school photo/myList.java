class myList {
  protected listNode head;
  protected listNode tail;
  
  public void addHead(int element){
    head = new listNode(element,head, 1);
  }
  
  public void addNode(int element){
    if(head ==null){
      addHead(element);
    }
    else{
      
      int pos = 1;
      listNode current = head;
      listNode prev = null;
      
      while(current!= null){
        if(element<=current.height){
          if(current == head){
            addHead(element);
            break;
          }
          else{            
              listNode node = new listNode(element,current,pos);
              prev.next=node;
                
              break;
          }
        }
        else if(current.next==null){
          listNode node = new listNode(element, null, pos+1);
          current.next = node;
          break;
        }
        else{} 
          
         
      
        prev = current;
        current= current.next;
        
        pos++;
        
      }
    }
  }
  
  public int findPosition(int number){
    listNode current = head;
    int height =0;
    while(current!= null){
      if(number == current.height){
        height= current.position;
        break;
      }
      current = current.next;
    }
    return height;
  }
    
}
          