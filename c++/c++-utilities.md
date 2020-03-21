# c++ utilities

1\) move 

doing a rvalue\_cast 

```cpp
auto p = make_unique<int>(2);
auto q = move(p);

e.g. 
string s2 = "hello";
vector <string> v;
v.push_back(move(s2)); //prevent copying, but error prone if s2 is used again
```

2\) forward

helper function to allow perfect forwarding of arguments taken as rvalue references to deduced types.

```cpp
return unique_ptr<T>{new T{forward<Args>(args)...}}

```

