# Part 1 - Creating Threads



[Threads can be created using 3 ways](https://thispointer.com/c-11-multithreading-part-1-three-different-ways-to-create-threads/)

Task -&gt; a computation that can be executed concurrently with other computation.

thead will taking a parameter of task. 

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

function object parsing with parameter 

```cpp
class DisplayThread{
public:

	int x ;

	DisplayThread(int y) : x{y}{

	}

	void operator ()() {

		for (int i =0; i < x; i ++){
			cout << " Displaying from Thread" << endl;
		}

	}
};


int main(){

	DisplayThread * t = new DisplayThread(1000);

	thread threadObj(*t);
	for(int i = 0; i < 1000;i ++){
		cout << "main thread displaying "<< endl;
	}

	threadObj.join();
	cout << "Exiting main program" << endl;


}

```



2\) with a function object / functor 

```cpp
class DisplayThread{
public:
	void operator ()() {

		for (int i =0; i < 1000; i ++){
			cout << " Displaying from Thread" << endl;
		}

	}
};


int main(){

	DisplayThread * t = new DisplayThread();

	thread threadObj(*t);
	for(int i = 0; i < 1000;i ++){
		cout << "main thread displaying "<< endl;
	}

	threadObj.join();
	cout << "Exiting main program" << endl;

}

```

3\) with a lambda function 

```cpp
int main(){


	thread threadObj([]{
		for (int i =0; i < 1000; i ++){
			cout << " Displaying from Thread" << endl;
		}
	});
	for(int i = 0; i < 1000;i ++){
		cout << "main thread displaying "<< endl;
	}

	threadObj.join();
	cout << "Exiting main program" << endl;


}

```



