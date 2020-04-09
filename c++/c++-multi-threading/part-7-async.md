---
description: 'https://thispointer.com/c11-multithreading-part-9-stdasync-tutorial-example/'
---

# Part 7 - async

### what is std::async\(\)

**std::async\(\)** is a function template that accepts a callback\(i.e. function or function object\) as an argument and potentially executes them asynchronously.

| 12 | template &lt;class Fn, class... Args&gt;future&lt;typename result\_of&lt;Fn\(Args...\)&gt;::type&gt; async \(launch policy, Fn&& fn, Args&&... args\); |
| :--- | :--- |


**std::async** returns a **std::future&lt;T&gt;,** that stores the value returned by function object executed by **std::async\(\)**. Arguments expected by function can be passed to std::async\(\) as arguments after the function pointer argument.

```cpp

#include <iostream>
#include <string>
#include <chrono>
#include <thread>
#include <future>
using namespace std::chrono;
std::string fetchDataFromDB(std::string recvdData)
{
// Make sure that function takes 5 seconds to complete
std::this_thread::sleep_for(seconds(5));
//Do stuff like creating DB Connection and fetching Data
return "DB_" + recvdData;
}
std::string fetchDataFromFile(std::string recvdData)
{
// Make sure that function takes 5 seconds to complete
std::this_thread::sleep_for(seconds(5));
//Do stuff like fetching Data File
return "File_" + recvdData;
}
int main()
{
// Get Start Time
system_clock::time_point start = system_clock::now();
std::future<std::string> resultFromDB = std::async(std::launch::async, fetchDataFromDB, "Data");
//Fetch Data from File
std::string fileData = fetchDataFromFile("Data");
//Fetch Data from DB
// Will block till data is available in future<std::string> object.
std::string dbData = resultFromDB.get();
// Get End Time
auto end = system_clock::now();
auto diff = duration_cast < std::chrono::seconds > (end - start).count();
std::cout << "Total Time Taken = " << diff << " Seconds" << std::endl;
//Combine The Data
std::string data = dbData + " :: " + fileData;
//Printing the combined Data
std::cout << "Data = " << data << std::endl;
return 0;
}

```

