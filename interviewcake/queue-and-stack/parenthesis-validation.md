---
description: >-
  https://www.interviewcake.com/question/cpp/matching-parens?course=fc1&section=queues-stacks
---

# Parenthesis validation

```cpp
size_t getClosingParen(const string& sentence, size_t openingParenIndex)
{
    stack<char> values;
    for(int i= openingParenIndex+1; i < sentence.length(); i++){
        if(sentence[i] ==')'){
            if(values.empty()){
                return i;
            }
            else{
                values.pop();
            }
        }
        else{
            if(sentence[i] == '('){
                values.push(sentence[i]);
            }
        }
    }
    
    throw "no matching index";
    
}



```

