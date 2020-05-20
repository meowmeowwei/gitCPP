# Validation 2

```cpp


bool isValid(const string& code)
{
    stack<char> st;
    for(int i=0; i < code.length(); i++){
        switch(code[i]){
            case '(':
                st.push('(');
                break;
            case '{':
                st.push('{');
                break;
            case '[':
                st.push('[');
                break;
            case ')':
                if(st.top()!='('){
                    return false;
                }
                else{
                    st.pop();
                }
                break;
             case ']':
                if(st.top()!='['){
                    return false;
                }
                else{
                    st.pop();
                }
                break;             
            case '}':
                if(st.top()!='{'){
                    return false;
                }
                else{
                    st.pop();
                }
                break;
            
        }
    }
    
    if(!st.empty())
        return false;

    return true;;
}



















```

