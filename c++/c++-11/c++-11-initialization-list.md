# C++ 11 Initialization List

The template class `std::initializer_list<>` is a [first-class](https://en.wikipedia.org/wiki/First-class_citizen) C++11 standard library type. They can be constructed statically by the C++11 compiler via use of the `{}` syntax without a type name in contexts where such braces will deduce to an `std::initializer_list`, or by explicitly specifying the type like `std::initializer_list<SomeType>{args}` \(and so on for other varieties of construction syntax\).



The list can be copied once constructed, which is cheap and will act as a copy-by-reference \(the class is typically implemented as a pair of begin/end pointers\). An `std::initializer_list` is constant: its members cannot be changed once it is created, and nor can the data in those members be changed \(which rules out moving from them, requiring copies into class members, etc.\).

Although its construction is specially treated by the compiler, an `std::initializer_list` is a real type, and so it can be used in other places besides class constructors. Regular functions can take typed `std::initializer_list`s as arguments. For example:





