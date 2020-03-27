# Quick Sort

choose a pivot point and partition the items of array into two parts, those smaller than pivot and those bigger than pivot 

time complexity nlogn

```cpp

int partition (int * a, int low, int high){

	int p = a[low];
	int m = low;

	for(int k= low+1; k<= high; k++){
		if(a[k] <p){
			m++;
			swap(a[k], a[m]);
		}
		else{

		}
	}

	swap(a[low], a[m]);
	return m; 
}


void quickSort(int * a, int low, int high){

	//keep finding a pivot point and do recursive sort for each partition

	if(low < high){
		int pivotIdx = partition (a, low, high);

		quickSort(a, low, pivotIdx -1);
		quickSort(a, pivotIdx+1, high);
	}

}

```

