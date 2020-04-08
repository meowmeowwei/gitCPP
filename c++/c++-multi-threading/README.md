---
description: >-
  https://thispointer.com/c-11-multithreading-part-1-three-different-ways-to-create-threads/
---

# C++ Multi-Threading

{% embed url="https://hackernoon.com/learn-c-multi-threading-in-5-minutes-8b881c92941f" %}



[Threads can be created using 3 ways](https://thispointer.com/c-11-multithreading-part-1-three-different-ways-to-create-threads/)

1\) with a function pointer

```cpp


void thread_function(){

	int count =0;
	for(int i=0; i <1000; i ++){
		
		cout << "thread_function executing" << endl;
		count ++;
	}

	cout << "count is "<< count << endl;
}


int main(){

	thread threadObj(thread_function);
	
	for(int i = 0; i < 1000;i ++){
		cout << "main thread displaying "<< endl;
	}

	threadObj.join();
	cout << "Exiting main program" << endl;
	

}

```

3\) with a lambda function 



