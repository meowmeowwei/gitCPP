---
description: 'https://www.geeksforgeeks.org/write-your-own-atoi/'
---

# implement ATIO

```cpp

using namespace std; 
  
// A simple atoi() function 
int myAtoi(char* str) 
{ 
    // Initialize result 
    int res = 0; 
  
    // Iterate through all characters 
    // of input string and update result 
    for (int i = 0; str[i] 
                    != '\0'; 
         ++i) 
        res = res * 10 + str[i] - '0'; 
  
    // return result. 
    return res; 
} 
  
// Driver code 
int main() 
{ 
    char str[] = "89789"; 
    int val = myAtoi(str); 
    cout << val; 
    return 0; 
} 

```

