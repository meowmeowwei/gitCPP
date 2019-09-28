class testQueue{
  public static void main(String[]args){
    Queue q = new Queue();
    
    for(int i = 1; i <=5; i++){
      Person p = new Person();
      q.enqueue(p);
    }
    
    q.dequeue();
    System.out.println(q.dequeue().height);
    System.out.println(q.getFront().height);
  }
}