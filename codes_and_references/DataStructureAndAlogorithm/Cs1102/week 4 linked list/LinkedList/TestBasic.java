class TestBasic {
	public static void main (String [] args) throws ItemNotFoundException {
		BasicLinkedList bl = new BasicLinkedList ();
		bl.addHead ("aaa ");
		bl.addHead ("bbb ");
		bl.addHead ("ccc ");
		bl.print();

		System.out.println("testing deletion");
		bl.deleteHead();
		bl.print();
	}

}
