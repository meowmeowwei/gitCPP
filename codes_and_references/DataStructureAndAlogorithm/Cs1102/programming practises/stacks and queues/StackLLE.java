class StackLLE extends BasicLinkedList implements StackADT {

//	public boolean isEmpty() {
//		return super.isEmpty();
//	}

	public void push (Object o) {
		addHead( o );
	}

	public Object pop () throws Underflow {
		Object obj = peek();
		try {
			deleteHead();
		} catch ( ItemNotFoundException e ) {
			throw new Underflow ("Illegal operation on empty stack");
		}
		return obj;
	}

	public Object peek() throws Underflow {
		try {
			return getHeadElement();
		} catch ( ItemNotFoundException e ) {
			throw new Underflow ("Illegal operation on empty stack");
		}
	}
}
