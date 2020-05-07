# highest product of 3 integers

Brute Force

```cpp
nt getMaxProduct(vector<int> & numbers){
	int max =0;
	for(int i=0; i<numbers.size(); i++){
		for(int k=0; k < numbers.size(); k++){
			for(int j =0; j<numbers.size(); j++){
				if(i!=j && i!=k && j!=k ){
					if(numbers[i]*numbers[j]*numbers[k] > max){
						max = numbers[i]*numbers[j]*numbers[k];
					}
				}
			}
		}
	}

	return max;
}



```

