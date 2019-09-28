class TreeNode {
	protected String item;
	protected TreeNode left;
	protected TreeNode right;

	public TreeNode (String item) { this.item = item; left = null; right = null; }
	public TreeNode (String item, TreeNode l, TreeNode r) { this.item = item; left=l; right=r;}


	public TreeNode getLeft ( ) throws ItemNotFoundException {
		if (this == null) throw new ItemNotFoundException ("No next node");
		else return left;
	}

	public TreeNode getRight ( ) throws ItemNotFoundException {
		if (this == null) throw new ItemNotFoundException ("No next node");
		else return right;
	}

	public String getElement ( ) throws ItemNotFoundException {
		if (this == null) throw new ItemNotFoundException ("No next node");
		else return item;
	}

}
