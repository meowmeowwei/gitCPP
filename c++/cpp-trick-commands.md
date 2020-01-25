# CPP trick commands

1\) read line into stringstream and take values from there 

![](../.gitbook/assets/image%20%2862%29.png)

![](../.gitbook/assets/image%20%2894%29.png)

2\) stringstream tokenizing 

string line;

getline\(cin, line\)

stringstream ss\(line\)

string token;

while \(getline\(ss, token, '-'\);

3\) reversing a string 

\#include &lt;algorithm&gt;

string ss = "sunwei"

reverse \(ss.begin\(\), ss.end\(\)\);



4\) string comparison can use compare 

ss.compare\(yy\) &gt; 0 , means ss is greater 

[http://www.cplusplus.com/reference/string/string/compare/](http://www.cplusplus.com/reference/string/string/compare/)

5\) std:: sort vs stable\_sort

stable\_sort will preserve the sequence of the objects as how they come in, if they are having the same value 

6\) forward\_list vs list

forward list created using singly linked list, one link to next item

list is doubly linked , takes more space but can iterate in both directions

vector stores data in contagious locations like a vector

deleting a node in list will not invalidate a position, but deleting in vector will affect the position 

[https://thispointer.com/difference-between-vector-and-list-in-c/](https://thispointer.com/difference-between-vector-and-list-in-c/) 



7\) emplace\_back vs push\_back in C++

    - for objects with multiple constructors, emplace\_back accepts in place creation with argument, push\_back only accepts actual objects 

    - efficency difference, emplace\_back is doing direct creation for user defined object in the list, but push\_back will create a temporary object and copies it over .



8\) sum of an array/ vector 

accumulate \(vec.begin\(\), vec.end\(\), 0\);



9\) find minimum element of an array/vector 

\*min\_element\(vec\);



 

{% embed url="http://www.cplusplus.com/reference/forward\_list/forward\_list/" %}

