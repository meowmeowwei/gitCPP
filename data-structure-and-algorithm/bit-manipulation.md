---
description: >-
  https://www.interviewcake.com/concept/cpp/and?course=fc1&section=bit-manipulation
---

# Bit Manipulation

1\) And

The **AND** operation takes two bits and returns 11 if **both** bits are 11. Otherwise, it returns 00.

```text
1 & 1  →  1
1 & 0  →  0
0 & 1  →  0
0 & 0  →  0
```

Think of it like a hose with two knobs. _Both_ knobs must be set to on for water to come out.

2\) OR

The **OR** operation takes two bits and returns 11 if **either** of the bits are 11. Otherwise, it returns 00.

```text
  1 | 1  →  1
1 | 0  →  1
0 | 1  →  1
0 | 0  →  0
```

Think of it like a bucket with two holes in it. If _both_ holes are closed, no water comes out. If _either_ hole is open, _or if both_ are open, water comes out.\

3\) Exclusive OR

The **XOR** operation \(or **exclusive or**\) takes two bits and returns 11 if **exactly one** of the bits is 11. Otherwise, it returns 00.

```text
  1 ^ 1  →  0
1 ^ 0  →  1
0 ^ 1  →  1
0 ^ 0  →  0
```

Think of it like a bag of chips where only one hand can fit in at a time. If no one reaches for chips, no one gets chips, and if both people reach for chips, they can't fit and no one gets chips either!

4\) Bitwise Not

The **NOT** bitwise operation inverts bits. A 00 becomes a 11. A 11 becomes a 00.

The NOT operator is often written as a **tilde character** \("~"\):

```text
~ 0000 0101
= 1111 1010
```

When numbers are printed in base-10, the result of a NOT operation can be surprising. In particular, positive numbers can become negative and negative numbers can become positive. For example:

```cpp
  ~ 5  // gives -6

// At the bit level:
//   ~ 0000 0101  (5)
//   = 1111 1010  (-6)
```

This is because [numbers are \(usually\) represented using two's complement, where the leftmost bit is actually negative](https://www.interviewcake.com/concept/binary-numbers#twos-complement). So flipping the leftmost bit usually flips the sign of the number.

5\) [Bit Shifting](https://www.interviewcake.com/concept/cpp/bit-shift?course=fc1&section=bit-manipulation)

#### Left Shifts

When shifting left, the most-significant bit is lost, and a 00 bit is inserted on the other end.

The left shift operator is usually written as "&lt;&lt;".

```cpp
0010 << 1  →  0100
0010 << 2  →  1000
```

A single left shift multiplies a binary number by 2:

```cpp
0010 << 1  →  0100

0010 is 2
0100 is 4
```



#### Logical Right Shifts

When shifting right with a **logical right shift**, the least-significant bit is lost and a 00 is inserted on the other end.

```cpp
1011 >> 1  →  0101
1011 >> 3  →  0001
```

For positive numbers, a single logical right shift divides a number by 2, throwing out any remainders.

```cpp
0101 >> 1  →  0010

0101 is 5
0010 is 2
```





#### Arithmetic Right Shifts

When shifting right with an **arithmetic right shift**, the least-significant bit is lost and the most-significant bit is _copied_.

Languages handle arithmetic and logical right shifting in different ways. **Most C++ compilers implement the right shift operator \(&gt;&gt;\) as** _**arithmetic**_ **right shifting on signed types and** _**logical**_ **right shifting on unsigned types. Tricky!**

```text
1011 >> 1  →  1101
1011 >> 3  →  1111

0011 >> 1  →  0001
0011 >> 2  →  0000
```

The first two numbers had a 11 as the most significant bit, so more 11's were inserted during the shift. The last two numbers had a 00 as the most significant bit, so the shift inserted more 00's.

If a number is encoded using [two's complement, ](https://www.interviewcake.com/concept/binary-numbers#twos-complement)then an arithmetic right shift preserves the number's sign, while a logical right shift makes the number positive.

```text
  // Arithmetic Shift
    1011 >> 1  →  1101
    1011 is -5
    1101 is -3

// Logical Shift
    1111 >> 1  →  0111
    1111 is -1
    0111 is  7
```

