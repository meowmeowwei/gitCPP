---
description: 'https://leetcode.com/problems/find-all-anagrams-in-a-string/'
---

# Find All Anagram in a String

```cpp
class Solution {
public:
    
    bool isAnagram(string str, string str2){
        
     
        int reference[256] ={0};
        
        for(char c : str){
            ++reference[c];
            
        }
        
        for(char s: str2){
            if(--reference[s]<0)
                return false;
        }
        
        
        return true;
    }
    vector<int> findAnagrams(string s, string p) {
        vector<int> answer;
        
        if(s.length()==0 || s.length()< p.length()){
            return answer;
        }
        int pLength = p.length();
        
        int l =0;
      
        
        while(l<=(s.length()-pLength) ){
            if(isAnagram(p, s.substr(l,pLength))){
                answer.push_back(l);
            }
            l++;
        }
        
        return answer;
    }
};


```

