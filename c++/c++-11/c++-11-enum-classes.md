---
description: >-
  https://www.geeksforgeeks.org/enum-classes-in-c-and-their-advantage-over-enum-datatype/
---

# C++ 11 enum classes

old enum are not typed safe, they are underlyingly integer represent

 

```cpp

int main () 
{ 
	enum weekday {monday, tuesday, wednesday};
	enum session {am, pm};

	cout << monday<<endl;
	cout << am <<endl;

	cout << (monday == am) << endl;

} 

// they will return the same values 

```



Enum Class Sample code

```cpp

#include <iostream> 
using namespace std; 
  
int main() 
{ 
  
    enum class Color { Red, 
                       Green, 
                       Blue }; 
    enum class Color2 { Red, 
                        Black, 
                        White }; 
    enum class People { Good, 
                        Bad }; 
  
    // An enum value can now be used 
    // to create variables 
    int Green = 10; 
  
    // Instantiating the Enum Class 
    Color x = Color::Green; 
  
    // Comparison now is completely type-safe 
    if (x == Color::Red) 
        cout << "It's Red\n"; 
    else
        cout << "It's not Red\n"; 
  
    People p = People::Good; 
  
    if (p == People::Bad) 
        cout << "Bad people\n"; 
    else
        cout << "Good people\n"; 
  }

```

