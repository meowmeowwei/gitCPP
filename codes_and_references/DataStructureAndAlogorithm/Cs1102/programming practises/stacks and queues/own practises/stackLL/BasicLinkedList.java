class BasicLinkedList  {

 protected ListNode head = null;
 protected int num_nodes = 0;

 public boolean isEmpty() { return (head == null ); }
 public int size() { return num_nodes; }

 public Object getHeadElement () throws ItemNotFoundException {
  if (head == null) throw new ItemNotFoundException("cannot get from an empty list");
  else return head.element;
 }

 public ListNode getHeadPtr() { return head;}

 public void addHead (Object item) {
   head = new ListNode (item, head);
   num_nodes ++;
 }

 public void deleteHead () throws ItemNotFoundException {
  if (head == null) throw new ItemNotFoundException ("cannot delete from an empty list");
  else { 
   head = head.next;
   num_nodes --;
  }
 }

 public void print() {
  ListNode ln = head;
  if (ln == null) return;
  System.out.println("Linked List is as follows:");
  System.out.println(" ");
  System.out.println("Head :");
  System.out.println("     :");
  System.out.println("     v");
      
  for (int i=0; i < num_nodes; i++) {
   System.out.println("    +-------------+");
   System.out.println(i + " : " + "|  " + ln.element + "   | . |" ); 
   ln = ln.next;
   if (ln != null) {
    System.out.println("    +-----------:-+");
    System.out.println("                :  ");
    System.out.println("                v  ");
   }
   else {
    System.out.println("    +-------------+");
    System.out.println(" ");  
   } 
  }
 }

}
