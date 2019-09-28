class ListNode {
	protected Object element;
	protected ListNode next;

	public ListNode (Object item) { element = item; next = null; }
	public ListNode (Object item, ListNode n) { element = item; next=n;}

	public ListNode getNext ( ) throws ItemNotFoundException {
		if (this == null) throw new ItemNotFoundException ("No next node");
		else return next;
	}

	// cheat -- only handle integer values
	public int getElement ( ) throws ItemNotFoundException {
		if (this == null) throw new ItemNotFoundException ("No such node");
		else return (Integer)element;
	}
}
