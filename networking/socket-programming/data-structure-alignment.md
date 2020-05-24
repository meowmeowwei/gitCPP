---
description: 'https://www.geeksforgeeks.org/data-structure-alignment/'
---

# Data Structure Alignment

```cpp

// CPP program to test 
// size of struct 
#include <iostream> 
using namespace std; 
  
// first structure 
struct test1  
{ 
    short s; 
    int i; 
    char c; 
}; 
  
// second structure 
struct test2  
{ 
    int i; 
    char c; 
    short s; 
}; 
  
// driver program 
int main() 
{ 
    test1 t1; 
    test2 t2; 
    cout << "size of struct test1 is " << sizeof(t1) << "\n"; 
    cout << "size of struct test2 is " << sizeof(t2) << "\n"; 
    return 0; 
}
```

