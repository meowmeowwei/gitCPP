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


int main(){
	
 vector<int> vec = {10, 7, 5, 8, 7, 11, 9};

 appearTwice(vec);


}
```

