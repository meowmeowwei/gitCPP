class TailedLinkedList extends ExtendedLinkedList {
  protected ListNode tail = null;
  public void addTail (Object o) {
    if (tail != null) {
      tail.next = new ListNode(o);
      tail = tail.next;
      num_nodes++;
    } else {
      tail = new ListNode(o);
      head = tail;
      num_nodes++;
    }
  }
  
  public void addHead (Object o) {
	super.addHead ( o );
	if (head.next == null)
		tail = head;
  }

/*
  public void insertAfter (ListNode current, Object item) {
    ListNode temp;
    if (current != null) {
      temp = new ListNode(item, current.next);
      current.next = temp;
      num_nodes++;
      if (temp.next == null) tail = temp;
    } else {
      head = new ListNode (item, head); 
      num_nodes++;
      if (tail == null) tail = head;
    }
  }
  
  /*/
  public void insertAfter (ListNode current, Object item) {
    super.insertAfter (current, item);
    if (current != null) {
      if (current.next.next == null)
        tail = current.next;
    } else {
      if (tail == null) tail = head;
    }
  }
  
  
}
