# C++ 11 Object Construction Improvement

In C++03, constructors of a class are not allowed to call other constructors in an initializer list of that class. Each constructor must construct all of its class members itself or call a common member function, as follows:

```cpp
class SomeType
{
public:
    SomeType(int new_number)
    {
        Construct(new_number);
    }

    SomeType()
    {
        Construct(42);
    }

private:
    void Construct(int new_number)
    {
        number = new_number;
    }

    int number;
};
```

C++ 11 allows that

```cpp

class SomeType
{
    int number;

public:
    SomeType(int new_number) : number(new_number) {}
    SomeType() : SomeType(42) {}
};
```

