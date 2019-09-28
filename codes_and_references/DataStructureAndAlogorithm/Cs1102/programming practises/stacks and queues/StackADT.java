public interface StackADT {

	public boolean isEmpty();
	public void push (Object o);
	public Object pop() throws Underflow;
	public Object peek() throws Underflow;
}
