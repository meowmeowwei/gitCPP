# week 1 - c++ refreshment

1\) template 

```cpp

template <class T> 
T maximum (const T & left, const T & right){
  return left > right ? left : right;
}


template <class T> 
class Pair{
  T first;
  T second;

public:
  Pair(const T & x, const T & y):first(x), second(y){

  };

  T getFirst(){return first;};

  T getSecond(){return second;};

};

int main()
{

  cout << maximum <double> ( 3.15 , 2.9) << endl;

  Pair<int> value = {1, 3}; // for class it's mandatory to state parameter
  cout << value.getFirst()<<endl;
  cout << value.getSecond()<<endl;
}
```

2\) String and StringStream

```cpp
#include <iostream>
#include <sstream>
using namespace std;



int main()
{
  
  istringstream instr {"Hello sun wei"};

  string x, y, z;

  instr >> x;
  instr >> y;
  instr >> z;

  cout << x << endl;
  cout << y << endl;
  cout << z << endl;

  ostringstream outstr;

  outstr << x << y << z <<endl;
  string j = outstr.str();

  cout << j << endl;
  
  return 0;
}

```

3\) STL \(iterator invalidation\)

```cpp

#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;



int main()
{
 
 //vector <int> v (10, 5);

 //for_each(v.begin(), v.end() , [](int i)->void {std::cout << i <<endl;});


 vector<int> v2;

 for(int i=0; i < 5; i ++){
  v2.push_back(i);
 }

 vector<int> ::iterator myIter = v2.begin();
 cout<<v2.capacity()<<endl; //because capacity is 8, so the vector has not re-allocated 

 v2.insert(myIter, 123);

 cout << *myIter<<endl; // here the value is invalidated, instead of having 0, it's now having 100 as the value
 //for cases like forward list which uses linked list, iterator is not invalidated 


 vector < int> v {1,2,3,4,5,6,7};
 cout<< v.capacity()<<endl;
 auto it = v.begin() ;

 v.insert(it, 100);
 cout << *it <<endl; //here, whole vector is re-allocated... so the value is invalidated, it might still be pointing to the old memory location of vector.

  
  return 0;
}
```

4\) FileStream 

```cpp
#include <iostream>
#include <fstream>
#include <string>
using namespace std;


int main()
{

  ifstream readFile("cpp_template.cpp");
  ofstream writeFile("cpp_fileStream_output.txt");
  string readLine;

  while(getline(readFile, readLine)){
    cout << readLine<<endl;
    writeFile<<readLine<<endl;
  }

  readFile.close();
  writeFile.close();
  
  return 0;
}

```

