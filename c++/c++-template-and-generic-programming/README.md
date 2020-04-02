---
description: 'https://www.geeksforgeeks.org/templates-cpp/'
---

# C++ template and generic programming

template programming deals with types are only known during compilation.

keyword -&gt; template and typename/class



![](../../.gitbook/assets/image%20%28152%29.png)

Template compilation-&gt;  compiler does not generate code when it sees the definition, it generates only when we instantiate a specific instance of the template. 



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

**6\) Template Specialisation**

 to have specific implementation for certain type of parameter class

```cpp

#include <iostream> 
using namespace std; 
  
template <class T> 
void fun(T a) 
{ 
   cout << "The main template fun(): " 
        << a << endl; 
} 
  
template<> 
void fun(int a) 
{ 
    cout << "Specialized Template for int type: "
         << a << endl; 
} 
  
int main() 
{ 
    fun<char>('a'); 
    fun<int>(10); 
    fun<float>(10.14); 
} 

```

**7\) Can we pass nontype parameters to templates?**

you can , but the value needs to be a const and be able to be processed at compile time

```cpp

#include <iostream> 
using namespace std; 
   
template <class T, int max> 
int arrMin(T arr[], int n) 
{ 
   int m = max; 
   for (int i = 0; i < n; i++) 
      if (arr[i] < m) 
         m = arr[i]; 
   
   return m; 
} 
   
int main() 
{ 
   int arr1[]  = {10, 20, 15, 12}; 
   int n1 = sizeof(arr1)/sizeof(arr1[0]); 
   
   char arr2[] = {1, 2, 3}; 
   int n2 = sizeof(arr2)/sizeof(arr2[0]); 
   
   // Second template parameter to arrMin must be a constant 
   cout << arrMin<int, 10000>(arr1, n1) << endl; 
   cout << arrMin<char, 256>(arr2, n2); 
   return 0; 
} 

```



