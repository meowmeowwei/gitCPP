# Maths

[1\) find number that appears twice ](https://www.interviewcake.com/question/python/which-appears-twice?course=fc1&section=combinatorics-probability-math)

```cpp
void appearTwice(vector<int> & vec){
	vector<bool> booVec ((int)vec.size(), false);

	for(int x : vec){
		if(booVec[x]){
			cout << x << endl;
			return;
		}
		else
			booVec[x] = true;
	}

}


void appearTwice2(vector<int> & vec){
	sort(vec.begin(), vec.end());

	int prev = vec[0];

	for(int i=1; i < vec.size(); i++){
		if(prev == vec[i]){
			cout << vec[i]<<endl;
			return;
		}
		else{
			prev = vec[i];
		}

 }		

}

void appearTwice3(vector<int> & vec){ 

// we can calculate totoal for trangular series

	int n = vec.size()-1;
	int sum = (n*(n+1))/2;

	int totalSum = accumulate(vec.begin(), vec.end(), 0);
	
	cout << totalSum - sum << endl;	

}

int main(){
	
 vector<int> vec = {1, 2, 2, 3, 4};

 appearTwice(vec);


}
```

2\) [Check Item in the List ](https://www.interviewcake.com/question/python/find-in-ordered-set?course=fc1&section=combinatorics-probability-math)

```cpp
// Binary search log (n) size 1
bool findItem(vector<int> & vec, int x, int start, int end){
	
	if (start > end)
		return false;
	int m = start + (end-start)/2;
	if(vec[m] == x)
		return true;
	if(vec[m]> x){
		return findItem(vec, x, 0, m-1);
	}
	else{
		return findItem(vec, x, m+1, end);
	}

}

int main(){
	
 vector<int> vec = {1,2,2,3,4,5};

 cout << boolalpha << findItem(vec, 5, 0, 5) << endl;



```

