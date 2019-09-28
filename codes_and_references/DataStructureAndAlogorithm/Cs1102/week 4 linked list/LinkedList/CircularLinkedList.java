class CircularLinkedList extends ExtendedLinkedList {

  public void insertAfter (ListNode current, Object item) {
	 if (current == null) {  // insert to the head
		 if (head == null) {
			 head = new ListNode (item, null);
			 head.next = head;
		 } else {
			 head = new ListNode (item, null);
		 }
		 num_nodes++;
	 } else { // not inserting to the head
	 	 current.next = new ListNode (item, current.next);
		 num_nodes++;
	 }
  }
  
  public void deleteAfter (ListNode current) throws ItemNotFoundException {

	  if ( num_nodes == 0) throw new ItemNotFoundException("delete empty list");

	  if ( num_nodes == 1) { 
		  if (current==null || current==head) { // delete head
			  num_nodes=0;
			  head = null;
		  } else {
			  throw new ItemNotFoundException("delete fail");
		  }
		  return;
  	  }

	  if (current==null) throw new ItemNotFoundException("can't delete head");

	  // current is the last node -- so, deleting the head
	  if (current.next == head) {
		  current.next = current.next.next;
		  head = current.next;
	  } else {
	  	 current.next = current.next.next;
	  }
	  num_nodes --;
  }
  
  public boolean exists (Object item) throws ItemNotFoundException {
	  if ( head == null ) return false;
	  ListNode n = head;
	  for (int i=0; i < num_nodes; i++) { 
		  if (n.element.equals(item)) { return true; }
		  n = n.next;
	  }

	  return false;
  }

  public void delete (Object item) throws ItemNotFoundException {
	  if (head == null) throw new ItemNotFoundException("cannot find item");

	  ListNode n = head;
	  ListNode prev = null;
	  for (int i=0; i < num_nodes; i++) { 
			 if (n.element.equals(item)) {
				 deleteAfter (prev);
				 return;
			 }
			 prev = n;
			 n = n.next;
	  }

	  throw new ItemNotFoundException ("cannot find item to delete");
  }
}
