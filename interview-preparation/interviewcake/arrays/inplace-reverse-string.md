---
description: >-
  https://www.interviewcake.com/question/cpp/reverse-string-in-place?course=fc1&section=array-and-string-manipulation
---

# inplace reverse string

Write a function that takes a string and reverses the letters in place. 



```cpp
void reverse(string& str)
{
    if (str.empty()) {
        return;
    }

    size_t leftIndex = 0;
    size_t rightIndex = str.length() - 1;

    while (leftIndex < rightIndex) {
        // swap characters
        swap(str[leftIndex], str[rightIndex]);

        // move towards middle
        ++leftIndex;
        --rightIndex;
    }
}

//O(n) time and O(1)O(1) space.
```

