---
description: 'http://docwiki.embarcadero.com/RADStudio/Rio/en/Extern_Templates_(C%2B%2B11)'
---

# c++ 11 extern template

more explicit control of template instantiation

A template specialization can be explicitly declared as a way to suppress multiple instantiations. For example:

```cpp
    #include "MyVector.h"    
    extern template class MyVector<int>; 
    // Suppresses implicit instantiation below --                    
    // MyVector<int> will be explicitly instantiated elsewhere    
    void foo(MyVector<int>& v)    {        
    // use the vector in here    
    }
```

The “elsewhere” might look something like this:

```cpp
    #include "MyVector.h"    
    template class MyVector<int>; 
    // Make MyVector available to clients (e.g., of the shared library
```

This is basically a way of avoiding significant redundant work by the compiler and linker.

