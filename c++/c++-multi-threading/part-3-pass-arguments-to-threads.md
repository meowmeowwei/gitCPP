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

