class TestBST {

	static String [] str = { "b", "a", "c", "d", "e", "z", "m", "p", "j", "g", "k", "n", "q"};

	public static void main (String [] args) {

		BST bst = new BST ( );

		for (int i=0; i < str.length; i++) {
			bst.insert ( str[i] );
		}

	    bst.inorder(); // output is the above str in alphabetical order 

	    if ( bst.search("z") != null ) System.out.println ("found z in bst"); // printed
	    if ( bst.search("f") != null ) System.out.println ("found p in bst"); // not printed
	    if ( bst.search("e") != null ) System.out.println ("found e in bst"); // printed

/*
		bst.delete ( "a");
	    System.out.println ("case 1: after deleted a");
	    bst.inorder(); 

		bst.delete ( "c");
	    System.out.println ("case 2B: after deleted c");
	    bst.inorder(); 

		bst.delete ( "z");
	    System.out.println ("case 2A: after deleted z");
	    bst.inorder(); 

		bst.delete ( "m");
	    System.out.println ("case 3: after deleted m");
	    bst.inorder(); 

		bst.delete ( "f");
	    System.out.println ("item not found");
	    bst.inorder(); 

*/
	}

}
