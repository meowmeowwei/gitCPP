import java.util.*;

class Queue {
  private LinkedList<Person> list;
  
  public Queue(){
    
    list = new LinkedList<Person>();
  }
  
  public void enqueue(Person x){
    list.add(x);
  }
  
  public Person dequeue(){
    //list remove option will return things
    return list.remove();
  }
  
  public Person getFront(){
    
    return list.peek();
  }
  
  public boolean isEmpty(){
    return (list.size()==0);
  }
}

class Person{
  private int age;
  protected int height;
  
  public Person(){
    age = 5;
    height = 5;
  }
  
}
    