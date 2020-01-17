# CPP trick commands

1\) read line into stringstream and take values from there 

![](../.gitbook/assets/image%20%2860%29.png)

![](../.gitbook/assets/image%20%2890%29.png)

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

{% embed url="http://www.cplusplus.com/reference/forward\_list/forward\_list/" %}

