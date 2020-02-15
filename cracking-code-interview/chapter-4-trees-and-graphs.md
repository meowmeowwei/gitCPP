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

3\) pre-order traverse

```text


void createLevelLinkedList (TreeNode root, vector * <LinkedList<TreeNode>> lists, int level){

	if (root = null)
		return;

	LinkedList<TreeNode> list = null;

	if(list.size() == level){
		lists->add(list);
	}
	else{
		list = lists-> get(level);

	}

	list.add(root);

	createLevelLinkedList(root.left, lists, level+1);
	createLevelLinkedList(root.right, lists, level+1);

}

```

4\) is balanced tree

```text
class Solution {
public:
    
    int treeSize(TreeNode * node){
        int size =0;
        
        if(node == nullptr)
            return 0;
        else{
            size = max(treeSize(node->left), treeSize(node->right)) +1;    
        }
        return size;
    }
    
    bool isBalanced(TreeNode* root) {
        if(root == nullptr)
            return true;
        
        int heightDifference = treeSize(root->left) - treeSize(root->right);
        if(abs(heightDifference) >1){
                return false;
            }
        else{
                return isBalanced(root->left) && isBalanced(root->right);
            }
        }
    
};

```

