---
description: pdf pg 407/708
---

# Chapter 10 - Sorting and Searching

-&gt; question 9 and 10 still need more effort to redo 



1\)

note that both a and b are already sorted 

```cpp

#include <iostream>
using namespace std;


void sorting(int * a, int * b, int aSize, int bSize){


	int totalIndex = aSize + bSize-1;
	int aIndex = aSize -1;
	int bIndex = bSize -1;
	


	while(totalIndex >=0){
		if(a[aIndex]> b[bIndex]){
			b[totalIndex--] = a[aIndex--];
		}
		else{
			b[totalIndex--] = b[bIndex--];
		}
	}

}

int main(){
	int a[] = {1,2,3,4,5};
	int b[10] = {4,5,6,7,8};

	sorting(a, b, 5, 5);

	for (int i=0; i < 10; i++){
		cout << b[i] << "," ;
	}
}

```

2\) try sorting twice 

```cpp
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

5\) binary search but need to move around to get the none empty word

```cpp
int searchVec(vector<string> vec, string searchString, int first, int last){

	if(first > last) return -1;

	int mid = (first + last)/2;

	if(vec[mid]== ""){
		int left = mid -1;
		int right = mid +1;

		while(true){
			if(left < first && right > last)
				return -1;
			else if (right <=last && vec[right] != ""){
				mid =right;
				break;
			}
			else if( left >= first && vec[left] != ""){
				mid = left;
				break;
			}
			right ++;
			left --;
		}
	}

	if(searchString==(vec[mid])){
		return mid;
	}
	else if(vec[mid] < searchString){
		return searchVec(vec, searchString, mid+1, last);
	}
	else{
		return searchVec(vec, searchString, first, mid -1);
	}

}


int main(){
	vector<string> vec {"at", "","", "","ball",""};

	cout << searchVec(vec, "ball", 0, vec.size())<<endl;

}
```

6\) sort big file

20GB file divide into chunks, each having the amount of memory we have available. each chunk sorted separately and then saved back to the file system.

7\)

1gb has 1billion bytes = 8 billion bits, 

1KB = 1024 bytes = 2 ^10 bytes

there are only 2 ^ 32 \(4 billion integers\) and only 2^31 none -negative integers, hence 1 gb memory can hold all the integers in the questions, using a bit-vector of booleans to find the not used item 

8\)

use bit vector 

11\)

```text
void sortValleyPeak(vector<int> vec){

	sort(vec.begin(), vec.end());

	for(int i =1; i < vec.size(); i+=2){
		swap(vec[i-1], vec[i]);
	}

}
```

