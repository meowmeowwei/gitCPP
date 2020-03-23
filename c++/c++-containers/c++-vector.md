# C++ Vector

implemented as wrapper around a C style array with defined size 

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

vector &lt;int&gt; vec;

vect.at\(5\) will throw out\_of\_range exception.. this is better than vec\[5\], but may have small performance issue 

vector performs better for traversal and for sorting and searching than list 

