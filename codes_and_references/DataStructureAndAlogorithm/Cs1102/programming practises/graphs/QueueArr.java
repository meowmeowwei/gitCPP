class QueueArr implements QueueADT {

	private Object [ ] arr;
	private int front, back;
	private int maxSize;
	private final int INITSIZE = 1000;

	public QueueArr() {
		arr = new Object[INITSIZE];
		front = 0;
		back = 0;
		maxSize = INITSIZE;
	}

	public boolean isEmpty() { return (front == back); }

	public Object dequeue( ) throws Underflow {
		Object obj = getFront( );
		arr[front] = null;
		front = (front + 1) % maxSize;
		return obj;
	}

	public Object getFront ( ) throws Underflow {
		if (isEmpty( ) ) throw new Underflow ("Invalid operation on empty q");
		else return arr[front];
	}

	public void enqueue (Object o) {
		if ( ((back+1)%maxSize) == front) enlargeArr();
		arr[back] = o;
		back = (back + 1) % maxSize;
	}

	private void enlargeArr( ) {
		int newSize = maxSize * 2;
		Object[ ] x = new Object[newSize];
		for (int j=0; j < maxSize; j++) {
			x[j] = arr[ (front+j) % maxSize ];
		}
		front = 0; 
		back = maxSize - 1;
		arr = x;
	}

}
