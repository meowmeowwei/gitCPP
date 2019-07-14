#include <iostream>
#include <string>
#include <algorithm>
using namespace std;

bool isPalindrome( string & input){

	if (input.length()<2)
		return false;
	else{
		char a ;
		char b ; 
		for(int i=0, j=input.length()-1; i < input.length(); i++,j--){
			a = input[i];
			b = input[j];
			if(i!=j && a!=b){
				return false;
			}

		}
	}
	return true;

	
}

int main(){
	
	string input = "ttett";

	cout << "isPalindrome :" << boolalpha<<isPalindrome(input)<<endl;;

	return 0;
}
