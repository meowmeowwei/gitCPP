# C++ Vector

Erase : can be used to erase values in the vector

insert : can be used to append another vector into it

```cpp
// Complete the rotLeft function below.
vector<int> rotLeft(vector<int> a, int d) {
    vector<int> temp;
    for(int i=0; i <d; i++){
        temp.push_back(a[i]);
       
    }
    a.erase(a.begin(), a.begin()+d);
    a.insert(a.end(), temp.begin(), temp.end());
    return a;
}
```

