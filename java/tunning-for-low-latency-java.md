# Tunning for Low Latency Java

1. **Simplicity** 
2. **Use of memory** - object pool reuse 
3. **Use of parallelism** - processing thread , other minor things on other threads
4. **Use lock - free programming** - The problem with locks is that they require arbitration when contended \[15\]. The arbitration is achieved by a context switch to the operating sys-tem kernel, **to allow the kernel to sus-pend other threads waiting on the lock.** During a context switch the con-trol of execution is transferred to the operating system, which might choose to perform additional tasks. Moreover, the execution context can lose previously cached data and in-structions. Since it is very likely to have data contention in a high per-formance application, using locks will inherently lead to jitter and high la-tencies. 
5. **Use Low level techniques - thread affinity , cache lines** 

\*\*\*\*

**use memory mapped file -&gt;** segment of virtual memory is directly correlated with some portion of physical file on the disk. it  allows application to treat teh mapped portion as if it were primary memory, while the operating system transparently deals with loading the requested data and writing it to underlying file. it safely shares data between multiple threads or even processes. 

  
There is, however, a disadvantage in working with memory-mapped files: for large files, only a portion of the file is loaded in memory and if the application requests a block of data which is not present in memory, a page fault will be raised and, as a result, the portion of the file containing the requested data will be brought to memory.

{% file src="../.gitbook/assets/lowlatencyjava.pdf" %}

