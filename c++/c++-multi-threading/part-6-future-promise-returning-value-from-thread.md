---
description: >-
  https://thispointer.com//c11-multithreading-part-8-stdfuture-stdpromise-and-returning-values-from-thread/
---

# Part 6 future/promise/returning value from thread

**std::future** is a class template and its object stores the future value.  
Now what the hell is this future value.

Actually a **std::future** object internally stores a value that will be assigned in future and it also provides a mechanism to access that value i.e. using get\(\) member function. But if somebody tries to access this associated value of future through get\(\) function before it is available, then get\(\) function will block till value is not available.

**std::promise** is also a class template and its object promises to set the value in future. Each std::promise object has an associated std::future object that will give the value once set by the std::promise object.

A **std::promise** object shares data with its associated **std::future** object.

![](../../.gitbook/assets/image%20%2856%29.png)

```cpp

#include <iostream>
#include <thread>
#include <future>

using namespace std;


void initializer(promise<int> * promObj){
	cout << "Inside thread" <<endl;
	this_thread::sleep_for(chrono::seconds(5));
	promObj->set_value(35);
}



int main() {
 
  
  promise<int> promiseObj;
  future<int> futureObj = promiseObj.get_future();
  thread th(initializer, &promiseObj);
  cout<< futureObj.get() << endl;
  th.join();


    return 0;
}



```

