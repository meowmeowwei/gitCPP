# TopScore

```cpp


vector<int> getResult(vector<int> & vec, int highestScore){
	int * arr = new int[highestScore+1]{0};


	for(int i=0; i < vec.size(); i++){
		arr[vec[i]] ++;
	}

	vector<int> result;

	for(int k=highestScore; k>=0; k--){
		if(arr[k]){
			for(int i=0;i < arr[k];  i++){
				result.push_back(k);
			}
		}
	}

	delete [] arr;
	return result;
}


int main(){
	
	vector<int> vec {37, 89, 41, 65, 91, 53};

	vector<int> x = getResult(vec, 100);

	for(int y : x){
		cout << y << endl;
	}

}
```

