# Sorting

**iterative sorting -&gt; Selection, Bubble, Insertion \(comparison based\)**

**recursive sorting -&gt; MergeSort, quickSort \(comparison based\)**

**radix sort -&gt; none-comparison based** 

**Properties of Sorting**

**in-placed -**&gt; if it only requires constant amount of extra space during the sorting process

Merge Sort is not in place because it needs an additional array

Radix sort needs a queue 

**Stable -&gt;** if the relative order of elements with same key value is preserved by algorithm

![](../../.gitbook/assets/image%20%28129%29.png)

[**select sort is not stable, because it swaps non-adjacent elements** ](https://www.quora.com/Why-is-a-selection-sort-algorithm-not-stable)\*\*\*\*

Suppose the array is 5 2 3 8 4 5 6 Let's distinguish the two 5's as 5\(a\) and 5\(b\) .

So our array is: 5\(a\) 3 4 5\(b\) 2 6 8

After iteration 1: 2 will be swapped with the element in 1st position:

So our array becomes: 2 3 4 5\(b\) 5\(a\) 6 8

Since now our array is in sorted order and we clearly see that 5\(a\) comes before 5\(b\) in initial array but not in the sorted array.

[**quick sort is not stable** ](https://stackoverflow.com/questions/13498213/quicksort-algorithm-stability)\*\*\*\*





1. **selection sort** 

![](../../.gitbook/assets/image%20%2873%29.png)

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

![](../../.gitbook/assets/image%20%2844%29.png)

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

![](../../.gitbook/assets/image%20%28101%29.png)

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

![](../../.gitbook/assets/image%20%2860%29.png)

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

**5\) Merge Sort**

![](../../.gitbook/assets/image%20%28117%29.png)

```text
void mergeList(int *a, int low, int mid, int high){
	int n = high - low +1;
	int * b = new int[n];

	int left = low, right = mid+1, bIdx =0;

	while ( left <= mid && right <= high){
		if(a[left] <= a[right])
			b[bIdx++] = a[left++];
		else
			b[bIdx++] = a[right++];
	}

	while(left <= mid) b[bIdx++] = a[left++];
	while(right <=high) b[bIdx++] = a[right++];

	for(int k=0; k <n; k++){
		a[low+k] = b[k];
	}

	delete [] b;

}



void mergeSort2(int * a, int low, int high){
	if(low < high){
		int mid = (low+high)/2;

		mergeSort2(a, low, mid);
		mergeSort2(a, mid +1, high);
		mergeList(a, low, mid, high);
	}
}
```

**6\) Radix Sort** 

![](../../.gitbook/assets/image%20%2881%29.png)

