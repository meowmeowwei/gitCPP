class StackLLTest{
  public static void main(String[]args)throws Underflow{
    StackLL stack = new StackLL();
    stack.push(1);
    stack.push(2);
    stack.push(3);
    Object number = stack.peek();
    stack.pop();
    //stack.pop();
    //stack.pop();
    //stack.pop();
    System.out.println(number);
    while(!stack.isEmpty()){
      System.out.println(stack.pop());
    }
  }
}