public interface BasicLinkedListInterface {
 public boolean isEmpty();
 public int size ();
 public int getHeadElement () throws ItemNotFoundException;
 public ListNode getHeadPtr();

 public void addHead (int item);
 public void deleteHead () throws ItemNotFoundException; 

 public void print ();
}
