---
description: 'https://en.wikipedia.org/wiki/Passive_data_structure'
---

# C++ Plain Old data

data structure that is represented only as passive collection of fields values , without using object-oriented features. 



### Rationale

Passive data structures are appropriate when there is a part of a system where it should be clearly indicated that the detailed logic for data manipulation and integrity are elsewhere. PDSs are often found at the boundaries of a system, where information is being moved to and from other systems or persistent storage and the problem domain logic that is found in other parts of the system is irrelevant. For example, PDS would be convenient for representing the field values of objects that are being constructed from external data, in a part of the system where the semantic checks and interpretations needed for valid objects are not applied yet.



**C++**

defined as a scalar type of a PDS class. no user-defined copy assignment operator , no user defined destructor and no non-static data members that are not themselves PDS. 



Moreover, a PDS class must be an aggregate, meaning it has no user-declared constructors, no private nor protected non-static data, no virtual base classes[\[a\]](https://en.wikipedia.org/wiki/Passive_data_structure#cite_note-4) and no virtual functions.[\[4\]](https://en.wikipedia.org/wiki/Passive_data_structure#cite_note-5) The standard includes statements about how PDS must behave in C++. The type\_traits library in the [C++ Standard Library](https://en.wikipedia.org/wiki/C%2B%2B_Standard_Library) provides a template named is\_pod that can be used to determine whether a given type is a POD.[\[5\]](https://en.wikipedia.org/wiki/Passive_data_structure#cite_note-6) In C++20 the notion of “plain old data” \(POD\) and by that is\_pod is deprecated and replaced with the concept of “trivial” and “standard-layout” types.[\[6\]](https://en.wikipedia.org/wiki/Passive_data_structure#cite_note-7)

In some contexts, C++ allows only PDS types to be used. For example, a union in C++98 cannot contain a class that has [virtual functions](https://en.wikipedia.org/wiki/Virtual_function) or nontrivial constructors or destructors. This restriction is imposed because the compiler cannot determine which constructor or destructor should be called for a union. PDS types can also be used for interfacing with [C](https://en.wikipedia.org/wiki/C_%28programming_language%29), which supports only PDS.

