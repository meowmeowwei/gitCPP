class listNode{
  protected int height;
  protected listNode next;
  protected int position;
  
  public listNode(int h){
    height = h;
    next = null;
    position = 0;
  }
  
  public listNode(int h, listNode n, int pos){
    height = h;
    next = n;
    position = pos;
  }
}
  