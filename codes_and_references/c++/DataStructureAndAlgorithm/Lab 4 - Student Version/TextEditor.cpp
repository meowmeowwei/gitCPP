#include <iostream>
#include <sstream>

using namespace std;

int main(){

	cout << "Enter your commands "<<endl;

	string command;

	getline(cin, command);

	int cursor =0; 

	string output ="";

	for (int i=0; i< command.length(); i++){
		switch (command.at(i)){
			case '[':
				cursor =0;
				break;
			case ']':
				cursor = output.length();
				break;
			case '<':
				output = output.substr(0, output.length()-1);
				cursor--;
				break;
			case '!':
				cout << output<< endl;
				output = "";
				cursor=0;
				break;
			default:
				output.insert(cursor,string(1,command.at(i)));
				cursor ++;
				break;
		}
	}

	return 1;
}
