class QueueLL implements QueueADT {

	private TailedLinkedList list;

	public QueueLL() { list = new TailedLinkedList(); }
	public void print()   { System.out.println("Printing queue: "); list.print(); }
	public boolean isEmpty() { return list.isEmpty(); }
	public void enqueue (Object o) { list.addTail(o); }
	public Object dequeue() throws Underflow {
		try {
			Object obj = list.getHeadElement( );
			list.deleteHead();
			return obj;
		} catch ( ItemNotFoundException e) {
			throw new Underflow ("Illegal operation on empty queue");
		}
	}

	public Object getFront() throws Underflow {
		try {
			return list.getHeadElement();
		} catch ( ItemNotFoundException e) {
			throw new Underflow ("Illegal operation on empty queue");
		}
	}
}
