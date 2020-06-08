# Anagrams

[Anagrams](https://www.byte-by-byte.com/anagrams/)

```cpp
#include <iostream>
#include <string>
#include <algorithm>
using namespace std;

bool isAnagram(string a, string b){
	if(a.length()!=b.length())
		return false;

	for(int i=0; i < a.length(); i++){
		a[i] = tolower(a[i]);
		b[i] = tolower(b[i]);
	}

	sort(a.begin(), a.end());
	sort(b.begin(), b.end());

	return a==b;

}

bool isAnagram2(string a, string b){
	if(a.length()!=b.length())
		return false;

	char values [256] {0}; 
	for(int i=0; i < a.length(); i++){
		values[tolower(a[i])]++;
	}

	for(int j=0; j < b.length(); j++){
		values[tolower(b[j])]--;
	}

	for (int i=0; i < 256; i++){
		if(values[i])
			return false;
	}

	return true;

}


int main(){
	//cout << boolalpha << isAnagram("AB", "ba")<<endl;
	cout << boolalpha << isAnagram2("AB", "ba")<<endl;
}
```

