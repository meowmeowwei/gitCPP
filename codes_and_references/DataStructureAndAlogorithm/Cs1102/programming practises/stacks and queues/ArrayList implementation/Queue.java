import java.util.*;
class Queue{
  private ArrayList<Object> list;
  
  public Queue(){
    list = new ArrayList<Object>();
  }
  
  public boolean isEmpty(){
    return list.isEmpty();
  }
  
  public void enqueue(Object item){
    list.add(item);
  }
  
  public Object dequeue(){
    Object obj = list.get(0);
    list.remove(0);
    return obj;
  }
  
  public void dequeueAll(){
    list.clear();
  }
  
  public Object getFront(){
    return list.get(0);
  }
}