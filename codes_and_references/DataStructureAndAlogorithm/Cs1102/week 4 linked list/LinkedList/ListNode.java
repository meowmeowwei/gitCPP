class ListNode {
	protected Object element;
	protected ListNode next;

	public ListNode (Object item) { element = item; next = null; }
	public ListNode (Object item, ListNode n) { element = item; next=n;}

	public ListNode getNext (ListNode current) throws ItemNotFoundException {
		if (current == null) throw new ItemNotFoundException ("No next node");
		else return current.next;
	}

	public Object getElement (ListNode current) throws ItemNotFoundException {
		if (current == null) throw new ItemNotFoundException ("No such node");
		else return current.element;
	}
}