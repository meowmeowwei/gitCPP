---
description: pdf pg 407/708
---

# Chapter 10 - Sorting and Searching

1\)

note that both a and b are already sorted 

```text
void sorting(int * a, int * b, int aSize, int bSize) {
	int aIndex = aSize-1;
	int bIndex = bSize-1;
	int totalIndex = aSize + bSize - 1;

	while (bIndex >=0){
		if(a[aIndex]>b[bIndex]){
			a[totalIndex] = a[aIndex];
			aIndex --;
		}
		else {
			a[totalIndex] = b[bIndex];
			bIndex --;
		}
		totalIndex --;
	}

}
```

2\) 

try sorting twice 

```text
bool compareFunction(string a, string b){
	sort(a.begin(), a.end());
	sort(b.beign(), b.end());

	return a<b; 
}

void sort(vector<string> stringList){
	sort(stringList.begin(), stringList.end(), compareFunction);
}
```

3\) 

```text
bool binarySearch (vector<int> vec,int low, int high,  int question){
	sort(vec.begin(), vec.end());
	int mid = vec.size()/2;

	if(question <vec[mid]){
		return binarySearch(vec, mid+1, high, question);
	}
	if(question == vec[mid]){
		return true;
	}
	if(question > vec[mid]){
		return binarySearch(vec, 0, mid-1, question);
	}
}

```

4\) 

```text
int binarySearch(Listy list, int value, int low, int high){
	int mid;

	while(low <=high){
		mid = (low + high) /2;
		int middle = list.elementAt(mid);
		if(middle > value || middle == -1){
			high = mid -1;
		}else if(middle <value){
			low = mid +1;
		}else{
			return mid;
		}
	}
	return -1;
}


int search(Listy list, int value){
	int index =1;
	while(list.elementAt(index) !=-1 && list.elementAt(index) < value){
		index * =2;
	}

	return binarySearch(list, value, index/2, index);
}
```

