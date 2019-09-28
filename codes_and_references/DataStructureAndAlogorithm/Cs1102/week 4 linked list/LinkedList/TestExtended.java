class TestExtended {
	public static void main (String [] args) throws ItemNotFoundException {
		ExtendedLinkedList bl = new ExtendedLinkedList ();
		bl.addHead ("aaa ");
		bl.addHead (new ComplexNo(2,3));
		bl.addHead ("ccc ");
		bl.print();

		System.out.println("Part 2");
		ListNode current = bl.getHeadPtr();
		bl.insertAfter(current, "xxx ");
		bl.insertAfter(bl.head, new ComplexNo(6,6));
		bl.print();

		System.out.println("Part 3");
		bl.delete(new ComplexNo(2,3));
		bl.print();
	}

}
