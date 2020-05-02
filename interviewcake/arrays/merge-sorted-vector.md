---
description: >-
  https://www.interviewcake.com/question/cpp/merge-sorted-arrays?course=fc1&section=array-and-string-manipulation
---

# Merge Sorted Vector

```cpp
vector<int>  mergeVectors(const vector<int> & vec1, const vector<int> & vec2)
{
    vector<int> result ;

    int n = vec1.size() + vec2.size();

    int l = 0;
    int r = 0;


    while(l<vec1.size() && r <vec2.size()){
    	if(vec1[l] < vec2[r]){
    		result.push_back(vec1[l++]);
    	}
    	else{
    		result.push_back(vec2[r++]);
    	}
    }

    while(l<vec1.size()){
    	result.push_back(vec1[l++]);
    }

    while(r<vec2.size()){
    	result.push_back(vec2[r++]);
    }

    return result;

}




int main(){

const vector<int> myVector {3, 4, 6, 10, 11, 15};
const vector<int> alicesVector {1, 5, 8, 12, 14, 19};

vector<int> mergedVector = mergeVectors(myVector, alicesVector);

cout << "[";
for (size_t i = 0; i < mergedVector.size(); ++i) {
    if (i > 0) {
        cout << ", ";
    }
    cout << mergedVector[i];
}
cout << "]" << endl;
}

```

