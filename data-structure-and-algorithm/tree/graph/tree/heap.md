---
description: is a form of tree
---

# Heap

min heap -&gt; complete binary tree with root as the minimum node of all. 

insertion into min heap -&gt; o\(logn\), insert at the right end and bubbles/ swap up with the parent 

extraction of min element -&gt; remove the minimum and swap the value with right most children at bottom, and bubbles down o\(logn\)

trie -&gt; prefix tree, each node can put a character, with ending node as \*. trie can search a string in o\(k\) time where k is the length of the string.



[e.g. C++ Priority Queue](https://www.geeksforgeeks.org/priority-queue-of-pairs-in-c-ordered-by-first/)

```cpp
#include <bits/stdc++.h> 
  
using namespace std; 
  
// Driver program to test methods of graph class 
int main() 
{ 
    // By default a max heap is created ordered 
    // by first element of pair. 
    priority_queue<pair<int, int> > pq; 
  
    pq.push(make_pair(10, 200)); 
    pq.push(make_pair(20, 100)); 
    pq.push(make_pair(15, 400)); 
  
    pair<int, int> top = pq.top(); 
    cout << top.first << " " << top.second; 
    return 0; 
} 

//output : 20 100

```



