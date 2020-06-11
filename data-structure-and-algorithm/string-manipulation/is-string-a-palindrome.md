---
description: 'https://leetcode.com/problems/valid-palindrome/'
---

# is String a Palindrome

```cpp

class Solution {
public:
    bool isPalindrome(string s) {
        if(s=="")
            return true;
        
        int l = 0;
        int r = s.length()-1;
        
        while(l<r){
            while(!isalnum(s[l]) && l<r){
                ++l;
            }
            while(!isalnum(s[r]) && l<r){
                --r;
            }
                  
            if(tolower(s[l])==tolower(s[r])){
                ++l;
                --r;
            }
            else{
                return false; 
            }
                
        }
        
        
        return true;
        
    }
};

```

