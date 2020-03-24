---
description: 'https://www.drdobbs.com/cpp/lambdas-in-c11/240168241'
---

# C++ 11 lamda expression



```cpp
[](int x, int y) -> int { return x + y; }

1) [] means capture, any variables that you may need to modify or reference
2) -> can be ignored 

e.g. 

std::vector<int> some_list{ 1, 2, 3, 4, 5 };
int total = 0;
std::for_each(begin(some_list), end(some_list), 
              [&total](int x) {	total += x; });
```



#### Popular C++ Compilers with Support for Lambda Expressions

The following list shows versions of C++ compilers that support lambda expressions. To use this feature on these products, just make sure that you specify the configuration in each IDE's project settings or command-line compiler option than enables support for the C++11 \(formerly C++0x\) features.

* GCC: 4.5. You must specify the `-std=c++11` option.
* Intel C++ Compiler: 11. Specify the `/Qstd=c++0x` option.
* Microsoft Visual C++ 2010 \(included in Visual Studio 2010\).

#### Basic Syntax and Elements for Lambda Expressions

A lambda expression is a syntactic shortcut for a functor, so you can use lambda expressions to replace functors. The following line shows the basic syntax and elements for C++11 lambda expressions:

| 1 | **`[ captures ] (parameters) -> returnTypesDeclaration { lambdaStatements; }`** |
| :--- | :--- |


* `[ captures ]`: The capture clause, also known as the lambda introducer, specifies which outside variables are available for the lambda function and whether they should be captured by value \(copying\) or by reference. You will always be able to identify the start of a lambda expression with the presence of the capture clause. An empty capture clause \[\] means capture nothing, in which case the lambda expression body doesn't access variables in the enclosing scope. I'll dive deeper into capture defaults later.
* `( parameters )`: This is the optional parameters list, also known as the lambda declarator. You can omit the parameters list if you want a function that takes zero arguments.
* `-> returnTypeDeclaration`: This is the return type. Most of the time, compilers can deduce the return type of the lambda expression when you have zero or one return statement. However, if it makes it easier to understand the code, you can specify the return type. There are some differences among compilers regarding the automatic detection of return types when you have more than one return statement because the standard doesn't guarantee the automatic detection of return types. Notice that the specification of the return types is based on the optional return value syntax introduced with C++11, which puts the return value after the function.
* `{ lambdaStatements; }`: This is the lambda body. The statements within the lambda body can access the captured variables and the parameters.

```cpp

int main () 
{ 
	auto sum = [](int x, int y){ return x+y; };
	cout << sum(3, 5)<<endl;

} 

```



