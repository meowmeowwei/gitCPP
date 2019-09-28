class MyList{
  protected DlistNode head=null;
  protected DlistNode tail=null;
  
  public void addHead(int element){
    head = new DlistNode(element, head, null);
    if( head.next== null){
      tail = head;
    }
  }
  
  public void addTail(int element){
    tail.next = new DlistNode(element, null, tail);
    tail = tail.next;
  }
  
  public void shiftSolider(DlistNode node){
    if(node== tail){}
    else if(node== head){
      head = head.next;
      addTail(node.number);
    }
    else{
      if(node.prev!=null){
      node.prev.next = node.next;
      }
      node.next.prev= node.prev;
      addTail(node.number);
    }
  }
  
  public DlistNode locateSolider(int position){
    DlistNode current = head;
      for ( int j =1; j<position; j++){
        if(current.next!=null){
          current = current.next;
        }
      }
      return current;
  }
}
      
    
    