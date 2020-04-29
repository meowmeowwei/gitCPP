# number systems and codes

base or radix is 10, represents total numbers or symbols allowed in the system. 

![](../.gitbook/assets/image%20%28159%29.png)

Converting Whole Number to Binary , constantly divide by 2 until quotient is 0

43 -&gt; 101011

![](../.gitbook/assets/image%20%2862%29.png)

Converting decimal fractions to binary, repeatedly multiply by 2 

0.3125 = .0101

![](../.gitbook/assets/image%20%28160%29.png)

Binary to Octal/ Hex conversion 

![](../.gitbook/assets/image%20%2867%29.png)

Representing signed numbers

1\) Sign and Magnitude  \( just invert the sign bit\)

2\) 1s Complement \( -x = 2 ^n - x -1\)

3\) 2s Complement \(-x = 2^n -x\)

![](../.gitbook/assets/image%20%2881%29.png)



UTF-8 = Unicode 8 Bits.

ASCII code -&gt; 7 bits plus one detection bit \( right most bit for Even or Odd definition\)



[two's complement ](https://www.interviewcake.com/concept/cpp/binary-numbers?course=fc1&section=bit-manipulation)



| **Decimal** | **Binary** | **Interpretation** |
| :--- | :--- | :--- |
| -5−5 | 1011 | -8 + 0 + 2 + 1 |
| -4−4 | 1100 | -8 + 4 + 0 + 0 |
| -3−3 | 1101 | -8 + 4 + 0 + 1 |
| -2−2 | 1110 | -8 + 4 + 2 + 0 |
| -1−1 | 1111 | -8 + 4 + 2 + 1 |
| 00 | 0000 | 0 + 0 + 0 + 0 |
| 11 | 0001 | 0 + 0 + 0 + 1 |
| 22 | 0010 | 0 + 0 + 2 + 0 |
| 33 | 0011 | 0 + 0 + 2 + 1 |
| 44 | 0100 | 0 + 4 + 0 + 0 |
| 55 | 0101 | 0 + 4 + 0 + 1 |



So, should 1011 be read as "eleven" \(in binary\) or "negative five" \(in two's complement\)?

It could be either one! Many languages have two types of numbers: **signed** and **unsigned**. Signed numbers are represented in two's complement, and unsigned numbers use plain old base 2.

So, if an interviewer asks you to convert base-2 into decimal, ask: "is that in two's complement or not?"

