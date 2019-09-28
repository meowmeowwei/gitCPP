class TestHeap {

	public static void main ( String[] args ) throws HeapException {

		Heap h;
		//int[] nums = { 4, 1, 3, 2, 16, 9, 10, 14, 8, 7, 6};
		//int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		//int[] nums = { 9, 8, 7, 6, 5, 4, 3, 2, 1};
		//int[] nums = { 8, 7, 6, 5, 4, 3, 2, 1};
		//int[] nums = { 7, 6, 5, 4, 3, 2, 1};
		int[] nums = { 6, 3, 5, 9, 2, 10};

		// first part of experimentation
		h = new Heap();
		System.out.println ("Testing heap insert...." );
		for (int i=0; i < nums.length; i++) {
			h.heapInsert( nums[i] );
		}
		h.checkIsHeap( );

	    // second part of experimenting
/* *		System.out.println();
		System.out.println ("Testing heap delete...." );
		System.out.println ("Printing out heap...." );
		while ( !h.heapIsEmpty() ) System.out.print( h.heapDelete() + " ");
		System.out.println();
/*  */
		// third part of experimenting - heapify
/*	*	System.out.println();
		System.out.println ("Testing heapify...." );
		System.out.println (" nums are...");
		for (int i=0; i < nums.length; i++) System.out.print( " " + nums[i] );
		System.out.println (" "); 
		h = new Heap( nums );
		h.checkIsHeap( );
		System.out.println (" nums has been change to...(actually should be no changes)");
		for (int i=0; i < nums.length; i++) System.out.print( " " + nums[i] );
		System.out.println();
/*  */
		// fourth part of experimenting - heap sort 
/* 
		System.out.println();
		System.out.println ("Testing heap sort...." );
		HeapSort hs = new HeapSort ( nums  );
		hs.sort();
		System.out.println (" nums sorted as ...");
		for (int i=0; i < nums.length; i++) System.out.print( " " + nums[i] );
		System.out.println();
 /*  */
	}
}
