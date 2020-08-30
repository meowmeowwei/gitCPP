# week3 - sorting

STL

* sort
* stable\_sort



Iterative Sorting \(selection sort, bubble sort, insertion sort\)

Recursive Sorting \(merge sort, quick sort\)

Radix Sort



**Selection Sort** 

* find largest item
* swap with item at the end of array
* go to step 1 by excluding the largest item from the array

```cpp

#include <iostream>
#include <stack>
#include <algorithm>
#include <vector>
using namespace std;



void selectionSort(vector <int> & vec){

//find largest item
//swap with item at the end of array
//go to step 1 by excluding the largest item from the array
//O(n^2)

    int size = vec.size();
    for(int i= size-1; i >=0; i --){
      int maxIndex = i;
      for(int j =0 ; j <=i; j++){
        if(vec[j] > vec[maxIndex])
          maxIndex = j;
      }
      swap(vec[i], vec[maxIndex]);
    }
}


void bubbleSort(vector<int> & vec){

//compare and swap from begin til end O(n^2)
 
 for(int i=vec.size()-1; i>=1; i--){
  bool isSorted;
  for(int j=0; j <i; j++){
    if(vec[j] >vec[j+1]){
      swap(vec[j], vec[j+1]);
      isSorted = false;
    }
  }

  if(isSorted)
    return;
 }

}


int partition(vector<int> & vec, int low, int high){
  int p = vec[low];
  int m = low;

  for(int k= low+1; k <= high; k++){
    if(vec[k]< p){
      m++;
      swap(vec[k], vec[m]);
    }
  }

  swap(vec[low], vec[m]);
  return m;
}


void quickSort(vector<int> & vec, int low, int high){

  // choose a pivot point , then sort the remaining left and right with same logic 
  if(low < high){
    int pivot = partition(vec, low, high);
    quickSort(vec, low, pivot-1);
    quickSort(vec, pivot+1, high);
  }
}

void merge (vector<int> & vec, int start, int mid, int end){
  int n = end - start +1;
  vector<int> b {n,0};

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

}


void mergeSort(vector<int> & vec, int start, int end){

  if(start<end){
    int mid = (start + end )/2;

    mergeSort(vec, start, mid);
    mergeSort(vec, mid+1, end);

    merge(vec, start, mid, end);
  }

}


int main()
{
   
  vector<int> x {5,4,3,2,1};

  //selectionSort(x);

  //bubbleSort(x);

  //quickSort(x, 0, 4);

  mergeSort(x, 0, 4);
  for_each(x.begin(), x.end(), [](int & y){cout<<" " <<y;});


  return 0;
}
```

