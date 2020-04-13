---
description: 'https://thispointer.com//c11-multithreading-part-6-need-of-event-handling/'
---

# Part 5 Event Handling

when a thread needs to wait for a event to happen/ condition to become true

![](../../.gitbook/assets/image%20%28106%29.png)

Option 1 -&gt; do while loop in Thread 1 keep checking the variable, but will make application slow since it consumes cpu cycles .

[Option 2 -&gt; use condition\_variable to notify](https://thispointer.com//c11-multithreading-part-7-condition-variables-explained/)

**How things actually work with condition variable,**

* Thread 1 calls the wait on condition variable, which internally acquires the mutex and check if required condition is met or not.
* If not then it releases the lock and waits for Condition Variable to get signaled \( thread gets blocked\). Condition Variable’s wait\(\) function provides both these operations in atomic manner.
* Another Thread i.e. like Thread 2 signals the Condition Variable when condition is met
* Once Conditional Variable get signaled the the Thread 1 which was waiting for it resumes. It then acquires the mutex lock again and checks if the condition associated with Condition Variable is actually met or if it is superiors call. If more than one thread was waiting then notify\_one will unblock only one thread.
* If it was a superiors call then it again calls the wait\(\) function.

```cpp

#include <iostream>
#include <thread>
#include <vector>
#include <mutex>
#include <functional>
#include <condition_variable>

using namespace std;

class Application{
	mutex m_mutex;
	condition_variable m_condVar;
	bool m_dataLoaded;

public:
	Application(){
		m_dataLoaded = false;

	}

	void loadData(){
		this_thread::sleep_for(chrono::seconds(1));
		cout << "Loading Data from XML"<< endl;

		lock_guard<mutex> guard(m_mutex);

		m_dataLoaded = true;

		m_condVar.notify_one();
	}


	bool isDataLoaded(){
		return m_dataLoaded;
	}

	void mainTask(){
		cout << "Do some Handshaking "<< endl;

		unique_lock<mutex> mlock(m_mutex);

		m_condVar.wait(mlock, bind(&Application::isDataLoaded, this));
		cout << "Do processing on loaded data"<<endl;
	}
};



int main() {
 
  
  Application app;
  thread thread_1(&Application::mainTask, &app);
  thread thread_2(&Application::loadData, &app);

  thread_2.join();
  thread_1.join();



    return 0;
}


```

[why one method uses lock\_guard , another uses unique\_lock , whats the difference ?](http://jakascorner.com/blog/2016/02/lock_guard-and-unique_lock.html)

lock\_guard doesn't provide ability to unlock, once locked, it can only be released when the function finished.

unique\_lock can be unlocked if required . it is also forced to use unique\_lock in condition\_variable.

