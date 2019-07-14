#include <iostream>
#include <string>
#include <algorithm>
using namespace std;

string stringCompression( string & s1){

	string output; 

	int count=0;
	
	output+=s1.substr(0,1);
	for(int i=0; i < s1.length(); i++){
		if(s1[i]==output[output.length()-1]){
			count++;
		}else{
			if(count>1){
				output+= to_string(count);
				
				count=0;
			}
			output+=s1[i];
		}
	}

	if(output.length()>=s1.length())
		return s1;
	else
		return output;
	
}

int main(){
	
	string s1;

	getline(cin, s1);


	cout << "StringCompression :" << stringCompression(s1)<<endl;;

	return 0;
}
