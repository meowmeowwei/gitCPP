---
description: 'https://www.interviewcake.com/concept/python/binary-tree'
---

# Graph & Tree

\*\*\*\*[**Binary Tree** ](https://www.interviewcake.com/concept/python/binary-tree)\*\*\*\*

1\) for a perfect binary tree, it has 2 ^ h -1 total number of nodes.

2\) the height of the tree is log\(n+1\)

Question 

[Balanced Binary Tree ](https://www.interviewcake.com/question/cpp/balanced-binary-tree)

[Balanced Search Tree Checker](https://www.interviewcake.com/question/cpp/bst-checker)



\*\*\*\*[**Breadth-First Search** ](https://www.interviewcake.com/concept/python/bfs)\*\*\*\*

it will allow to find shortest paths between starting point and any other reachable node

it requires more memory than DFS

```cpp
void searchBFS(Node root){
	queue <Node> bfsQueue;
	root.marked = true;
	bfsQueue.push_back(root);

	while(!bfsQueue.empty()){
		Node r = bfsQueue.pop_front();
		visit(r);
		for(Node n : r.adjacent){
			if(!n.marked){
				n.marked = true;
				queue.push_back(n);
			}
		}
	}
```



\*\*\*\*[**Depth First Search** ](https://www.interviewcake.com/concept/python/dfs)\*\*\*\*

requires lesser memory



```cpp
void visit (Node root){
	cout << root << endl;
}

// DFS
void searchDFS (Node root){
	if(!root)
		return;
	visit(root);
	root.visited = true;
	for(Node n : root.adjacent){
		if(!n.visited){
			searchDFS(n);
		}
	}
}
```

