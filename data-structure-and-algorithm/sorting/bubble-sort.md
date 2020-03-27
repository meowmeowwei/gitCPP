# Bubble Sort

Given array of N items, compare pair of adjacent and swap them if they are out of orders

time complexity = o\(n square\)

```cpp


#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;


void bubbleSort(int * vec, int start, int end){
	

	for (int i = end; i >=1; i--){
		bool isSorted = true;
		for (int j = start; j <i; j++){
				if(vec[j] > vec[j+1]){
					swap (vec[j], vec[j+1]);
					isSorted = false;
				}
		}

		if(isSorted)
			return;
	}
}





int main(){

	//more details on CS3230


	int  vec [] =  {1,5,10,3,2};

	bubbleSort(vec, 0, 4);

	for (int i : vec){
		cout << i << " " ;
	}
}





```

