# A tour of C++ 2nd Edition

1. **Const vs Constexpr**

The keyword **constexpr** was introduced in C++11 and improved in C++14. It means _constant expression_. Like **const**, it can be applied to variables so that a compiler error is raised if any code attempts to modify the value. Unlike **const**, **constexpr** can also be applied to functions and class constructors. **constexpr** indicates that the value, or return value, is constant and, if possible, is computed at compile time.

A **constexpr** integral value can be used wherever a const integer is required, such as in template arguments and array declarations. And when a value can be computed at compile time instead of run time, it can help your program run faster and use less memory.

To limit the complexity of compile-time constant computations, and their potential impacts on compilation time, the C++14 standard requires the types in constant expressions to be [literal types](https://docs.microsoft.com/en-us/cpp/cpp/trivial-standard-layout-and-pod-types?view=vs-2019#literal_types).

**const** is evaluated in runtime

{% embed url="https://docs.microsoft.com/en-us/cpp/cpp/constexpr-cpp?view=vs-2019" %}

```text
constexpr double sum (double a, double b){
	return a+b;
}

int main(){
	const double s1 = sum(1, 2);

	constexpr double s2 = sum(1,2);
}
```

