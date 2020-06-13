---
description: 'https://www.geeksforgeeks.org/convert-string-binary-sequence/'
---

# Convert String To Binary

```cpp

#include <iostream>
#include <string>
#include <algorithm>
using namespace std;

void covertStringToBinary(string message){

	for (int i=0; i < message.length(); i++){

		int val = (int) (message[i]);

		string bin = "";

		while (val > 0){
			(val % 2) ? bin.push_back('0') : bin.push_back('1');

			val/=2;
		}

		reverse(bin.begin(), bin.end());

		cout << bin << " ";
	}
}



int main(){

	string message = "CFG";

	covertStringToBinary(message);

	


```

