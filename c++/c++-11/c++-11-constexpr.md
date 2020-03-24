# C++ 11 constexpr

for performance improvement by doing computation at compile time rather than runtime.

constexpr specifies that the value of an object or a function can be evaluated at compile time and the expression can be used in other constant expressions. For example, in below code product\(\) is evaluated at compile time.



```cpp
include <iostream>
#include <string>
#include <iomanip>
#include <chrono>

using namespace std::chrono;


constexpr long fib(int n) 
{ 
    return (n <= 1)? n : fib(n-1) + fib(n-2); 
} 
  
int main () 
{ 
    // value of res is computed at compile time.  
    auto start = high_resolution_clock::now();
    
    const long  res = fib(30); 
    std::cout << res << std::endl; 
    
    auto stop = high_resolution_clock::now();
    auto duration = duration_cast<microseconds>(stop - start); 

    std::cout<< duration.count() << std::endl;
    return 0; 
} 

// if you have constexpr -> it will take 29 microseconds
// if you dont have constexpr -> it will take 5155 microseconds
```





A function be declared as constexpr

1. In C++ 11, a constexpr function should contain only one return statement. C++ 14 allows more than one statements.
2. constexpr function should refer only constant global variables.
3. constexpr function can call only other constexpr function not simple function.
4. Function should not be of void type and some operator like prefix increment \(++v\) are not allowed in constexpr function.

