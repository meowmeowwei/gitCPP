---
description: 252/708
---

# Chapter 4 - Trees and Graphs

1\) 

finding a path between Node A and Node b, can use either dfs or bfs

```text
boolean checkNode (Node a, Node b){
		if(a == b)
			return true;
		else
			return false;
	}

	boolean searchNodePath(Node start, Node end){
		if(!start)
			return false;

		if(checkNode(start, end)){
			return true;
		}
		else{
			sttart.visited = true;

			for(Node n : start.adjacent){
				if(!n.visited){
					searchNodePath(n, end);
				}
			}
		}

		return false;
	}

	boolean serachNodePathWithBFS(Node a, Node b){
		queue< Node> bfsQueue;

		a.marked = true;
		bfsQueue.push_back(a);

		while(!bfsQueue.empty()){
			Node r == bfsQueue.pop_front();
			if(checkNode(r, b)){
				return true;

			}
			else{
				for(Node n: r.ajacent){
					if(!n.marked()){
						n.marked = true;
						bfsQueue.push_back(n);
					}
				}
			}
		}
		return false;
	}
```

2\) root should always be in the middle of the array

use recursion to do it

```text
	Node *  buildMinimumTree(int * arr, int startIndex, int endIndex){
		if (startIndex == endIndex )
			return new Node(arr[0]);
		else{

			midIndex = (startIndex + endIndex)/2;
			root = new Node(arr[midIndex]);
			root->left = buildMinmumTree(arr, 0, midIndex -1);
			root->right = buildMinmumTree(arr, midIndex+1, endIndex);
		}
	}
```





