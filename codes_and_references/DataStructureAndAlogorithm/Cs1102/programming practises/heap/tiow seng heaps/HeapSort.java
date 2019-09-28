class HeapSort extends Heap {

	public HeapSort (int[] nums ) {
		size = nums.length;
		items = nums;
		maxSize = size;
		this.heapify();
	}

	public void sort ( ) {
		while ( size > 1) items[ size - 1] = heapDelete();
	}

}
