# C++ Type inference

Auto and decltype

```cpp

int main () 
{ 
    auto x = 5;
    decltype (x) y = 9.15;

    cout << y << endl;

    return 0; 
} 
```

the answer will be 9 , since x is being initialised as an int 

