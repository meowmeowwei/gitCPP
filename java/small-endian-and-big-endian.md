---
description: 'https://www.geeksforgeeks.org/little-and-big-endian-mystery/'
---

# Small Endian and Big Endian

**What are these?**  
Little and big endian are two ways of storing multibyte data-types \( int, float, etc\). In little endian machines, last byte of binary representation of the multibyte data-type is stored first. On the other hand, in big endian machines, first byte of binary representation of the multibyte data-type is stored first.  
  
Suppose integer is stored as 4 bytes \(For those who are using DOS based compilers such as C++ 3.0 , integer is 2 bytes\) then a variable x with value 0x01234567 will be stored as following.

[![](http://4.bp.blogspot.com/_IEmaCFe3y9g/SO3GGEF4UkI/AAAAAAAAAAc/z7waF2Lwg0s/s400/lb.GIF)](http://4.bp.blogspot.com/_IEmaCFe3y9g/SO3GGEF4UkI/AAAAAAAAAAc/z7waF2Lwg0s/s1600-h/lb.GIF)

