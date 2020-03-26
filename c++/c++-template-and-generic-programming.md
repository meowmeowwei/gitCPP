# C++ template and generic programming

template programming deals with types are only known during compilation.

keyword -&gt; template and typename/class



![](../.gitbook/assets/image%20%28144%29.png)



**1\) Function Template**

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


// But you can add <> parameter there for compiler to determine

int main(){

   cout << "Hello World" << endl;

   cout << findMax <int> (3, 5) << endl;

   cout << findMax <double> (16.5, 10) << endl;

}


```

**2\) Class Template**

```cpp
#include <iostream>
using namespace std;


template <class X>
class Array {
private:
	X *ptr;
	int size;

public:
	Array(X arr[], int s);
	void print();
};

template <class X> Array<X>::Array(X arr[], int s){
	ptr = new X[s];
	size = s;

	for(int i = 0; i < size; i++){
		ptr[i] = arr[i];
	}
}

template <class X> void Array<X>::print(){
	for(int i =0; i < size; i ++){
		cout << *(ptr +i) << endl;
	}
}

int main(){
	int arr[5] ={1,2,3,4,5};
	Array <int> a(arr, 5);
	a.print();
}

```

**3\) default value for template argument**

```cpp
#include<iostream> 
using namespace std; 
  
template<class T, class U = char> 
class A  { 
public: 
    T x; 
    U y; 
    A() {   cout<<"Constructor Called"<<endl;   } 
}; 
  
int main()  { 
   A<char> a;  // This will call A<char, char>    
   return 0; 
}
```

**4\) function loading vs function templates**

overloading -&gt; multiple functions do similar operations

template -&gt; multiple functions do identical things

**5\) what happens when there's static member in a template class/functions**

each instance of template will contain its own static variable

```cpp
using namespace std; 
  
template <typename T> 
void fun(const T& x) 
{ 
  static int i = 10; 
  cout << ++i; 
  return; 
} 
  
int main() 
{     
  fun<int>(1);  // prints 11 
  cout << endl; 
  fun<int>(2);  // prints 12 
  cout << endl; 
  fun<double>(1.1); // prints 11 
  cout << endl; 
  getchar(); 
  return 0; 
} 

```







