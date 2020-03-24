# C++ 11 Range Based For loop

```cpp
int my_array[5] = {1, 2, 3, 4, 5};
// double the value of each element in my_array:
for (int& x : my_array)
    x *= 2;

// similar but also using type inference for array elements
for (auto& x : my_array)
    x *= 2;
```

