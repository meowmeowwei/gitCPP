---
description: 'https://leetcode.com/problems/longest-substring-without-repeating-characters/'
---

# Longest SubString without repeating characters

```cpp
class Solution {
public:
    int lengthOfLongestSubstring(string s) {
        
        if(s.length()==0)
            return 0;
        
        if(s.length()==1)
            return 1;
        
        int maxLength =0;
        
        int values [256] ={0};
        
        int leftIndex =0, rightIndex =0;
        while(rightIndex<s.length()){
            if(values[s[rightIndex]] ==0 ){
                values[s[rightIndex]] =1;
                
            
                maxLength = max(rightIndex-leftIndex+1, maxLength);
                rightIndex++;

            }
            else{
                while(s[leftIndex]!= s[rightIndex] ){
                    values[s[leftIndex]] =0;
                    leftIndex++;
                }
                leftIndex++;
                maxLength = max(rightIndex-leftIndex+1, maxLength);
                
                rightIndex++;
                
            }
            
                
        }

        
        
        return maxLength;
    }
};


```

