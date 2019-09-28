class MyList{
  private DlistNode head = null;
  private DlistNode cusor = null;
  private int size = 0;
  private boolean doLeft= false;
  
  public void addHead(char element){
    
    head = new DlistNode(element,head,null);
    size++;
    cusor = head;
    
  }
  
  public void insertAfter(char element){
    
    DlistNode node = new DlistNode(element, cusor.getNext(),cusor);
    cusor.setNext(node);
    if(node.getNext()!=null){
      node.getNext().setPrev(node);
    }
    cusor = node;
    size++;
  }
  
  public void insertBefore(char element){
    
    DlistNode node = new DlistNode(element,cusor,cusor.getPrev());
    
    if(cusor == head){
      head.setPrev(node);
      cusor = node;
      head = cusor; 
      size++;
    }
    else{
      cusor.getPrev().setNext(node);
      cusor.setPrev(node);
      cusor = node;
      size++;
    }
  }
  
  public void delete(){
    if(size==1){
      head = null;
      cusor = null;
      size--;
      doLeft = false;
    }
    if(size!=0){
      
      if(cusor.getNext()!=null){
        cusor.setNext(cusor.getNext().getNext());
        if(cusor.getNext()!=null){
          cusor.getNext().setPrev(cusor);
        }
        size--;
      }
    }
  }
  
  public void cusorLeft(){
    if(cusor!=null){
      if(cusor==head){
        doLeft = true;
      }
      else{
        cusor= cusor.getPrev();
      }
    }
  }
  
  public void cusorRight(){
    if(cusor!=null){
      if(cusor.getNext()==null){
        doLeft=false;
      }
      else{
        cusor=cusor.getNext();
      }
    }
  }
  
  
  public boolean getBoolean(){
    return doLeft;
  }
  
  public void setBoolean(boolean isBoolean){
    doLeft = isBoolean;
  }
  
  public String  toString(){
    String answer = "";
    
    for(DlistNode node = head; node!=null; node = node.getNext()){
      answer+=(node.getChar());
    }
    return answer;
  }
  
  public void addNode(char element){
    if(size==0){
      addHead(element);
    }
    else if(doLeft== true){
      insertBefore(element);
      doLeft= false;
    }
    else{
      insertAfter(element);
    }
  }
  
  
}

class DlistNode{
  private char element;
  private DlistNode next;
  private DlistNode prev;
  
  public DlistNode(char element){
    this.element = element;
    next = null;
    prev = null;
  }
  
  public DlistNode(char element, DlistNode nex, DlistNode b4){
    this.element = element;
    next = nex;
    prev = b4;
  }
  
  
  
  public DlistNode getNext(){
    return next;
  }
  
  public DlistNode getPrev(){
    return prev;
  }
  
  public void setNext(DlistNode nex){
    next = nex;
  }
  
  public void setPrev(DlistNode prev){
    this.prev = prev;
  }
  
  public char getChar(){
    return element;
  }
}
