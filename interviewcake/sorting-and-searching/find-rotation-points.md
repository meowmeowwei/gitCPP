# Find Rotation Points

```cpp
size_t findPoint(const vector<string> & words, int start, int end){
    int m = start + (end-start)/2;
    
    if(words[m] < words[0]){
        if(words[m-1] > words[m]){
            return m;
        }
        else{
            return findPoint(words, start, m-1);
        }
    }else{
        return findPoint(words, m+1, end);
    }
}



size_t findRotationPoint(const vector<string>& words)
{
    // find the rotation point in the array
    int start = 0;
    int end = words.size()-1;
    
    return findPoint(words, start, end);
    
}


```

