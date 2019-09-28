class QueueLLE extends TailedLinkedList implements QueueADT {

	//public boolean isEmpty() { return super.isEmpty(); }
	public void enqueue (Object o) { addTail(o); }
	public Object dequeue() throws Underflow {
		try {
			Object obj = getHeadElement( );
			deleteHead();
			return obj;
		} catch ( ItemNotFoundException e) {
			throw new Underflow ("Illegal operation on empty queue");
		}
	}

	public Object getFront() throws Underflow {
		try {
			return getHeadElement();
		} catch ( ItemNotFoundException e) {
			throw new Underflow ("Illegal operation on empty queue");
		}
	}
}
