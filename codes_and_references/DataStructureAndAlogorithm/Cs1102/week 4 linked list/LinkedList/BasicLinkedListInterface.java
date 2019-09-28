public interface BasicLinkedListInterface {
	public boolean isEmpty();
	public int size ();
	public Object getHeadElement () throws ItemNotFoundException;
	public ListNode getHeadPtr();

	public void addHead (Object item);
	public void deleteHead () throws ItemNotFoundException; 

	public void print ();
}
