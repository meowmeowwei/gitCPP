# C++ 11 override / final

defining override will cause compiler to check if the method has really overridden the Parent class's virtual function.

```cpp
struct Base
{
    virtual void some_func(float);
};

struct Derived : Base
{
    virtual void some_func(int) override; // ill-formed - doesn't override a base class method
};
```

if it's defined as final, then no class can override it 

```cpp
struct Base2
{
    virtual void f() final;
};

struct Derived2 : Base2
{
    void f(); // ill-formed because the virtual function Base2::f has been marked final
};

```

