# Selection Sort

from all the items , find the largest item

swap with \(n-1\) item

reduce n by 1 and go to step 1



```cpp
#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;


void selectionSort(int * vec, int start, int end){
	

	for (int i = end; i >=1; i--){
		int maxIndex = i;
		for (int j = start; j <i; j++){
				if(vec[j] > vec[maxIndex]){
					maxIndex = j;
				}
		}
		swap(vec[maxIndex], vec[i]);
	}
}





int main(){

	//more details on CS3230


	int  vec [] =  {1,5,10,3,2};



	selectionSort(vec, 0, 4);

	for (int i : vec){
		cout << i << " " ;
	}
```

