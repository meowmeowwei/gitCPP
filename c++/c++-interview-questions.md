# C++ Interview Questions



1. **Difference between reference and pointers** 

https://www.geeksforgeeks.org/pointers-vs-references-cpp/

Reference is an alias to the an object in memory

Pointer contains the address of the object 

A reference can not be re-assigned, a pointer can be re-assigned 

A reference shares the same address of the object, a pointer has it’s own memory address on the stack 

Pointer can be assigned NULL, reference can not

**When to use What**

The performances are exactly the same, as references are implemented internally as pointers. But still you can keep some points in your mind to decide when to use what :

* Use references
  * In function parameters and return types.
* Use pointers:

  * Use pointers if pointer arithmetic or passing NULL-pointer is needed. For example for arrays \(Note that array access is implemented using pointer arithmetic\).
  * To implement data structures like linked list, tree, etc and their algorithms because to point different cell, we have to use the concept of pointers.

**2.  What is Procedure Language ?**

C is a procedure language, view program as a process of transforming data

data and functions are separated 

\*\*\*\*

**3. What are the features of OOP**

* Encapsulation - group data and functions into single package, hide internal details from outsider
* Inheritance - extending current implementation
* Polymorphism - functionality changes according to the actual type of data 



4**. Static Binding vs Dynamic Binding \(for Polymophism\)** 

* static binding -&gt; use the class type of the pointer/reference to determine the version of method call
* dynamic binding -&gt; use the actual type of the object to detemine the version of method call \( virtual \)



