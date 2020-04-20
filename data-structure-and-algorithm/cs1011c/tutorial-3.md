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

