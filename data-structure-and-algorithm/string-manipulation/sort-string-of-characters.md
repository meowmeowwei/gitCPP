---
description: 'https://www.geeksforgeeks.org/sort-string-characters/'
---

# Sort String of Characters

```cpp
#include <iostream>
#include <string>
#include <algorithm>
using namespace std;



string sortString(string a){
	sort (a.begin(), a.end());

	return a;

}

void sortString2(string a){
	char text[256] = {0};

	for(char c : a){
		text[c -'a']++;
	}

	for(int i = 0; i < 256; i++){
		while(text[i]>0){
			cout << (char)('a' + i);
			-- text[i];
		}	
	}
}


int main(){
	//cout << boolalpha << isAnagram("AB", "ba")<<endl;
	cout  << sortString("bbaaccc")<<endl;

	sortString2("bbaaccc");
}

```

