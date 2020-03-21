# C++ File Input Output

ifstream means both input and output

```cpp
#include <iostream>
#include <string>
#include <fstream>

using namespace std;

int main(){
	
	string filename;
	cout << "please enter file name"<<endl;
	getline(cin, filename);

	ifstream myfile(filename);

	string line;
	if(myfile.is_open()){
		while(getline(myfile, line)){
			cout << line <<endl;
		}
		myfile.close();
	}
	else{
		cout << "unable to open the file"<<endl;
	}

}
```

