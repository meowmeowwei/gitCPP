---
description: 'https://en.wikipedia.org/wiki/C%2B%2B11'
---

# C++ 11 - Rvalue and Lvalue

**Rvalue reference and move constructors**

before c++11, rvalues \(temporary and short lived, while lvalues exist longer since they exist as variable\)

Rvalue reference -&gt; a new non-const reference type identified by T&&

\*\*\*\*[**Some Background about Lvalue and Rvalue** ](https://www.internalpointers.com/post/understanding-meaning-lvalues-and-rvalues-c)\*\*\*\*

```cpp
int y;
666 = y; // will throw error since 666 is a constant , it can only be Rvalue
int x = &y ; this is fine because & to LValue will generate RValue;


//Example 2

void fnc(int & x){
}

int main(){

    fnc(10); // Nope ! because 10 is a temporary RValue, cant not directly become reference
    //This works instead
    // int x = 10;
    // fnc(x);
}

// but you can resovle above issue with const lvalue 

const int& ref = 10; // this is okay
// literal 10 is volate and world expire in no time, but a constant reference
// will make sure the value it points to cant be modified 



```



why do we need it ?   --&gt;  refer to this [good reference ](https://www.internalpointers.com/post/c-rvalue-references-and-move-semantics-beginners)here 

in below case, temporary vector is created and it can be stored only be creating a new vector and copying all the rvalues's data into it. Then the temporary and all its memory is destroyed. 

```cpp
vector<int> returnVec (){
}

vector<int> vec = returnVec();

```



Path the way of doing move 

```cpp
  std::string   s1     = "Hello ";
  std::string   s2     = "world";
  std::string&& s_rref = s1 + s2;    // the result of s1 + s2 is an rvalue
  s_rref += ", my friend";           // I can change the temporary string!
  std::cout << s_rref << '\n';       // prints "Hello world, my friend"
```

Existing issue of initialising a class object

```cpp
class Holder
{
  public:

    Holder(int size)         // Constructor
    {
      m_data = new int[size];
      m_size = size;
    }

    ~Holder()                // Destructor
    {
      delete[] m_data;
    }

  private:

    int*   m_data;
    size_t m_size;
};


// if we do following action, the compiler will have create a temporary RValue

Holder createHolder(int size)
{
  return Holder(size);
}


int main()
{
  Holder h = createHolder(1000); 
  // the copy constructor will again incur cost of initializing and copying
}
```



By using RValue Reference, we can use it to create **Move Constructor** and **Move Assignment** Operator 

```cpp
//Move Constructor 
Holder(Holder&& other)     // <-- rvalue reference in input
{
  m_data = other.m_data;   // (1)
  m_size = other.m_size;
  other.m_data = nullptr;  // (2)
  other.m_size = 0;
}

//Move assignment
Holder& operator=(Holder&& other)     // <-- rvalue reference in input  
{  
  if (this == &other) return *this;

  delete[] m_data;         // (1)

  m_data = other.m_data;   // (2)
  m_size = other.m_size;

  other.m_data = nullptr;  // (3)
  other.m_size = 0;

  return *this;
}


// Now we can do following

int main()
{
  Holder h1(1000);                // regular constructor
  Holder h2(h1);                  // copy constructor (lvalue in input)
  Holder h3 = createHolder(2000); // move constructor (rvalue in input) (1) 

  h2 = h3;                        // assignment operator (lvalue in input)
  h2 = createHolder(500);         // move assignment operator (rvalue in input)
}

```

