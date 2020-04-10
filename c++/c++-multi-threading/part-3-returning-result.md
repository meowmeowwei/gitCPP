# Part 3 - Returning result

parse in the variable as a constant, in the return value, do the updates.

returning results through reference is not very elegant, should try use condition\_variable or future

```cpp

#include <iostream>
#include <thread>
#include <future>
#include <string>
#include <vector>

using namespace std;
 
struct F{
	const vector <double> & v;
	vector <double> * res;
	F(const vector<double> & vv, vector<double> * x ) : v{vv}{
		res = x;
	}

	void operator()(){
		for(int i =0; i < v.size(); i++){
			(*res)[i] += 1;
		}
	}
};
 
int main()
{
 	

 	const vector <double> v {1,2,3};
 	vector <double> resp{0,0,0};
 	F x (v, &resp);
	thread t1(x);

	t1.join();

	cout << "printing from end "<< endl;
	for(int i=0; i < v.size(); i++){
		cout << resp[i] << endl;
	}
 
	return 0;
}


```

