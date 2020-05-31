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

```cpp
// implement substring function

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

