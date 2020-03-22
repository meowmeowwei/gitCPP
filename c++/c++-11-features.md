---
description: 'https://en.wikipedia.org/wiki/C%2B%2B11'
---

# C++ 11

Core language runtime performance enhancement 

**1\) Rvalue reference and move constructors**

before c++11, rvalues \(temporary and short lived, while lvalues exist longer since they exist as variable\)

Rvalue reference -&gt; a new non-const reference type identified by T&&

\*\*\*\*[**Some Background about Lvalue and Rvalue** ](https://www.internalpointers.com/post/understanding-meaning-lvalues-and-rvalues-c)\*\*\*\*

```cpp
int y;
666 = y; // will throw error since 666 is a constant , it can only be Rvalue
int x = &y ; this is fine because & to LValue will generate RValue;


```



why do we need it ? 

in below case, temporary vector is created and it can be stored only be creating a new vector and copying all the rvalues's data into it. Then the temporary and all its memory is destroyed. 

```cpp
vector<int> returnVec (){
}

vector<int> vec = returnVec();

```

