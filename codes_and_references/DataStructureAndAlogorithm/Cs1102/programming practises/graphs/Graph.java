class Graph {

  private int noVertices = 0;
  private String [ ] vertexList;
  private BasicLinkedList [ ] edgeList;

  public Graph ( String[] vertices, int[][] edges ) {
	noVertices = vertices.length;
	vertexList = new String[ noVertices ];
	edgeList   = new BasicLinkedList[  noVertices ];
	for (int i=0; i < noVertices; i++) {
	   vertexList[i] = new String( vertices[i]); 
	   edgeList[i] = new BasicLinkedList();
	   for (int j=edges[i].length - 1; j >= 0; j--) {
			edgeList[i].addHead ( (Object)edges[i][j] );
	   }
	}
  } 

  public void printGraph () throws ItemNotFoundException {
	System.out.println("Graph is as follows:");
	for (int i=0; i < noVertices; i++) {
		System.out.print ( "Vertex " + vertexList[i] + "; edges are:  " );
		ListNode node = edgeList[i].getHeadPtr ();
		while (node != null) {
			System.out.print ( vertexList[i] + vertexList[node.getElement()] + "   ");
			node = node.getNext();
		}
		System.out.println();
	}
  }

  //////////////////////////////////////////////////////////////////////////
  // ASSUME IT IS A CONNECTED GRAPH - else need to do this slightly differently
  //
  public void bfs ( ) throws Underflow, ItemNotFoundException {
	boolean [] visited = new boolean[ noVertices ];
	QueueLL q = new QueueLL();
	
	for (int i=0; i < noVertices; i++) visited[i] = false;	
	q.enqueue(0);
	visited[0] = true;;
	while (!q.isEmpty()) {
		int curr = (Integer) q.dequeue();
		System.out.print( " " + vertexList[curr] ); 
		ListNode node = edgeList[curr].getHeadPtr();
		while (node != null) {
			if ( !visited[node.getElement()] ) {
				q.enqueue( node.getElement() );
				visited[node.getElement()] = true;
			}
			node = node.getNext();
		}
	}
	System.out.println(" ");
  }

  ///////////////////////////////////////////////////////////////////////////
  public void dfs ( ) throws Underflow, ItemNotFoundException {
	boolean [] visited = new boolean[ noVertices ];
	for (int i=0; i < noVertices; i++) visited[i] = false;	

	for (int i=0; i < noVertices; i++) 
		if ( !visited[i] )
			dfs ( i, visited);

	System.out.println();
  }

  private void dfs (int curr, boolean[] visited) throws Underflow, ItemNotFoundException {
	visited[curr] = true;
	System.out.print ( " " + vertexList[curr] );
	ListNode node = edgeList[curr].getHeadPtr();
	while (node != null) {
		if ( !visited[node.getElement()] ) 
			dfs( node.getElement(), visited );
		node = node.getNext();
	}
  }

  ///////////////////////////////////////////////////////////////////////////
  public void toposort ( ) throws Underflow, ItemNotFoundException {

  // page 70
  // 1. calculate indegree of all vertices
  int [] indeg = new int[noVertices];
  for (int i=0; i < indeg.length; i++) indeg[i] = 0;

  for (int i = 0; i < noVertices; i++) {
	  ListNode node = edgeList[i].getHeadPtr();
	  while ( node != null) {
		indeg[ node.getElement() ] ++;
		node = node.getNext();
	  }
  }

  // 2. put all vertices with indegree == 0 into a queue
  QueueLL q = new QueueLL();
  for (int i=0; i < noVertices; i++) 
	  if ( indeg[i] == 0) 
		  q.enqueue ( i );

  // 3. go through the queue to print out vertices
  while ( !q.isEmpty() ) {
	int vert =  (Integer) q.dequeue();
	System.out.print (" " + vertexList[ vert ] );
	ListNode node = edgeList[ vert ].getHeadPtr();
	while (node != null) {
		indeg [ node.getElement() ] --;
		if ( indeg[ node.getElement() ] == 0) 
			q.enqueue ( node.getElement() );
		node = node.getNext();
  	}
  }
  System.out.println("");
  }
}
