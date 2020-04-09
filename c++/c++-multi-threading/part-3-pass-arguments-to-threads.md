---
description: >-
  https://thispointer.com//c11-multithreading-part-3-carefully-pass-arguments-to-threads/
---

# Part 3 - Pass Arguments to Threads

passing argument into thread with variables

```cpp
void thread_with_argument(int x, int y){
	cout << "x " << x << endl;
	cout << "y " << y << endl;
}



int main(){


	thread threadObj(thread_with_argument, 12, 13);

	if(threadObj.joinable())
		threadObj.join();
	cout << "Exiting main program" << endl;


}


```

how to pass reference to thread , dont use & , it will only be treated as a reference to temp value copied at the new thread's stack

```cpp
void thread_with_argument(int & x, int &  y){
	cout << "x " <<  x ++  << endl;
	cout << "y " <<  y ++  << endl;

}



int main(){

	int x = 11;
	int y = 11;

	thread threadObj(thread_with_argument, ref(x), ref(y));

	if(threadObj.joinable())
		threadObj.join();


	cout << "x after "<< x << endl;
	cout << "y after "<< y << endl;

	cout << "Exiting main program" << endl;

}




```

assigning pointer to member function of a class as thread function 

```cpp

#include <iostream>
#include <thread>
class DummyClass {
public:
    DummyClass()
    {}
    DummyClass(const DummyClass & obj)
    {}
    void sampleMemberFunction(int x)
    {
        std::cout<<"Inside sampleMemberFunction "<<x<<std::endl;
    }
};
int main() {
 
    DummyClass dummyObj;
    int x = 10;
    std::thread threadObj(&DummyClass::sampleMemberFunction,&dummyObj, x);
    threadObj.join();
    return 0;
}


```

