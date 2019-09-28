class DoublyLinkedList extends TailedLinkedList {
 
  public void insertBefore (DListNode current, Object item) throws ItemNotFoundException {
    
    if (current != null) {
      DListNode temp = new DListNode (item, current, current.prev);
      num_nodes++;
      
      if (current != head) {
        current.prev.next = temp;
        current.prev = temp;
      } else {
        current.prev = temp;
        head = temp;
      }
    } else {
      throw new ItemNotFoundException("insert fails");
    }
  }
  
  public void deleteCurrent (DListNode current) {
 if (current == head && current == tail) {
  head = null;
  tail = null;
  return;
 }

    if (current != tail) {
      DListNode temp = (DListNode)current.next;
      temp.prev = current.prev; 
      num_nodes--;
    } else {
      tail = current.prev;
      tail.next = null;
      num_nodes--;
    }
    
    if (current != head) 
      current.prev.next = current.next;
    else {
      head = current.next;
   DListNode temp = (DListNode) head; // interesting !!!
   if (temp != null ) temp.prev = null;
    }
  }
  
  public void insertAfter (DListNode current, Object item) {
    
    // YOUR OWN
    
  }

  public void deleteAfter (DListNode current) {
    
    // YOUR OWN
    
  }
  
  
}
