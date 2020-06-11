# Reverse Words in a String

```cpp

#include <iostream>
#include <string>
#include <algorithm>
using namespace std;

void reverseWords(string & message){
	if(message.find_first_of(" ") == string::npos){
        return ;
    }
    
    reverse(message.begin(), message.end());
    
    int startIndex =0;;
    
    for(int i= startIndex; i <= message.length(); i++){
        if(message[i] == ' ' || i == message.length()){
            reverse(message.begin()+startIndex, message.begin()+i);
            startIndex = i+1;
        }
    }
}



int main(){
	string message = "cake pound steal";

	reverseWords(message);

	cout << message << endl;
}

```

