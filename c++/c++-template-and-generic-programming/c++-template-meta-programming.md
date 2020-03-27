# C++ Template Meta Programming

MetaProgramming -&gt; technique which computer programs have ability to treat other programs as their data. Program can be designed to read, generate, analyze or transform other programs and even modify itself while running. it allows to reduce lines of code. 

tmp -&gt; templates are used by compiler to generate temporary source codes, which is merged by the compiler with rest of source code and then compiled. Output can be compile-time constants, data structures and complete functions. It is compile time execution.

1\) **used for compile-time class generation** 

**all factorials used by program are pre-compiled and injected as numeric constants at compilation, saving runtime overhead and memory footprint**

```cpp
#include <iostream>
using namespace std;


template <int T>
struct factorial {
	enum { value = T * factorial<T-1>::value};
};

template<>
struct factorial<0>{
	enum { value = 1};
};



int main(){

   cout << factorial<4>::value << endl; // will return 24

}

```

