# Graph

tree is also considered a graph.

connected graph -&gt; if there's a path between any pair of nodes 

acyclic graph -&gt; graph without cycles 

Representing Graph 

-&gt; 1. use adjacent matrix , true value indicate path existence

-&gt; 2. use adjacent list, every nodes stores a list of adjacent list \(array of list\)

e.g.

6: 1

1: 2

2: 3

3: 2



Graph Search 

-&gt; DFS \(depth first search\), go to the deep end of the branch first then switch to another branch \( good for traversing to each node\)

-&gt; BFS \(breath first search\), go to each neighbour before going deep \(good for finding a node in the graph\)



