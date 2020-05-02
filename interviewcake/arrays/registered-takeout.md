---
description: >-
  https://www.interviewcake.com/question/cpp/cafe-order-checker?course=fc1&section=array-and-string-manipulation
---

# Registered TakeOut

```cpp
bool validate(vector<int> & vec3, vector<int> & vec1, vector<int> & vec2){
	bool result = true;

	int l =0, r =0;

	for(int i=0; i < vec3.size(); i++){
		if(vec3[i] == vec1 [l]){
			l++;
			
		}
		else if(vec3[i] == vec2[r]){
			r++;
		}
		else{
			return false;
		}
		
	}


	return result; 
}



int main(){

	vector<int> vec1 = {17, 8, 24};
	vector<int> vec2 = {12, 19, 2};
	vector<int> vec3 = {17, 8, 12, 19, 24, 2};

	cout << boolalpha << validate(vec3, vec1, vec2) << endl;


}
```

