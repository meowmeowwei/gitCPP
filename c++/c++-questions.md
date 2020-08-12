# C++ questions

[When do we need to use initialisation list ?](https://www.geeksforgeeks.org/when-do-we-use-initializer-list-in-c/)

* for initialisation of non-static const data members 
* for initialisation of reference members 
* for initialisation of objects which do not have default constructor 
* for initialisation of base class members 

when should we use explicit constructor ?

* to avoid behind-the-scene type conversions.

**const**  

```cpp
#include <iostream>
#include <bit>
using namespace std;

int main(){

  int x = 5;
  
  // const int means int value itself can not change 
  // const y means the pointer y can not be pointed to another variable 
    
  const int * const y = &x;   
  
  int g = 6;

  * y = 6;

  cout << * y<< endl;
}
```

**Static** 

* make the variable stored in the static area, allocate space before the main function runs 
* decorate member variables so that all objects hold only one of the variable 
* decorate member functions so that they can be accessed without generating objects

