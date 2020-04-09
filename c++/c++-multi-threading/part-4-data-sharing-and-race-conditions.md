---
description: >-
  https://thispointer.com//c11-multithreading-part-4-data-sharing-and-race-conditions/
---

# Part 4 - Data Sharing and Race Conditions

if no lock on the object, the outcome will be very unpredictable 

```cpp
#include <iostream>
#include <thread>
#include <vector>

using namespace std;

class Wallet{
private:
	int money;
public:
	Wallet(): money(0){}

	int getMoney(){
		return money;
	}

	void addMoney(int m){
		for(int i=0; i < m; i++){
			money++;
		}
	}
};



int main() {
 
    Wallet w ;

    vector<thread> threads;

    for(int i=0; i <5; i++){
    	threads.push_back(thread(&Wallet::addMoney, &w, 1000));
    }

    for (int i=0; i < threads.size(); i++){
    	threads[i].join();
    }

    cout << "total money " << w.getMoney() << endl;


    return 0;
}


```

[use mutex to resolve the issue ](https://thispointer.com//c11-multithreading-part-5-using-mutex-to-fix-race-conditions/)

```cpp
class Wallet{
private:
	int money;
	mutex mut;
public:
	Wallet(): money(0){}

	int getMoney(){
		return money;
	}

	void addMoney(int m){
		mut.lock();
		for(int i=0; i < m; i++){
			money++;
		}
		mut.unlock(); // if you dont unlock will have issue 
	}
};
```

use lock\_guard which implements RAII for mutex

```cpp
	void addMoney(int m){
		lock_guard<mutex> lockGuard(mut); // RAII
		for(int i=0; i < m; i++){
			money++;
		}
		
	}

```

Scope\_lock can be used to lock multiple mutex

```cpp

void f(){

    scoped_lock lck {mutex1, mutex2};

}


```

