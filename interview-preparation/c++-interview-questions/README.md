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



**5. what is &lt;iomanip&gt; ?**

* used for manipulating the output format , e.g. setprecision\(3\)



**6. what is &lt;sstream&gt; \(istringstream, ostringstream\)**

* istringstream iss\(words\) --&gt; &gt;&gt; word

\*\*\*\*

**7. STL Sorting ?**

* sort \(v.begin\(\), v.end\(\), greater&lt;int&gt;\(\)\); --&gt; sort descending 



**8. File Stream \#include &lt;fstream&gt;** 

* ifstream readFile\("in.txt"\)

        char x;

        while \(readFile &gt;&gt; x\) --&gt; skips white space, if you want to include white space , use while \(readFile.get\(x\)

* ofstream writeFile\("out.txt"\)

\*\*\*\*

**9. How to find complexity ?**

![](../../.gitbook/assets/image%20%2820%29.png)

\*\*\*\*

\*\*\*\*[**10. difference between List and Vector ?**](https://thispointer.com/difference-between-vector-and-list-in-c/)\*\*\*\*

* list stores elements at none-contagious memory locations, internally uses doubly linkedlist 
* vector uses contagious memory locaitons like array
* list has better insertion and deletion 
* vector has better randome access 
* deleting a element in list will not invalidate any iterator, but doing it in vector will cause issue 

**11. what is difference between string append\(\) and += ?**

* no difference += internally calls append\(\)

**12. how is unordered\_map implemented ?**

* [using hashtable \( array follow by linked list\) ](https://www.geeksforgeeks.org/unordered_map-in-cpp-stl/)

**13. unordered\_set vs set**

* set is done using binary search tree , slower than unordered\_set
* unordered\_set done using  hashtables 

**14. const vs constexpr**

The keyword **constexpr** was introduced in C++11 and improved in C++14. It means _constant expression_. Like **const**, it can be applied to variables so that a compiler error is raised if any code attempts to modify the value. Unlike **const**, **constexpr** can also be applied to functions and class constructors. **constexpr** indicates that the value, or return value, is constant and, if possible, is computed at compile time.

A **constexpr** integral value can be used wherever a const integer is required, such as in template arguments and array declarations. And when a value can be computed at compile time instead of run time, it can help your program run faster and use less memory.

To limit the complexity of compile-time constant computations, and their potential impacts on compilation time, the C++14 standard requires the types in constant expressions to be [literal types](https://docs.microsoft.com/en-us/cpp/cpp/trivial-standard-layout-and-pod-types?view=vs-2019#literal_types).

**const** is evaluated in runtime

{% embed url="https://docs.microsoft.com/en-us/cpp/cpp/constexpr-cpp?view=vs-2019" %}

```text
constexpr double sum (double a, double b){
	return a+b;
}

int main(){
	const double s1 = sum(1, 2);

	constexpr double s2 = sum(1,2);
}
```

**15\)**  [why one method uses lock\_guard , another uses unique\_lock , whats the difference ?](http://jakascorner.com/blog/2016/02/lock_guard-and-unique_lock.html)

lock\_guard doesn't provide ability to unlock, once locked, it can only be released when the function finished.

unique\_lock can be unlocked if required . it is also forced to use unique\_lock in condition\_variable.

16\) why scope lock is better than lock\_guard?

scoped\_lock can help avoid deaklock by locking multiple resources in one shot. it will only proceed after acquiring all the locks and will not block while holding a mutex.

