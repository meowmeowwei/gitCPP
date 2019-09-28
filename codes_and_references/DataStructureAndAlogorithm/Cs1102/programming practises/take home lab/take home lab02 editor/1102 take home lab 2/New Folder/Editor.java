///////////////////////////////////////////////////
/////  
/////  LogName: u0906785
/////  FullName: sun wei
/////  CreationDate: 2010-02-10 20:48:55
/////  
///////////////////////////////////////////////////



import java.util.*;

public class Editor {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String command = scanner.nextLine();
    String finalCommand ="";
    for(int i = 0; i < command.length();i++){
      if( !command.substring(i,i+1).matches("[>|<|^]")){
        finalCommand = command.substring(i);
        break;
      }
    }
    DoublyLinkedList list = new DoublyLinkedList();
    for(int i=0; i < finalCommand.length();i++){
      if(finalCommand.charAt(i)=='<'){
        list.cusorLeft();
      }
      
      else  if(finalCommand.charAt(i)=='>'){
        list.cusorRight();
      }
      else if(finalCommand.charAt(i)=='^'){
        list.deleteNode();
      }
      else{
        list.addNode(finalCommand.substring(i,i+1));
      }
    }
    System.out.println(list.toString());
    
  }
}



class DlistNode{
  protected String element;
  protected DlistNode next;
  protected DlistNode prev;
  
  public DlistNode(String element){
    this.element = element;
    next = null;
    prev = null;
    
  }
  
  public DlistNode(String element, DlistNode next, DlistNode prev){
    this.element = element;
    this.next = next;
    this.prev = prev;
  }
}

class DoublyLinkedList{
  protected DlistNode head =null;
  protected DlistNode cusor =null;
  protected boolean doBefore = false;
  protected int size = 0;
  
  public void addHead(String element){
    if(size==0){
      head = new DlistNode(element);
      cusor = head;
      size++;
    }
    else{
      DlistNode node = new DlistNode(element,head,null);
      head.prev = node;
      head = node;
      cusor= head;
      size++;
    }
    
  }
  
  public void insertBefore(DlistNode node,String item){
    if ( node == head){
      addHead(item);
    }
    else{
      DlistNode newNode = new DlistNode(item, node, node.prev);
      
      newNode.prev.next = newNode;
      cusor= newNode;
      node.prev= newNode;
      size++;
    }
  }
  
  public void insertAfter(DlistNode node,String item){
    
    DlistNode newNode = new DlistNode(item,node.next,node);
    node.next = newNode;
    if(newNode.next!=null){
      newNode.next.prev= newNode;
    }
    cusor = newNode;
    size++;
    
  }
  
  public String  toString(){
    String answer = "";
    
    for(DlistNode node = head; node!=null; node = node.next){
      answer+=(node.element);
    }
    return answer;
  }
  
  public void cusorLeft(){
    if(cusor!=null){
      if(cusor==head){
        doBefore = true;
      }
      else{
        cusor = cusor.prev;
      }
    }
  }
  
  public void cusorRight(){
    if(cusor!=null){
      if(cusor.next == null){
        doBefore = false;
      }
      else{
        cusor = cusor.next;
      }
    }
  }
  
  public void addNode(String element){
    if(size==0){
      addHead(element);
    }
    else if(doBefore==true){
      insertBefore(cusor,element);
      doBefore =false;
    }
    else{
      insertAfter(cusor,element);
    }
  }
  
  public void deleteNode(){
    if(size==1){
      cusor = null;
      head = null;
      size--;
      doBefore=false;
      
    }
    if(size==0){
    }else{
      
      if(cusor.next!=null){
        if(cusor.next.next==null){
          cusor.next =null;
          size--;
        }
        else{
          cusor.next=cusor.next.next;
          
          cusor.next.prev= cusor;
          size--;
        }
      }
    }
  }
  
}











