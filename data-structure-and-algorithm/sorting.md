# Sorting

1. **selection sort** 

![](../.gitbook/assets/image%20%2863%29.png)

```text
void selectionSort(vector <int> & vec){

//find largest value in the list, swap with n-1 item, reduce n by 1 

	for (int i = vec.size()-1; i >=1 ; i--){
		int maxIndex = i;

		for(int j =0 ; j < i; j++){
			if(vec[j] >= vec[maxIndex]){
				maxIndex = j;
				
			}

		}

		swap(vec[i], vec[maxIndex]);

	}
}
```

2. **Bubble sort** 

![](../.gitbook/assets/image%20%2840%29.png)

```text
void bubbleSort2(int * a){

	for (int i=4; i >0; i--){
		bool isSorted = true;

		for(int j =0; j < i; j++){
			if(a[j]<[j+1]){
				isSorted = false;
				swap(a[j], a[j+1]);
			}
		}
		if(isSorted)
			return;
	}
}
```

\*\*\*\*

**3. Insertion sort**

![](../.gitbook/assets/image%20%2889%29.png)

```text
void insertionSort2(int * vec){

	for(int i = 1; i < 5; i++){
		int next = vec[i];

		int j;

		for (j=i-1; j>=0 && vec[j]>next; j--){
			vec[j+1] = vec[j];
		}

		vec[j+1] = next;
	}

}
```

**4. Quick Sort** 

![](../.gitbook/assets/image%20%2853%29.png)

```text
int partition2(int * a, int i, int j){
	int p = a[i];
	int m = i;

	for(int k = i+1; k <=j; k++){
		if(a[k] <p){
			m++;
			swap(a[k], a[m]);
		}
	}

	swap(a[m], a[i]);
	return m;
}


void quickSort2(int * vec, int low, int high){

	if(low < high){
		int pivot = partition2(vec, low, high);

		quickSort2(vec, low, pivot -1);
		quickSort2(vec, pivot+1, high);
	}

}
```

\*\*\*\*

\*\*\*\*

