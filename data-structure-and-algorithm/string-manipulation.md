# String Manipulation

1\) Implement substring function 

a. brute force

n-&gt; length of x, m-&gt; length of y

Time Complexity: O\(\(n – m + 1\) × m\) ≈ O\(n × m\). Space Complexity: O\(1\).

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

