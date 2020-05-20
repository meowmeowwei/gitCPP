# Products of all Except current Index

```cpp

vector<int> getProductsOfAllIntsExceptAtIndex(vector<int> & vec){
	vector<int> productBeforeIndex (vec.size());

	int productSoFar = 1;

	for(int i =0; i < vec.size(); i++){
		productBeforeIndex[i] = productSoFar;
		productSoFar *= vec[i];

	}

	vector<int> productAfterIndex (vec.size());

	productSoFar = 1;

	for(int i = vec.size()-1; i >= 0; i--){
		productAfterIndex[i] = productSoFar;
		productSoFar *= vec[i];
	}

	vector <int> result (vec.size());

	for(int i=0; i < vec.size(); i++){
		result[i] = productBeforeIndex[i] + productAfterIndex[i];
	}

	return result;

}

int main(){
	
	vector<int> numbers{10, 7, 5, 8, 11, 9};

    vector<int> results =  getProductsOfAllIntsExceptAtIndex(numbers);


}


```

