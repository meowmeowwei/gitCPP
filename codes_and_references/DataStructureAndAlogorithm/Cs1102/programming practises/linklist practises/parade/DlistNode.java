  class DlistNode{
  protected int number;
  protected DlistNode next;
  protected DlistNode prev;
  
  
  public DlistNode(int element){
    number = element;
    next = null;
    prev = null;
  }
  
  public DlistNode(int element, DlistNode nex, DlistNode prev){
    number = element;
    next = nex; 
    this.prev = prev;
  }
}
