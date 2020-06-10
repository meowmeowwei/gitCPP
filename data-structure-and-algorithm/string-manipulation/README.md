---
description: 'https://www.byte-by-byte.com/strings/'
---

# String Manipulation

**C++ String  \#include &lt;string&gt;**

* not mutable 
* not primitive 
* s1.compare\(s2\)
* s1\[i\] accessibility 

**Useful C++ String Methods:**

* `s1.length()` – Returns the length of the string \(from `string::length`\)
* `s1.find(s2)` – Returns the index of `s1` in the string `s2` \(from `string::find`\)
* `strcpy(char_array, s1.c_str())` – Converts `s1` into a character array
* `s1.substr(i,j)` – Get  the substring of `s1` from `i` with length `j`

\`\`

**`Get Ascii value of C++ character`** ``

* do casting \(int\) c



* [~~Anagrams~~](https://www.byte-by-byte.com/anagrams/)~~~~
* [Sorting the characters in a string](https://www.geeksforgeeks.org/sort-string-characters/)
* [Longest substring without a repeating character](https://leetcode.com/problems/longest-substring-without-repeating-characters/)



```cpp

#include <string>
#include <iomanip>

using namespace std;


bool isSubString(string x, string y){

	for(int i=0; i<=x.length()-y.length(); i++){
		int j=0;
		while(j<y.length() && y[j] == x[i +j] ){
			j ++;
		}
		if(j== y.length()){
			return true;
		}
	}
	return false;

}

int main(){	
	cout << boolalpha<<isSubString("sunwei", "sun")<<endl;

}
```

```cpp
//LongestSubstring with no repeating

#include <iostream> 
#include <sys/ipc.h> 
#include <sys/shm.h> 
#include <stdio.h> 
using namespace std; 


    int lengthOfLongestSubstring(string s) {
        int maxLength =0;
        
        int values [256] ={0};
        
        int leftIndex =0, rightIndex =0;
        while(rightIndex!=s.length()-1){
            if(values[s[rightIndex]] ==0 ){
                values[s[rightIndex]] =1;
                rightIndex++;
            
                maxLength = max(rightIndex-leftIndex, maxLength);

            }
            else{
                while(s[leftIndex]!= s[rightIndex]){
                    values[leftIndex] =0;
                    leftIndex++;
                }
                leftIndex++;
                maxLength = max(rightIndex-leftIndex, maxLength);
                rightIndex++;
                
            }
            
                
        }

        
        
        return maxLength;
    }
  
int main() 
{ 
    cout << lengthOfLongestSubstring("abcabcbb") <<endl;
  
    return 0; 
} 

```
