# inflight-system

```cpp

bool totalRuntime(int x, vector<int> & vec){
	unordered_map <int, int> movies;

	for(int i=0; i < vec.size(); i++){
		movies.insert(make_pair(vec[i], i));

		if(movies.size()>0 && movies.find(x-vec[i]) != movies.end() && movies[x-vec[i]] != i){
			return true;
		}
	}

	return false;


}



int main(){

	vector<int> vec = {1, 2, 3, 4, 5};

	cout << boolalpha << totalRuntime(5, vec) << endl;




}

```

