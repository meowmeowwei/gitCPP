---
description: 'https://www.modernescpp.com/index.php/std-weak-ptr'
---

# Weak\_ptr

Can be used to break circular reference 

![](../../.gitbook/assets/image%20%28141%29.png)

```cpp
// cycle.cpp

#include <iostream>
#include <memory>

struct Son;
struct Daughter;

struct Mother{
  ~Mother(){
    std::cout << "Mother gone" << std::endl;
  }
  void setSon(const std::shared_ptr<Son> s ){
    mySon=s;
  }
  void setDaughter(const std::shared_ptr<Daughter> d ){
    myDaughter=d;
  }
  std::shared_ptr<const Son> mySon;
  std::weak_ptr<const Daughter> myDaughter;
};

struct Son{
  Son(std::shared_ptr<Mother> m):myMother(m){}
  ~Son(){
    std::cout << "Son gone" << std::endl;
  }
  std::shared_ptr<const Mother> myMother;
};

struct Daughter{
  Daughter(std::shared_ptr<Mother> m):myMother(m){}
  ~Daughter(){
    std::cout << "Daughter gone" << std::endl;
  }
  std::shared_ptr<const Mother> myMother;
};

int main(){
  std::cout << std::endl;
  {
    std::shared_ptr<Mother> mother= std::shared_ptr<Mother>( new Mother);
    std::shared_ptr<Son> son= std::shared_ptr<Son>( new Son(mother) );
    std::shared_ptr<Daughter> daughter= std::shared_ptr<Daughter>( new Daughter(mother) );
    mother->setSon(son);
    mother->setDaughter(daughter);
  }
  std::cout << std::endl;
}
```

Thanks to the artificial scope in line 41 - 47, the lifetime of the mother, the son, and the daughter is limited. Or to say it the other way around. Mother, son, and daughter go out of scope and therefore the destructor of the class Mother \(line 10 - 12\), Son \(line 25 - 27\), and Daughter \(line 33 - 35\) should automatically be invoked.

Should, because only the destructor of the class Daughter is called.  


![](../../.gitbook/assets/image%20%2860%29.png)

