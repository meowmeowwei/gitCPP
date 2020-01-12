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



