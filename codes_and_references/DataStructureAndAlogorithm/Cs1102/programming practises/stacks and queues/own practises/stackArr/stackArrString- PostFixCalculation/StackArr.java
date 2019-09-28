class StackArr {
  private String[]arr;
  private int top;
  private int maxSize;
  private int initialSize=100;
  
  public StackArr(){
    arr= new String[initialSize];
    top=-1;
  }
  
  public boolean isEmpty(){
    return (top<0);
  }
  
  public boolean isFull(){
    return (top==initialSize-1);
  }
  
  public void push(String obj){
    if(isFull()){
      String[]arr2= new String[initialSize*2];
      maxSize= initialSize*2;
      top=-1;
      for(int i =0; i<arr.length; i++){
        arr2[i]=arr[i];
        top++;
      }
      initialSize=maxSize;
      arr=arr2;
    }
    arr[top+1]=obj;
    top++;
  }
  
  public String peek()throws Underflow{
    if(!isFull()){
      return arr[top];
    }
    else {
      throw new Underflow("illegal op on empty stack");
    }
  }
  
  public String pop()throws Underflow{
    
    String obj = peek();
    top--;
    return obj;
  }
}

class Underflow extends Exception{
  public Underflow(String s){
    super(s);
  }
}



