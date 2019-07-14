#include <iostream>
#include <string>
using namespace std;

bool validate(string input){

	if(input.length()==1)
		return true; 
	else{
		string x;
		string y;
		for (int i= 0; i < input.length()-1; i++){
			x = input.substr(i, 1);
			//cout<<"X:"<<x<<endl;
			for ( int j=input.length()-1;j>1; j--){
				//cout <<"j: "<<j<<endl;
				y = input.substr(j,1);
				//cout<<"Y:"<<y<<endl;
				if(x==y )
					return false;
			}


		}
	}
	return true;

	
}

int main(){
	
	string input = "test";
	cout<<std::boolalpha<<endl;
	cout << "isUnique:"<<validate(input)<<endl;

	return 1;
}
