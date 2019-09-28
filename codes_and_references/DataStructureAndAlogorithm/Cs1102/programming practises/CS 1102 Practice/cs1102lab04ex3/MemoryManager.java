// this class is similar to the Linked List ADT
public class MemoryManager{

  // data members
  private int n;            // total size of memory available
  private MemoryBlock head; // pointer to first memory block
  private MemoryBlock tail; // pointer to last memory block
  private int numBlocks;    // total number of blocks in memory
  
  // constructor
  public MemoryManager(int totalSize) {
    
    // fill in your code here

  }
  
  // accessor methods
  
  
  // other helper methods
  
  // this method adds a new memory block to the end (used at the start)
  // hint: this is similar to insertion at end of linked list
  public void addNewBlock(int starting, int size) {
    
	// create new memory block
    MemoryBlock b = new MemoryBlock(starting, size);
	
    // fill in your code here
	
	numBlocks++;
   
  }
  
  // this method assigns memory based on the size
  // returns the address to the first block that is big enough to size. 
  // returns -1 if no such block
  public int allocateMemory(int size) {
    
    if (head == null) return -1; // no memory block!
    
    // pointers for traversing the memory 
    MemoryBlock prev = null;
    MemoryBlock curr = head;
    
    while ( curr != null ) {
      
      
      
      // fill in your code here
      
      // remember to take into account the 2 possibilities:
      // 1. required memory fits into block, but with remaining space (curr.getSize() > size)
      // 2. required memory fits perfectly into block (curr.getSize() = size)
      
      
      
      
    }
    
    return -1; //search till end and cannot find
  
  }
    
}
