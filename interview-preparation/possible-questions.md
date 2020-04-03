# Possible Questions

[1\) InOrder A tree Without Recursion](https://www.geeksforgeeks.org/inorder-tree-traversal-without-recursion/)

```cpp

void inOrder(struct Node *root) 
{ 
    stack<Node *> s; 
    Node *curr = root; 
  
    while (curr != NULL || s.empty() == false) 
    { 
        /* Reach the left most Node of the 
           curr Node */
        while (curr !=  NULL) 
        { 
            /* place pointer to a tree node on 
               the stack before traversing 
              the node's left subtree */
            s.push(curr); 
            curr = curr->left; 
        } 
  
        /* Current must be NULL at this point */
        curr = s.top(); 
        s.pop(); 
  
        cout << curr->data << " "; 
  
        /* we have visited the node and its 
           left subtree.  Now, it's right 
           subtree's turn */
        curr = curr->right; 
  
    } /* end of while */
} 

```

2\)[ c++ vector expansion policy , how it reach amortized size of O\(1\)](https://stackoverflow.com/questions/5232198/about-vectors-growth)

To be able to provide _amortized constant time_ insertions at the end of the `std::vector`, the implementation must grow the size of the vector \(when needed\) by a factor `K>1` \(\*\), such that when trying to append to a vector of size `N` that is full, the vector grows to be `K*N`.

Different implementations use different constants `K` that provide different benefits, in particular most implementations go for either `K = 2` or `K = 1.5`. A higher `K` will make it faster as it will require less _grows_, but it will at the same time have a greater memory impact. As an example, in gcc `K = 2`, while in VS \(Dinkumware\) `K = 1.5`.

\(\*\) If the vector grew by a constant quantity, then the complexity of `push_back` would become linear instead of _amortized constant_. For example, if the vector grew by 10 elements when needed, the cost of growing \(copy of all element to the new memory address\) would be `O( N / 10 )` \(every 10 elements, move everything\) or `O( N )`.

3\) [whats the difference between stack and heap](https://www.programmerinterview.com/data-structures/difference-between-stack-and-heap/)

both are stored in the computer's RAM \(random access memory\)

in multi-threaded applications, each thread will have its own stack. but they will share the same heap space.

variables on stack will be deleted by automatically when out of scope, those on heap will need to be deleted by programmer.

Stack is fixed in size, for heap, if not enough, OS can assign more memory 

If the stack runs out of memory, then this is called a stack overflow – and could cause the program to crash. The heap could have the problem of fragmentation, which occurs when the available memory on the heap is being stored as noncontiguous \(or disconnected\) blocks – because used blocks of memory are in between the unused memory blocks. When excessive fragmentation occurs, allocating new memory may be impossible because of the fact that even though there is enough memory for the desired allocation, there may not be enough memory in one big block for the desired amount of memory.

