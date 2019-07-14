#include <iostream>
#include <string>
#include <algorithm>
using namespace std;

void replaceSpace( string & input, int length){

	string output;
	for(int i=0; i< length; i++){
		if(input.substr(i, 1)==" "){
			output +="%20";
		}
		else{
			output += input[i];
		}
	}
	cout<< output<<endl;
	
}

int main(){
	
	string input = "test test2";

	replaceSpace(input, input.length());

	return 0;
}
