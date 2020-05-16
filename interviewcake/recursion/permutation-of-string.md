# Permutation of String

```cpp
unordered_set<string> getPermutations(const string& inputString)
{
    // generate all permutations of the input string
    unordered_set<string> answer;
    
    if(inputString.length()<=1){
        answer.insert(inputString);
        return answer;
    }
    
    int len = inputString.length();
    
    string allCharsExceptLast = inputString.substr(0, len-1);
    char lastChar = inputString[len-1];
    
    const auto permutationOfAllCharsExceptLast = getPermutations(allCharsExceptLast);
    
    for(const string & per : permutationOfAllCharsExceptLast){
        for(int pos = 0; pos <= per.length(); ++ pos){
            string permutation = per.substr(0, pos) + lastChar + per.substr(pos);
            answer.insert(permutation);
        }
    }
    
    

    return answer;
}



```

