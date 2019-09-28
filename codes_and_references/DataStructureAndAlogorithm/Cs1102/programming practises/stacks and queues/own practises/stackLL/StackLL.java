class StackLL{
  private BasicLinkedList list;
  
  public StackLL(){
    list = new BasicLinkedList();
  }
  
  public boolean isEmpty(){
    return list.isEmpty();
  }
  
  public void push(Object o){
    list.addHead(o);
  }
  
  public Object peek()throws Underflow{
    try{
    return list.getHeadElement();
    }
    catch(ItemNotFoundException e){
      throw new Underflow("illegal operation on empty stack");
    }
  }
  
  public Object pop()throws Underflow {
    Object obj = peek();
    try{
    list.deleteHead();
    }catch(ItemNotFoundException e){
      throw new Underflow("nothing found");
    }
    return obj;
  }
}

class Underflow extends Exception{
  public Underflow(String s){
    super(s);
  }
}



