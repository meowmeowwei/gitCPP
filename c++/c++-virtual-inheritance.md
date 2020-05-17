---
description: 'https://www.interviewcake.com/cpp-interview-questions'
---

# C++ virtual inheritance

Diamond Problem



But, when we compile it, we get this error message:

```text
  $ g++ ligers.cpp
error: non-static member 'eat' found in multiple
base-class sub-objects of type 'Mammal':
class Liger -> class Tiger -> class Mammal
class Liger -> class Lion -> class Mammal
Lyle.eat();
```

C++

What's happening here?

The compiler is complaining that the Liger class has two versions of the eat method—one from the Tiger class \(which inherited it from the Mammal class\) and one from the Lion class \(which also inherited it from the Mammal class\). So, the compiler sees two different eat methods, and it doesn't know which version it should use for Ligers.

This happens because C++ doesn't recognize that the Lion and Tiger classes are inheriting from the same Mammal class. What it sees instead is something like this:

![A liger class pointing up to a Tiger class on the left and a Lion class on the right. The Tiger and Lion classes both point up to separate copies of the Mammal class, breaking the diamond shape.](https://www.interviewcake.com/images/svgs/cplusplus_questions_inheritance_non_diamond.svg?bust=205)

We can ensure that the compiler inherits the same Mammal class into the Lion and Tiger classes with the virtual keyword, like this:





```text
  class Tiger : virtual public Mammal
{
public:
    void groom();
};

class Lion : virtual public Mammal
{
public:
    void groom();
};
```

C++

When a base class is **virtually inherited**, the C++ compiler makes sure that this class is created only once. That means that all subclasses, like Lion and Tiger, will lead back to the same Mammal base class, giving us the diamond structure we've wanted all along.

