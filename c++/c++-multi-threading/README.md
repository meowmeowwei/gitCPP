---
description: >-
  https://thispointer.com/c-11-multithreading-part-1-three-different-ways-to-create-threads/
---

# C++ Multi-Threading

{% embed url="https://hackernoon.com/learn-c-multi-threading-in-5-minutes-8b881c92941f" %}

[Joining and Detaching Threads](https://thispointer.com//c11-multithreading-part-2-joining-and-detaching-threads/)

need to remember to detach a thread if exception happens 

```cpp

#include <iostream>
#include <thread>
class ThreadRAII
{
    std::thread & m_thread;
    public:
        ThreadRAII(std::thread  & threadObj) : m_thread(threadObj)
        {
            
        }
        ~ThreadRAII()
        {
            // Check if thread is joinable then detach the thread
            if(m_thread.joinable())
            {
                m_thread.detach();
            }
        }
};

```

