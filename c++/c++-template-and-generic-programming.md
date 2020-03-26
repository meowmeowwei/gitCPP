# C++ template and generic programming

template programming deals with types are only known during compilation.

keyword -&gt; template and typename/class



![](../.gitbook/assets/image%20%28144%29.png)

```cpp

// note whatever is the input, needs to match the parameters or else will have
// compilation error 


template <class T>
T findMax(T x, T y){
	return (x > y) ? x : y;
}


int main(){

   cout << "Hello World" << endl;

   cout << findMax (3, 5) << endl;

   cout << findMax (16.5, 10) << endl;

}
```

