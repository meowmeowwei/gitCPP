class StackLL implements StackADT {
	private BasicLinkedList list;

	public StackLL() {
		list = new BasicLinkedList();
	}

    // interesting !! need to have this one.....
	public void print () {
		list.print();
	}

	public boolean isEmpty() {
		return list.isEmpty();
	}

	public void push (Object o) {
		list.addHead( o );
	}

	public Object pop () throws Underflow {
		Object obj = peek();
		try {
			list.deleteHead();
		} catch ( ItemNotFoundException e ) {
			throw new Underflow ("Illegal operation on empty stack");
		}
		return obj;
	}

	public Object peek() throws Underflow {
		try {
			return list.getHeadElement();
		} catch ( ItemNotFoundException e ) {
			throw new Underflow ("Illegal operation on empty stack");
		}
	}
}
