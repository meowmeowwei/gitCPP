# C++ Allocator

Memory Fragmentation 

{% embed url="https://stackoverflow.com/questions/3770457/what-is-memory-fragmentation" %}

magine that you have a "large" \(32 bytes\) expanse of free memory:

```text
----------------------------------
|                                |
----------------------------------
```

Now, allocate some of it \(5 allocations\):

```text
----------------------------------
|aaaabbccccccddeeee              |
----------------------------------
```

Now, free the first four allocations but not the fifth:

```text
----------------------------------
|              eeee              |
----------------------------------
```

Now, try to allocate 16 bytes. Oops, I can't, even though there's nearly double that much free.

On systems with virtual memory, fragmentation is less of a problem than you might think, because large allocations only need to be contiguous in _virtual_ address space, not in _physical_ address space. So in my example, if I had virtual memory with a page size of 2 bytes then I could make my 16 byte allocation with no problem. Physical memory would look like this:

```text
----------------------------------
|ffffffffffffffeeeeff            |
----------------------------------
```

whereas virtual memory \(being much bigger\) could look like this:

```text
------------------------------------------------------...
|              eeeeffffffffffffffff                   
------------------------------------------------------...
```

The classic symptom of memory fragmentation is that you try to allocate a large block and you can't, even though you appear to have enough memory free. Another possible consequence is the inability of the process to release memory back to the OS \(because there's some object still in use in all the blocks it has allocated from the OS, even though those blocks are now mostly unused\).

Tactics to prevent memory fragmentation in C++ work by **allocating objects from different areas according to their size and/or their expected lifetime. So if you're going to create a lot of objects and destroy them all together later, allocate them from a memory pool.** Any other allocations you do in between them won't be from the pool, hence won't be located in between them in memory, so memory will not be fragmented as a result.

Generally you don't need to worry about it much, unless your program is long-running and does a lot of allocation and freeing. It's when you have mixtures of short-lived and long-lived objects that you're most at risk, but even then `malloc` will do its best to help. Basically, ignore it until your program has allocation failures or unexpectedly causes the system to run low on memory \(catch this in testing, for preference!\).

The standard libraries are no worse than anything else that allocates memory, and standard containers all have an `Alloc` template parameter which you could use to fine-tune their allocation strategy if absolutely necessary.

