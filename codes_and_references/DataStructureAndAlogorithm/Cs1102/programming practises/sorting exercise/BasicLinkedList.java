class BasicLinkedList implements BasicLinkedListInterface {

 protected ListNode head = null;
 protected int num_nodes = 0;

 public boolean isEmpty() { return (head==null); }
 public int size() { return num_nodes; }

 public int getHeadElement () throws ItemNotFoundException {
  if (head == null) throw new ItemNotFoundException("cannot get from an empty list");
  else return head.element;
 }

 public ListNode getHeadPtr() { return head;}

 public void addHead (int item) {
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

 public void moveLargestTo(int kPosition) {
  // this method moves the largest of the first k+1 items to the kPosition 

  
 }

 public void print() {
  ListNode ln = head;
  if (ln == null) return;
  System.out.print("Linked List is as follows:");
      
  for (int i=0; i < num_nodes; i++) {
   System.out.print(" " + ln.element ); 
   ln = ln.next;
  }
  System.out.println();
 }
}
