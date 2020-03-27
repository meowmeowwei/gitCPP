# Insertion Sort

Start with one card

pick next card and insert it in proper order

repeat the steps

```cpp
#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;


void insertionSort(int * vec, int start, int end){
	

	for ( int i = 1; i <=end; i++){
		int nextValue = vec[i];

		int j;
		for (j = i-1; j >=0 && vec[j] > nextValue; j --){
			vec[j+1] = vec[j];
		}

		vec[j+1] = nextValue;
	}
}



int main(){

	//more details on CS3230


	int  vec [] =  {1,5,10,3,2};


	insertionSort(vec, 0, 4);

	for (int i : vec){
		cout << i << " " ;
	}
}

```

