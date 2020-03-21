# C++ Array

```cpp
// why use Array as compared to build in array
// ANS : 
// 1. Array knows it's size 
// 2. Array can be copied using =
// 3. it doesnt allow nasty conversions to pointers 

Circle a1[10]
array<Circle,10> a2;
Shape * p1 = a1;
Shape * p2 = a2; // error no convention allowed 
p1[3].draw(); // disaster as size of Shape < size of circle
```

