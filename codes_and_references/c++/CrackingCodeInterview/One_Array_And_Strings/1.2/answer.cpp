#include <iostream>
#include <string>
#include <algorithm>
using namespace std;

bool isPermutation(string input, string input2){

	if(input.length()!=input2.length())
		return false;
	else{
		sort(input.begin(), input.end());
		sort(input2.begin(), input2.end());

		if(input==input2)
			return true;
		else
			return false; 

	}

	return false;
}

int main(){
	
	string input = "test";
	string input2= "test";
	cout<<std::boolalpha<<endl;
	cout << "isPermutation:"<<isPermutation(input, input2)<<endl;

	return 0;
}
