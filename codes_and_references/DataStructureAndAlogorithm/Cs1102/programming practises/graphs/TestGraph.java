class TestGraph {

  public static void main (String[] args) throws Underflow, ItemNotFoundException {

	// construct the graph first
	String [] vertices = { "A", "B", "C", "D", "E", "F" };
	// testing topological sort
	 int[][] edges = 	{ {2, 1}, {4, 5}, {4, 1, 3}, {}, {3, 5}, {}};

	// testing BFS and DFS
	//int[][] edges = 	{ {2}, {0, 4, 5}, {4, 1, 3}, {}, {3}, {4}};

	System.out.println("");
    Graph g = new Graph( vertices, edges );
	g.printGraph();

	System.out.println("");
	System.out.println("Testing BFS:");
	g.bfs();

	System.out.println("");
	System.out.println("Testing DFS:");
	g.dfs();

	System.out.println("");
	System.out.println("Testing Toposort:");
	g.toposort();
	System.out.println("");
  }
}
