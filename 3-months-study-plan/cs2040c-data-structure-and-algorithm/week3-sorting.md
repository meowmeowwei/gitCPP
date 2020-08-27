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

void selectionSort(vector <int> & vec){

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



int main()
{
   
  vector<int> x {5,4,3,2,1};

  selectionSort(x);

  for_each(x.begin(), x.end(), [](int & y){cout<<" " <<y;});


  return 0;
}

```

