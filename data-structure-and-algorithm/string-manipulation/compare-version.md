---
description: 'https://leetcode.com/problems/string-to-integer-atoi/'
---

# Compare Version

```cpp

class Solution {
public:
    int myAtoi(string str) {
        
        string answer ="";
        int startIndex;
        int finalAnswer =1;
        for(int i=0; i < str.length(); i++){
            if(str[i] ==' '){
                
            }
            else{
                startIndex =i;
                break;
            }
        }
        
        for(int k = startIndex; k < str.length(); k++){
            if(str[k]!= ' '){
                answer.push_back(str[k]);
            }
            else{
                break;
            }
        }
        
        if(answer.length()>0){
            if(!(answer[0] == '-' || isdigit(answer[0]))){
                return 0;
            }
            
            if(answer[0] =='-'){
                finalAnswer = -1;
                
                if(answer.length()>1){
                finalAnswer *= (answer[1]-'0');
            }
            

                
            }
            }else
            {
                finalAnswer *= (answer[0]-'0');
            
                for(int i = 1; i<answer.length(); i++){
                if(!isdigit(answer[i]))
                    return 0;
                else{
                    finalAnswer * 10 + (int)(answer[i]-'0');
                }
            }
            
            
            
            return finalAnswer;
            
            
            
        }else{
            return 0;
        }
        
    
    }
};
```

