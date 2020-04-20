# Tutorial 1

Animal Program

remember how to use friend class function 

```cpp

#include <iostream>
#include <string>
using namespace std;


class Animal {
/* TODO: Implement data and functionality of an Animal here */
private:
	string name;
	string sound;

	friend class Song;

public:
	Animal(string nameA, string soundA) : name{nameA}, sound{soundA}{

	}
};

class Song {
private:
 Animal** _animals;
const int _size;
public:
 Song() : _size(2){ /* TODO: Create your zoo, an Animal* array */

 	_animals = new Animal * [_size];
 	_animals[0] = new Animal("Dog", "woof");
 	_animals[1] = new Animal("Cat", "meow");
	}
  //friend class Animal; 	
 ~Song() { /* TODO: Cleanup the 5 animals and the array... */ }
 void display() {
  for (int i = 0; i < _size; i++)
       cout << _animals[i]->name << " "<< _animals[i]->sound<<endl; /* TODO: Add the lyrics here... */
 }
};

int main() {
 Song song;
 song.display();
 return 0;
}
```

