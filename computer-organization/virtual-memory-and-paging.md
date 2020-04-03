---
description: >-
  https://www.programmerinterview.com/operating-systems/how-virtual-memory-works/
---

# Virtual Memory and Paging

Real, or physical, memory exists on RAM chips inside the computer. Virtual memory, as its name suggests, doesn’t physically exist on a memory chip. It is an optimization _technique_ and is implemented by the operating system in order to give an application program the impression that it has more memory than actually exists. Virtual memory is implemented by various operating systems such as Windows, Mac OS X, and Linux.

### The paging file and the RAM

|  |
| :--- |


Now, how does the VMM function? As mentioned before, the VMM creates a file on the hard disk that holds the extra memory that is needed by the O.S., which in our case is 70 MB in size. This file is called a paging file \(also known as a **swap file**\), and plays an important role in virtual memory. The paging file combined with the RAM accounts for all of the memory. Whenever the O.S. needs a ‘block’ of memory that’s not in the real \(RAM\) memory, the VMM takes a block from the real memory that hasn’t been used recently, writes it to the paging file, and then reads the block of memory that the O.S. needs from the paging file. The VMM then takes the block of memory from the paging file, and moves it into the real memory – in place of the old block. This process is called **swapping \(also known as paging\)**, and the blocks of memory that are swapped are called pages. The group of pages that currently exist in RAM, and that are dedicated to a specific process, is known as the working set for that process.

