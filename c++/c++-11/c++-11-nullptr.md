# C++ 11 nullptr

to allow null ptr like how it's defined in Java

```cpp

char *pc = nullptr;     // OK
int  *pi = nullptr;     // OK
bool   b = nullptr;     // OK. b is false.
int    i = nullptr;     // error

foo(nullptr);           // calls foo(nullptr_t), not foo(int);
/*
  Note that foo(nullptr_t) will actually call foo(char *) in the example above using an implicit conversion,
  only if no other functions are overloading with compatible pointer types in scope.
  If multiple overloadings exist, the resolution will fail as it is ambiguous,
  unless there is an explicit declaration of foo(nullptr_t).

  In standard types headers for C++11, the nullptr_t  type should be declared as:
      typedef decltype(nullptr) nullptr_t;
  but not as:
      typedef int nullptr_t; // prior versions of C++ which need NULL to be defined as 0
      typedef void *nullptr_t; // ANSI C which defines NULL as ((void*)0)
*/
```

