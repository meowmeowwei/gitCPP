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


//Example 2

void fnc(int & x){
}

int main(){

    fnc(10); // Nope ! because 10 is a temporary RValue, cant not directly become reference
    //This works instead
    // int x = 10;
    // fnc(x);
}

// but you can resovle above issue with const lvalue 

const int& ref = 10; // this is okay
// literal 10 is volate and world expire in no time, but a constant reference
// will make sure the value it points to cant be modified 



```



why do we need it ?   --&gt;  refer to this [good reference ](https://www.internalpointers.com/post/c-rvalue-references-and-move-semantics-beginners)here 

in below case, temporary vector is created and it can be stored only be creating a new vector and copying all the rvalues's data into it. Then the temporary and all its memory is destroyed. 

```cpp
vector<int> returnVec (){
}

vector<int> vec = returnVec();

```

