# Merge Sort

divide and conquer 

assuming you already have two sorted list,  need to implement the merge method 



the merging method itself will take about O\(k\)

number of times merge is called is lg \(n\)

so total complexity is NLogN

![](../../.gitbook/assets/image%20%28128%29.png)





```cpp

#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;



void merge(int * vec, int start, int mid, int end){
	int n = end - start +1;
	int * b = new int [n];

	int left = start; int right = mid+1; int bIndex = 0;

	while(left <= mid && right <= end){
		if(vec[left] <= vec[right]){
			b[bIndex++] = vec[left++];
		}
		else{
			b[bIndex++] = vec[right++];
		}
	}

	while(left <= mid ){
		b[bIndex++] = vec[left++];
	}

	while(right <=end){
		b[bIndex++] = vec[right++];
	}

	for(int i =start; i < n; i ++){
		vec[start+i] = b[i];
	}

	delete [] b;
}


void mergeSort(int * vec, int start, int end){
	
	if(start < end){
		int mid = (start + end) /2;

		mergeSort(vec, start, mid);
		mergeSort(vec, mid+1, end);

		merge(vec, start, mid, end);
	}
}





int main(){

	//more details on CS3230


	int  vec [] =  {1,5,10,3,2};
	

	mergeSort(vec, 0, 4);
	
	for (int i : vec){
		cout << i << " " ;
	}
}

```

