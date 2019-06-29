#include <iostream>
using namespace std;

void handleFormat1() {
	long someCounter;
	/* ... */

	cin >> someCounter;

	long sum =0; 
	long value =0;
	someCounter++;
	while (someCounter-- > 1) { // iterates exactly N-1 times
		cin >> value;
		sum += value; 
		cout << sum <<" ";
	}
	cout <<endl;
}
void handleFormat2() {
	long someVariable;
	/* ... */

	cin >> someVariable;
	long value =0; 
	long sum =0;
	while (someVariable != -1) { // true if not sentinel
		cin >> value;
		sum += value; 
		cout << sum <<" ";
	}
	
}
void handleFormat3() {
	long someVariable;
	/* ... */
	cin >> someVariable;
	long sum = 0;
	long value =0; 
	while (cin >> someVariable) { // true if read successful, i.e. not EOF
		cin >> value;
		sum += value; 
		cout << sum <<" ";
	}
	
}

int main() {
	// remove these 2 lines if using <cstdio>, i.e. scanf() / printf()
	ios_base::sync_with_stdio(false);
	cin.tie(NULL);
	
	int format; // handle all kinds of different input formats for practice
	cin >> format;
	
	if (format == 1) handleFormat1();
	else if (format == 2) handleFormat2();
	else if (format == 3) handleFormat3();
	
	return 0;
}
