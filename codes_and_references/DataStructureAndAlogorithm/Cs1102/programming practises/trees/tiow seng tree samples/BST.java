class BST extends BinaryTree {

	public String findMin ( TreeNode tn ) {
		if (tn == null) return null;
		while (tn.left != null) tn = tn.left;
		return tn.item;
	}

	public void insert ( String item ) {
		root = insert (item, root);
	}

	private TreeNode insert ( String item, TreeNode tn ) {
		if ( tn == null ) return new TreeNode ( item );

		if ( item.compareTo ( tn.item ) < 0 ) 
			tn.left = insert ( item, tn.left );
		else if ( item.compareTo ( tn.item ) > 0 ) 
			tn.right = insert ( item, tn.right );
			else System.out.println (" duplicated value of " + item );

		return tn;
	}

	public TreeNode search ( String item ) {
		return search ( item, root);
	}

	private TreeNode search ( String item, TreeNode tn ) {
		if (tn == null) return null;

		if (item.equals ( tn.item )) return tn;

		if (item.compareTo (tn.item) < 0 ) return search (item, tn.left);
		else return search (item, tn.right);
	}

	public void delete ( String item ) {
		root = delete (item, root);
	}
	
	private TreeNode delete ( String item, TreeNode tn ) {
		// case 1:
		if (tn.left == null && tn.right == null) {
			//System.out.println("into case 1");
			if (item.equals(tn.item) ) {
				//System.out.println("case 1");
				return null;
			} else {
				System.out.println( "item not found for deletion - case 1" );
				return tn;
			}
		}

		// case 2 (A):
		if (tn.left != null && tn.right == null) {
		    //System.out.println("into case 2A");
			if (item.equals(tn.item)) {
				//System.out.println("case 2A");
				return tn.left;
			} else if (item.compareTo(tn.item) < 0) {
					tn.left = delete ( item, tn.left );
					return tn;
				} else {
					System.out.println( "item not found for deletion - case 2A");
					return tn;
				}
		};
		
		// case 2 (B):
		if (tn.right != null && tn.left== null) {
		   //System.out.println("into case 2B");
			if (item.equals(tn.item)) {
				//System.out.println("case 2B");
				return tn.right;
			} else if (item.compareTo(tn.item) > 0) {
					tn.right = delete ( item, tn.right);
					return tn;
				} else {
					System.out.println( "item not found for deletion - case 2B");
					return tn;
				}
		};
		
		// case 3 :
	    //System.out.println("into case 3");
		if ( item.equals (tn.item) ) {
			tn.item  = findMin (tn.right);
			tn.right = delete ( tn.item , tn.right );
			//System.out.println("case 3");
		}
		else if ( item.compareTo( tn.item ) < 0 ) { 
			     //System.out.println("deleting....left  " + item);
				 tn.left = delete ( item, tn.left);
			} else { 
			     //System.out.println("deleting....right " + item);
				 tn.right = delete (item, tn.right);
			}
	
		return tn;
	}
}
