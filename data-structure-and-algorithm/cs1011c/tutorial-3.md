# Tutorial 3

Question 1 -&gt; template and pair

```cpp

#include <iostream>
#include <string>
using namespace std;

template <typename TL, typename TR>
class Pair{
protected:

	TL* left; TR* right;

public:
	Pair(TL * pLeft, TR * pRight) : left(pLeft), right(pRight){

	}

	virtual TL * getLeft(){
		return left;
	}

    virtual	TR * getRight(){
		return right;
	}
};


template <typename TL, typename TM, typename TR>
class Triplet : public Pair <TL, TR>{ 
	TM * middle;

public:
	Triplet(TL * pL, TM * pM, TR * pR) : Pair<TL,TR> (pL, pR), middle(pM){

	}

	TM * getMiddle(){
		return middle;
	}

};


int main(){
	int x = 1, y=2, z=3;
	Triplet <int, int, int> t(&x, &y, &z);

	cout << *t.getLeft() <<endl;
	cout << *t.getMiddle() << endl;
	cout << *t.getRight() << endl;

}



```

question 2 . Vector processing

```cpp

#include <iostream>
#include <string>
#include <vector>
#include <algorithm>
using namespace std;

void cleanUp (vector<string> & pallets){
	int index =1;
	string prev = pallets[0];

	while (index <= pallets.size()){
		if(pallets[index] == pallets[index-1]){
			pallets.erase(pallets.begin()+index); // erase will cause the later elements to be copied forward 
		}
		else{
			index ++;
		}
	}
}

void cleanUp2 (vector<string> & pallets){
	vector<string> :: iterator prev = pallets.begin();
	auto curr = prev +1;

	
	while (curr < pallets.end()){
		if(*prev == * curr ){
			curr = pallets.erase(curr);
		}
		else{
			prev++;
			curr++;
		}
	}
}

void cleanUp3 (vector<string> & pallets){
	pallets.resize(unique(pallets.begin(), pallets.end()) - pallets.begin()); // unique will return iterator pointing to new last element
}


int main(){
	
	vector<string> ss = {"hello", "hello", "sunwei"};

	cleanUp3(ss);

	cout << ss.size();

}



```

Question 3

```cpp
#include <iomanip>
#include <iostream>
#include <sstream>
#include <string>
using namespace std;
class Product {
string _productID; // any non-negative int is a valid ID
string _volume; // in cubic mm
string _weight; // in grams
public:
Product(string pInput) { 
	int firstDelimiter = pInput.find_first_of(",:;|#");
	int lastDelimiter = pInput.find_last_of(",:;|#");
	int lastSpace = pInput.rfind(" ");

	_productID = pInput.substr(0, firstDelimiter);
	_volume = pInput.substr(lastDelimiter+1, lastSpace - lastDelimiter);
	_weight = pInput.substr(lastSpace+1, string::npos);


} // parse 1 record - set member vars

string str() {


ostringstream oss;
oss << "|" << setw(8) << _productID << "|" << setw(7) << _volume
<< "|" << setw(4) << _weight << "|";
return oss.str();


 } // return the nicely formatted record

string getProductID() { return _productID; }
string getVolume() { return _volume; }
string getWeight() { return _weight; }
};

int main(){
	Product p ("00900#acm327df2mm3d1f0#Carburetor needle;Honda CB400;4 pcs;8 5");

	cout << p.str() << endl;
}

```

