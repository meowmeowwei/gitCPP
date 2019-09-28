class ExtendedLinkedList extends BasicLinkedList {
	public void insertAfter (ListNode current, Object item) {
		if (current != null) { 
			current.next = new ListNode (item, current.next);
			num_nodes++;
		} else {
			head = new ListNode (item, head);
			num_nodes++;
		}
	}

	public void deleteAfter (ListNode current) throws ItemNotFoundException {
		if (current != null) {
			if (current.next != null) {
				current.next = current.next.next;
				num_nodes --;
			} else throw new ItemNotFoundException("No next node to delete");
		} else { // if current is null, assume we want to delete head
			if (head != null) {
				head = head.next; 
				num_nodes --;
			} else throw new ItemNotFoundException("No next node to delete");
		}
	}

	public boolean exists (Object item) throws ItemNotFoundException {
		for (ListNode n = head; n!= null; n = n.next)
			{ if (n.element.equals(item)) return true; };

		return false;
	}

	public void delete (Object item) throws ItemNotFoundException {
		if (head == null) throw new ItemNotFoundException ("cannot find item to delete");

		for (ListNode n=head, prev=null; n != null; prev=n, n=n.next) {
			if (n.element.equals(item) ) {
				deleteAfter (prev);
				return;
			}
		}

		throw new ItemNotFoundException ("cannot find item to delete");
	}
}
