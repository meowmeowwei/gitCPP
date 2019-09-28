import java.lang.*;

class Heap {
	private int MAX_HEAP = 100;
	protected int [] items;
	protected int size;
	protected int maxSize;

	public Heap() {
		items = new int[MAX_HEAP];
		maxSize = MAX_HEAP;
		size = 0;
	}

	public Heap(int[] nums) {
		items = new int[MAX_HEAP];
		size = nums.length;
		maxSize = size;
		for (int i=0; i < nums.length; i++) items[i] = nums[i];
		this.heapify();
	}

	protected void heapify() {
		for (int i=size/2 - 1; i >= 0; i--) 
			heapRebuild(i);
	}

	public boolean heapIsEmpty() {
		return size == 0;
	}

	public void heapInsert (int newItem) throws HeapException {

		if (size <  maxSize ) {
			items[size] = newItem;
			int place = size;
			int parent = (place -1) / 2;
			while ( (parent >= 0) && (items[place] > items[parent]) ) {
//			while ( (items[place] > items[parent]) ) {
				int temp = items[place];
				items[place] = items[parent];
				items[parent] = temp;

				place = parent;
				parent = (place - 1)/2;
			}
			++size;
		} else throw new HeapException ("HeapException: Heap full");
	}

	public int heapDelete () {
		int rootItem = 0;
		if (!heapIsEmpty()) {
			rootItem = items[0];
			items[0] = items[--size];
			heapRebuild(0);
		}
		return rootItem;
	}

	protected void heapRebuild (int root) {
		int child = 2*root + 1;
		if (child < size) {
			int rightChild = child + 1;
			if ( (rightChild < size) && (items[rightChild] > items[child]) )
				child = rightChild; // choose child with bigger key value

			if (items[root] < items[child] ) {
				// bubble down
				int temp = items[root];
				items[root] = items[child];
				items[child] = temp;

				heapRebuild(child);
			}
		}
	}

	///////////////////////////////////////////////////////////////////////////////////////

	public void checkIsHeap () {
		if ( size == 0 ) { System.out.println( "Empty Heap"); return;}

		int height = 1 + (int) Math.floor( Math.log(size) / Math.log(2) );
		//System.out.println ("Height is " + height);
		int i = 1;  // this is the running number of the nodes
		System.out.println("Checking whether it is heap....");
		System.out.println( items[0]);
		for (int level=2; level <= height; level++) {
			for (int j=1; j<= Math.pow(2, (level-1)) && i < size; i++, j++) {
				if ( items[i] <= items[ (i-1)/2 ]) System.out.print( items[i] + " " );
				else { System.out.print ( items[i] + "*fail* "); };
			}
			System.out.println(); // print to a new line
		}
		System.out.println( "it is a heap" );
	}

}
