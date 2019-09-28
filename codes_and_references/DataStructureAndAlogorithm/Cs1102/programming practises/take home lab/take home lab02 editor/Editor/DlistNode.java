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