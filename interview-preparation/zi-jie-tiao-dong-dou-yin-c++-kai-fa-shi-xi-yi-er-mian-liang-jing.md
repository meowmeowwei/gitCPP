# 字节跳动-抖音C++开发实习一二面凉经

作者：小闸蟹  
链接：[https://www.nowcoder.com/discuss/342523?type=all&order=time&pos=&page=1](https://www.nowcoder.com/discuss/342523?type=all&order=time&pos=&page=1)  
来源：牛客网  
  
一面： 

**longest substring with no duplicate**   


```cpp
//leetcode question 3 , longest substring 

1) Brute force style 

// for each possible combination, do checking for unique values 
// Time Complexity O(n^3)
// Space Complexity O(min(n.m))

class Solution {
public:
    
    bool allUnique (string s, int start, int end){
        set<char> valueSet;
        for(int i= start; i < end; i++){
            if(valueSet.find(s[i])!= valueSet.end()){
                return false;
            }
            else{
                valueSet.insert(s[i]);
            }
        }
        return true;
    }
    
    
    int lengthOfLongestSubstring(string s) {
        int ans = 0;
        for(int i=0; i< s.size(); i++){
            for(int j = i+1; j < s.size() +1; j++){
                if(allUnique(s, i, j)){
                    ans = max(ans, j-i);
                }
            }
        }
        return ans;
    }
};



2) Sliding window

//Time complexity O(2n)

class Solution {
public:
    
    
    int lengthOfLongestSubstring(string s) {
        int ans=0, i=0, j = 0;
        
        int n = s.size();
        
        set<char> setValues ;
        
        while (i < n && j <n){
            if(setValues.find(s[j]) == setValues.end()){
                setValues.insert(s[j++]);
                ans = max(ans, j-i);
            }
            else{
                setValues.erase(s[i++]);
            }
        }
        return ans;
        
    }
};
```



 **std::unordered\_map vs std::map difference** 

```text
unorded_map 
-> internally implememented using HashTable, key is hashed into a bucket
-> time complexity is about O(1)

map 
-> like a set, implemented using balanced tree
-> time complexity is O(LogN)

```



  
 **对智能指针有多少了解？explain smart pointers** 

```text
1)provides automatic memory management

2)when smart pointers goes out of the scope, its destructor gets triggered and memory
cleanup is performed.

3)RAII (resource acquision is initialization): class wrapped around a dynamic resource
that gets properly deleted/closed in its destructor.

type of smart pointers 

a. unique_ptr
b. shared_ptr
c. weak_ptr

```

  
 **std::weak\_ptr如何转std::shared\_ptr**

```text
std::shared_ptr<int> p_shared = std::make_shared<int>(100);
std::weak_ptr<int> p_weak(p_shared);

//use the lock 
std::shared_ptr<int> p_shared = p_weak.lock();

```

  
 **std::weak\_ptr::lock存在的意义是什么**

```text
weak pointer is like an inspector on the shared_ptr, you have to convert it to 
a shared pointer wwith lock() to get hold of the object 

it can resolve the issue with dangling pointer in cirular reference.

lock -> returns a shared_ptr with information preserved by the weak_ptr if it is 
not expired.

if the weak pointer has expired, the function returns an empty shared_ptr.

it locks the owned pointer, preventing it from being released.

```

**why do you need make\_unique and make\_shared**

```text
1) get rid of new/delete

2) makes code safe against exceptions

void function(std::unique_ptr<A>(new A()), std::unique_ptr<B>(new B())) { ... }

vs

void function(std::make_unique<A>(), std::make_unique<B>()) { ... }

in the 2nd case, when B failed, A will be released as temporary object also.
```

  
 C++各种虚函数、重载，看代码写输出  


 **实现\#define max\(a, b, c\)**

```text
define macro is to replace method with actual replacement 

e.g.

#define max(a, b, c)(max(max (a,b), max(b,c)))

int main(){
    cout << max(50, 40, 30);
}
```

  
 对3D有什么了解  
 还有什么要问的吗？  
  
 二面： 你最自豪的事情是什么  
 你的优点是什么  
 有什么值得分享的经历吗  
 如何测试你的项目的  
 如何保证你的项目质量  
 对方满意你的进度吗  
 你自己实现的字符串类支持宽字符吗，实现了多少函数，满足工程需要吗 你说你喜欢研究STL和Qt，为什么呢 你说你喜欢了解C++的新特性，但是不可能组里每个人都因为你使用新特性而更换编译器版本，为什么还要拼命追求那么多新特性呢  
 析构函数可以是纯虚函数吗  


 **内存池了解过吗，为什么要有内存池**

```text
object is taken from pool to save cost of initializing a class instance 

```

  
**what is C++ memory fragmentation and how to handle it** 

```text
when most of your memory is allocated in a large number of none-contiguous blocks
or chunks - leaving a good percentage of your total memory unallocated, but unusable
for most typical scenarios. 

if you tend to get a lot of allcoation errors, especially when percentage of memory
is high, but you havent used up all memory then you may have encountered it.

use a good algorithm to allocate memory, instaed of allocated memory for a lot of 
small objects. pre-allocate memory for a contiguous array of those smaller objects.


```



**what is Heap and Stack**

```text
memory a program uses is divided into different areas called segments
1) code segment, read only compiled program
2) bss segment, uninitialized data segment
3) data segment, initialized date segment
4) heap, where dynamically allocated variables are allocated 
5) call stack, function parameters, local variables and other function related 
information are stared. 

```

 **C++反射有了解过吗，标准有吗，第三方库呢，说说看**

```text
introspection -> ability to inspect the code in the system and see object types.
reflection -> is th ability to make modifications at runtime by making use of 
introspection.

For example, say you have an object of an unknown type in Java, and you would like to call a 'doSomething' method on it if one exists. Java's static typing system isn't really designed to support this unless the object conforms to a known interface, but using reflection, your code can look at the object and find out if it has a method called 'doSomething' and then call it if you want to.
So, to give you a code example of this in Java (imagine the object in question is foo) :
Method method = foo.getClass().getMethod("doSomething", null);method.invoke(foo, null);
One very common use case in Java is the usage with annotations. JUnit 4, for example, will use reflection to look through your classes for methods tagged with the @Test annotation, and will then call them when running the unit test.
 

```



**What is difference between RTTI and Reflection ?**

```text
Static Type / String Type -> type of every object checked at compile time 
Dynamic Type / Weak Type -> violation only detected at runtime

RTTI -> safely bypassing typing 
e.g. 
C++ : dynamic_cast and typeid
Java : casting and instanceOf

Reflection -> 

library and runtime support for creating class instance and arrays , accessing
and modify fields of objects, classes and elements of arrays
```

{% embed url="https://www.cse.huji.ac.il/course/2004/ood/docs/lec08.pdf" %}

**what is command pattern ?**

```text
behavior design pattern, object is used to encapsulate all information needed 
to perform an action or trigger an event at a later time. 

#include <iostream>

using namespace std;

/*the Command interface*/
class Command 
{
public:
	virtual void execute()=0;
};

/*Receiver class*/
class Light {

public:
	Light() {  }

	void turnOn() 
	{
		cout << "The light is on" << endl;
	}

	void turnOff() 
	{
		cout << "The light is off" << endl;
	}
};

/*the Command for turning on the light*/
class FlipUpCommand: public Command 
{
public:

	FlipUpCommand(Light& light):theLight(light)
	{

	}

	virtual void execute()
	{
		theLight.turnOn();
	}

private:
	Light& theLight;
};

/*the Command for turning off the light*/
class FlipDownCommand: public Command
{
public:   
	FlipDownCommand(Light& light) :theLight(light)
	{

	}
	virtual void execute() 
	{
		theLight.turnOff();
	}
private:
	Light& theLight;
};

class Switch {
public:
	Switch(Command& flipUpCmd, Command& flipDownCmd)
	:flipUpCommand(flipUpCmd),flipDownCommand(flipDownCmd)
	{

	}

	void flipUp()
	{
		flipUpCommand.execute();
	}

	void flipDown()
	{
		flipDownCommand.execute();
	}

private:
	Command& flipUpCommand;
	Command& flipDownCommand;
};

 
/*The test class or client*/
int main() 
{
	Light lamp;
	FlipUpCommand switchUp(lamp);
	FlipDownCommand switchDown(lamp);

	Switch s(switchUp, switchDown);
	s.flipUp();
	s.flipDown();
}

```

**what is factory patten** 

```text
for different type of objects, they implements same object interface

when trying to create the objects, based on the input string name, create the object


 class ComputerFactory
 {
 public:
     static Computer *NewComputer(const std::string &description)
     {
         if(description == "laptop")
             return new Laptop;
         if(description == "desktop")
             return new Desktop;
         return nullptr;
     }
 };
```

**QuickSort implementation** 

```text

int partition (int * a, int low, int high){
int p = a[low];int m = low;for(int k= low+1; k<= high; k++){    if(a[k] <p){        m++;        swap(a[k], a[m]);    }    else{    }}swap(a[low], a[m]);return m; 
}
void quickSort(int * a, int low, int high){
//keep finding a pivot point and do recursive sort for each partitionif(low < high){    int pivotIdx = partition (a, low, high);    quickSort(a, low, pivotIdx -1);    quickSort(a, pivotIdx+1, high);}
}
```







```text


 不允许分发实际代码让对方修改，但是对方想添加新功能，如何实现，有什么模式可以做到吗

 如何选择基准数
 随机选择基准数万一每次都选到了最坏的情况呢，如何处理？如何确保时间复杂度
 为什么快排时序列长度短的情况下会选择其他排序，优点在哪
 如何处理快速排序最坏的情况
 还有什么问题要问吗
```

