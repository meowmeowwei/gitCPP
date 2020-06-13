---
description: 'https://leetcode.com/problems/minimum-window-substring/'
---

# Minimum Window Substring

```cpp


class Solution {
public:
    
   
    
    
    string minWindow(string s, string t) {
        
        int left =0,  count =0, windowSize=INT_MAX, minLeft = -1;
        
        
        
        int reference [256] = {0};
        
        for (char c: t )
            ++ reference[c];
        
        
        for(int i= 0; i < s.length(); i++){
            if(--reference[s[i]] >=0)
                count++;
            
            while(count == t.length()){
                if(windowSize > i-left+1){
                    windowSize = i-left+1;
                    minLeft = left;
                }
                
                if(++reference[s[left]] >0) --count;
                ++left;
            }
        }
        
        return minLeft == -1 ? "" : s.substr(minLeft, windowSize);
              
        
        
    }
};
```

