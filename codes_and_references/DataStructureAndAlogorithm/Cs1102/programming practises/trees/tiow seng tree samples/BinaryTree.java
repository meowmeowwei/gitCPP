class BinaryTree {

	protected TreeNode  root;

	public BinaryTree ( ) { root = null; }

	public int height ( ) {
		return height ( root );
	}

	private int height ( TreeNode tn ) {
		if ( tn == null ) return 0;

		//if ( height ( tn.left ) >= heigth (tn.right) ) {
		//	return 1 + height (tn.left);
		//} else return 1 + heigth (tn.right);

		return 1 + Math.max( height(tn.left), height(tn.right) );
	} 

	public int size ( ) {
		return size ( root );
	}

	private int size ( TreeNode tn ) {
		if ( tn == null ) return 0;

		return 1 + size(tn.left) + size(tn.right);
	}

	public void inorder ( ) {
		inorder ( root );
	}

	private static void inorder ( TreeNode node ) {
		if (node != null ) {
			inorder ( node.left );
			System.out.println ( node.item );
			inorder ( node.right );
		}
	}

	// .... preorder, postorder, levelorder etc.
}
