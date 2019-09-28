import java.util.*;
class Stack{
  private ArrayList<Object> list;
  
  public Stack(){
    list = new ArrayList<Object>();
  }
  
  public boolean isEmpty(){
    return list.isEmpty();
  }
  
  public void push(Object item){
    list.add(0,item);
  }
  
  public Object pop(){
    Object obj = list.get(0);
    list.remove(0);
    return obj;
  }
  
  public void popAll(){
    list.clear();
  }
  
  public Object peek(){
    return list.get(0);
  }
}