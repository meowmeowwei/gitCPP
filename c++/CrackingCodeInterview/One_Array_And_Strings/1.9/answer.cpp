#include <iostream>
#include <string>
#include <algorithm>
using namespace std;

bool stringRotation( string & s1, string & s2){

	if(s1.length()!=s2.length()) return false;

	else{
	s1+=s1;
		if(s1.find(s2) != string::npos)
			return true;
		else 
			return false; 
    }
}

int main(){
	
	string s1;
	string s2;
	getline(cin, s1);
	getline(cin, s2);

	cout << "StringRotation :" << boolalpha<<stringRotation(s1,s2)<<endl;;

	return 0;
}
