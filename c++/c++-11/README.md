---
description: 'https://en.wikipedia.org/wiki/C%2B%2B11'
---

# C++ 11

1\) [Rvalue and LValue](https://app.gitbook.com/@sun-wei-9/s/workspace/c++/c++-11/c++-11-features)

2\) [constexpr](https://app.gitbook.com/@sun-wei-9/s/workspace/c++/c++-11/c++-11-constexpr)

3\) [extern template](https://app.gitbook.com/@sun-wei-9/s/workspace/c++/c++-11/c++-11-extern-template)

4\) [Initialization List ](https://app.gitbook.com/@sun-wei-9/s/workspace/c++/c++-11/c++-11-initialization-list)

5\) [Type Inference ](https://app.gitbook.com/@sun-wei-9/s/workspace/c++/c++-11/c++-type-inference)

6\) [bind](https://app.gitbook.com/@sun-wei-9/s/workspace/c++/c++-11/c++-11-std-bind)

7\) [Range\_based for loop ](https://app.gitbook.com/@sun-wei-9/s/workspace/c++/c++-11/c++-11-range-based-for-loop)

8\) [Lamda Expression ](https://app.gitbook.com/@sun-wei-9/s/workspace/c++/c++-11/c++-11-lamda-expression)

9\) [object construction improvement](https://app.gitbook.com/@sun-wei-9/s/workspace/c++/c++-11/c++-11-object-construction-improvement)

10\) [override/final](https://app.gitbook.com/@sun-wei-9/s/workspace/~/drafts/-M3AJ5Z5XF5aV1BvpNdl/c++/c++-11/c++-11-override-final)

11\) [nullptr](https://app.gitbook.com/@sun-wei-9/s/workspace/c++/c++-11/c++-11-nullptr) 

12\) [strongly typed enum / enum class](https://app.gitbook.com/@sun-wei-9/s/workspace/c++/c++-11/c++-11-enum-classes)

13\) Delegating Constructors

```cpp
class Foo{
    
    public:
    
        Foo(){}
        
        Foo(int value) : Foo{}
        {
        }
};
```

14\) Enum Classes

```cpp
enum Color{red, green};
enum Fruit(banana, apple};

Color color{red};
Fruit fruit{banana};

if(color==fruit) // compiler will return true and compare them as integers

//Enum class is strongly type

enum class Color{red, green}
enum class Fruit{banana, apple};

Color color{ Color::red }; // note: red is not directly accessible any more, we have to use Color::red
Fruit fruit{ Fruit::banana }; // note: banana is not directly accessible any more, we have to use Fruit::banana
	
if (color == fruit) // compile error here, as the compiler doesn't know how to compare different types Color and Fruit





```

