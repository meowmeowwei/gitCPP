import java.util.*;
import java.lang.*;

class PostFixCalculation{
  public static void main(String[]args)throws Underflow{
    Scanner scanner = new Scanner(System.in);
    System.out.println("pleas enter the question");
    String question = scanner.nextLine();
    String postFixQuestion= convertPostFix(question);
    
    StackArr stack = new StackArr();
    for(int i =0; i < postFixQuestion.length(); i++){
      if(postFixQuestion.substring(i,i+1).matches("[+|-|*|/]")){
        int digit1= Integer.parseInt(stack.pop());
        int digit2= Integer.parseInt(stack.pop());
        int digit3= 0;
        
        char ch= postFixQuestion.charAt(i);
        switch(ch){
          case '+': digit3= digit1+digit2;break;
          case '-': digit3= digit2-digit1;break;
          case '*': digit3= digit1*digit2;break;
          case '/': digit3= digit2/digit1;break;
        }
        
        stack.push(digit3+"");
      }
      else{
        stack.push(postFixQuestion.substring(i,i+1));
      }
    }
    System.out.println(stack.pop());
  }
  
    public static int precedence(String ch){
    char cha = ch.charAt(0);
    switch(cha){
      case '+': return 3;
      case '-': return 3;
      case '*': return 5;
      case '/': return 5;
    }
    return 0;
    }
  
  public static String convertPostFix(String question)throws Underflow{
    StackArr stack = new StackArr();
    
    String answer ="";
    
    for( int i =0; i <question.length(); i++){
      char ch = question.charAt(i);
      if(ch==('(')){
        stack.push(question.substring(i,i+1));
      }
      else if(ch==(')')){
        while(!stack.peek().equals("(")){
          answer+=stack.pop();
        }
        stack.pop();
      }
      else if(question.substring(i,i+1).matches("[*|-|/|+]")){
        
        while(!stack.isEmpty()&&!stack.peek().equals('(')&&precedence(ch+"")<=precedence(stack.peek())){
          answer+=stack.pop();
        }
        stack.push(ch+"");
      }
      else{
        answer+=ch;
      }
    }
    while(!stack.isEmpty()){
      answer+=stack.pop();
    }
    return answer;
  }
  

  }

              
       
              
              
              
              
              
              
              
              
                   
                   