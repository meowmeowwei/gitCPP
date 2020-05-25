---
description: 'https://www.csd.uoc.gr/~hy556/material/tutorials/cs556-1st-tutorial.pdf'
---

# Processes and Pthreads

Process   
-&gt; instance of a program that is being executed 

-&gt; consists of its own PCB \(Process Control Block\)

![](../.gitbook/assets/image%20%28190%29.png)

Call Stack \(composed of stack frames or activation records\)

-&gt; each stack frame corresponds to an active subroutine and is machine dependent 

![](../.gitbook/assets/image%20%28188%29.png)

Multi-tasking \(one CPU serving multiple processes\)

Multi-processing \(when applying multi-tasking to a multicore machine\) 



IPC \(inter process communication\) 

-&gt; processes do not share anything implicitly 

-&gt; explicit actions are required to achieve IPC 



**Why do we need threads ?**

-&gt; process is heavy unit of kernel scheduling

-&gt; costly process creation 

-&gt; expensive context switch

-&gt; costly IPC since it goes through OS

A Process Consists of 

-&gt; Collection of resources 

-&gt; thread of execution 



**Threads** 

Threads Share same memory \(global variables , heap, file descriptors\)

Threads own a stack and a copy of registers 

Threads are executed in parallel 

![](../.gitbook/assets/image%20%28189%29.png)

![](../.gitbook/assets/image%20%28187%29.png)



**Kernel Threads -&gt; lightest unit of kernel scheduling, each process contains at least one kernel thread**

**User Threads -&gt; managed and scheduled in user space**



