# C++ 11 Initialization List

The template class `std::initializer_list<>` is a [first-class](https://en.wikipedia.org/wiki/First-class_citizen) C++11 standard library type. They can be constructed statically by the C++11 compiler via use of the `{}` syntax without a type name in contexts where such braces will deduce to an `std::initializer_list`, or by explicitly specifying the type like `std::initializer_list<SomeType>{args}` \(and so on for other varieties of construction syntax\).



The list can be copied once constructed, which is cheap and will act as a copy-by-reference \(the class is typically implemented as a pair of begin/end pointers\). An `std::initializer_list` is constant: its members cannot be changed once it is created, and nor can the data in those members be changed \(which rules out moving from them, requiring copies into class members, etc.\).

Although its construction is specially treated by the compiler, an `std::initializer_list` is a real type, and so it can be used in other places besides class constructors. Regular functions can take typed `std::initializer_list`s as arguments. For example:

```cpp

auto il = { 10, 20, 30 };  // the type of il is an initializer_list 

```

initializer\_list objects are automatically constructed as if an array of elements of type T was allocated, with each of the elements in the list being copy-initialized to its corresponding element in the array, using any necessary non-narrowing implicit conversions.  
  
The initializer\_list object refers to the elements of this array without containing them: copying an initializer\_list object produces another object referring to the same underlying elements, not to new copies of them \(reference semantics\).  
  
The lifetime of this temporary array is the same as the initializer\_list object.  
  
Constructors taking only one argument of this type are a special kind of constructor, called initializer-list constructor. Initializer-list constructors take precedence over other constructors when the initializer-list constructor syntax is used:

```cpp
struct myclass {
  myclass (int,int);
  myclass (initializer_list<int>);
  /* definitions ... */
};

myclass foo {10,20};  // calls initializer_list ctor
myclass bar (10,20);  // calls first constructor 
```

  


|  |  |
| :--- | :--- |


