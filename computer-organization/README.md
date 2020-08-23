---
description: 'http://www.edwardbosworth.com/My5155Textbook_HTM/MyText5155_Ch09_V06.htm'
---

# Computer Organization

![](../.gitbook/assets/image%20%28204%29.png)



Registers vs. Memory

Registers and memory are similar in that both store data.  The difference between the two is somewhat an artifact of the history of computation, which has become solidified in all current architectures.  The basic difference between devices used as registers and devices used for memory storage is that registers are usually faster and more expensive \(see below for a discussion of registers and Level–1 Cache\).

The origin of the register vs. memory distinction can be traced to two computers, each of which was built in the 1940’s: the ENIAC \(**E**lectronic **N**umerical **I**ntegrator **a**nd **C**alculator – becoming operational in 1945\) and the EDSAC \(**E**lectronic **D**elay **S**torage **A**utomatic **C**alculator – becoming operational in 1949\).  Each of the two computers could have been built with registers and memory implemented with vacuum tubes – a technology current and well-understood in the 1940’s.  The difficulty is that such a design would require a very large number of vacuum tubes, with the associated cost and reliability problems.  The ENIAC solution was to use vacuum tubes in design of the registers \(each of which required 550 vacuum tubes\) and not to have a memory at all.  The EDSAC solution was to use vacuum tubes in the design of the registers and mercury delay lines for the memory unit.

In each of the designs above, the goal was the same – to reduce the number of “storage units” that required the expensive and hard-to-maintain vacuum tubes.  This small number of storage units became the register file associated with the central processing unit \(CPU\).  It was not until the MIT Whirlwind in 1952 that magnetic core memory was introduced.

In modern computers, the CPU is usually implemented on a single chip.  Within this context, the difference between registers and memory is that the registers are on the CPU chip while most memory is on a different chip.  Now that L1 \(level 1\) caches are appearing on CPU chips \(all Pentium™ computers have a 32 KB L1 cache\), the main difference between the two is the method used by the assembly language to access each.  Memory is accessed by address as if it were in the main memory that is not on the chip and the memory management unit will map the access to the cache memory as appropriate.  Register memory is accessed directly by specific instructions.  One of the current issues in computer design is dividing the CPU chip space between registers and L1 cache: do we have more registers or more L1 cache?  The current answer is that it does not seem to make a difference.

