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



