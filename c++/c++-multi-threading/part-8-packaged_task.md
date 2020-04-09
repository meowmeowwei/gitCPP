# Part 8 - packaged\_task



### std::packaged\_task&lt;&gt;

**std::packaged\_task&lt;&gt;** is a class template and represents a asynchronous task. It encapsulates,

1. A callable entity i.e either function, lambda function or function object.
2. A shared state that stores the value returned or thrown exception by associated callback.

```cpp


#include <iostream>
#include <thread>
#include <future>
#include <string>
 
// Fetch some data from DB
std::string getDataFromDB( std::string token)
{
	// Do some stuff to fetch the data
	std::string data = "Data fetched from DB by Filter :: " + token;
	return data;
}
 
int main()
{
 
	// Create a packaged_task<> that encapsulated the callback i.e. a function
	std::packaged_task<std::string (std::string)> task(getDataFromDB);
 
	// Fetch the associated future<> from packaged_task<>
	std::future<std::string> result = task.get_future();
 
	// Pass the packaged_task to thread to run asynchronously
	std::thread th(std::move(task), "Arg");
 
	// Join the thread. Its blocking and returns when thread is finished.
	th.join();
 
	// Fetch the result of packaged_task<> i.e. value returned by getDataFromDB()
	std::string data =  result.get();
 
	std::cout <<  data << std::endl;
 
	return 0;
}

```

