class StackArr implements StackADT {
	private Object [] arr;
	private int top;
	private int maxSize;
	private final int INITSIZE = 1000;

	public StackArr() {
		arr = new Object[INITSIZE];
		top = -1;
		maxSize = INITSIZE;
	}

	public boolean isEmpty () { return (top < 0); }

	public Object pop() throws Underflow {
		Object obj = peek();
		top--;
		return obj;
	}

	public Object peek() throws Underflow {
		if (! isEmpty() ) return arr[top];
		else throw new Underflow ("Illegal operation on empty stack");
	}

	public void push (Object obj) {
		if (top >= maxSize - 1) enlargeArr();
		top++;
		arr[top] = obj;
	}

	private void enlargeArr() {
		int newSize = 2*maxSize;
		Object [] x = new Object[newSize];

		for (int j=0; j < maxSize; j++) {
			x[j] = arr[j];
		}
		maxSize = newSize;
		arr = x;
	}


}
