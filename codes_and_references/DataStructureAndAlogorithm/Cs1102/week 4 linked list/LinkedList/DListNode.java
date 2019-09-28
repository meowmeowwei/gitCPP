class DListNode extends ListNode {
  protected DListNode prev;
  
  public DListNode (Object item, DListNode n, DListNode p) {
    super(item,n);
    
    prev = p;
  }
}
