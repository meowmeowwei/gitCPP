class queueTest{
  public static void main(String[]args)throws Underflow{
    queue q= new queue();
    q.enqueue("sunwei");
    q.enqueue("john");
    q.enqueue("peter");
    q.enqueue("shawn");
    q.dequeue();
    
    while(!q.isEmpty()){
      System.out.println(q.getFront());
      q.dequeue();
    }
  }
}