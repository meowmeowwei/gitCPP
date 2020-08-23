---
description: 'http://www.edwardbosworth.com/My5155Textbook_HTM/MyText5155_Ch09_V06.htm'
---

# Computer Organization

[very good youtube here -&gt; ](https://www.youtube.com/watch?v=ckDb_W72__c)

![](../.gitbook/assets/image%20%28204%29.png)



Registers vs. Memory

In modern computers, the CPU is usually implemented on a single chip.  Within this context, the difference between registers and memory is that the registers are on the CPU chip while most memory is on a different chip.  Now that L1 \(level 1\) caches are appearing on CPU chips \(all Pentium™ computers have a 32 KB L1 cache\), the main difference between the two is the method used by the assembly language to access each.  Memory is accessed by address as if it were in the main memory that is not on the chip and the memory management unit will map the access to the cache memory as appropriate.  Register memory is accessed directly by specific instructions.  One of the current issues in computer design is dividing the CPU chip space between registers and L1 cache: do we have more registers or more L1 cache?  The current answer is that it does not seem to make a difference.

**Lecture 2 about CPU**

Clock-Speed

* clock is a tiny quartz crytstal inside CPU chip that ticks at steady speed. CPU can only do something when clock ticks and process a single instruction.
* measured in hertz 
* 3 GHZ -&gt; 3 gigaherz =&gt; 3 billion cycles per second

![](../.gitbook/assets/image%20%28205%29.png)



