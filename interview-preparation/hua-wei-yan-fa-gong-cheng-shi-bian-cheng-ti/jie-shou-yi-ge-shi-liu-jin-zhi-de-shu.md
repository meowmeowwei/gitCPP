# 接受一个十六进制的数

写出一个程序，接受一个十六进制的数，输出该数值的十进制表示。（多组同时输入 ）

```cpp
#include <iostream>
using namespace std;

int main(){

    int a;
    
    while(cin >> hex >> a){
        cout << a <<endl;
    }

}

```

