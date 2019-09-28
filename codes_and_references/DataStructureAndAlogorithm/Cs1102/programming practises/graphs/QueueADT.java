public interface QueueADT {
	public void enqueue (Object o);
	public Object dequeue() throws Underflow;
	public Object getFront() throws Underflow;
	public boolean isEmpty();
}
