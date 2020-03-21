# C++ String

using string = basic\_string&lt;char&gt;



1\) find first\_first\_of

size\_t represent the size of any objects in bytes widely represent sizes and counts

will return the position of found value , if not string::npos will be returned

```cpp

// string::find_first_of
#include <iostream>       // std::cout
#include <string>         // std::string
#include <cstddef>        // std::size_t

int main ()
{
  std::string str ("Please, replace the vowels in this sentence by asterisks.");
  std::size_t found = str.find_first_of("aeiou");
  while (found!=std::string::npos)
  {
    str[found]='*';
    found=str.find_first_of("aeiou",found+1);
  }

  std::cout << str << '\n';

  return 0;
}

```

