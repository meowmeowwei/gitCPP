---
description: 'https://www.youtube.com/watch?v=BP6NxVxDQIs&list=WL&index=3&t=0s'
---

# Want fast c++ , know your hardware

![](../../.gitbook/assets/image%20%28193%29.png)

Prefetcher listens to the pattern of fetching values, and starts prefetching values ...

e.g. 2d array, row iteration read is better than column based iteration ..



[cache associativity ](https://en.wikipedia.org/wiki/Cache_placement_policies)-&gt; block of memory can not neccessary be placed randomly in the cache.  \( direct map cache, Fully associative cache, set-associative cache\)

![](../../.gitbook/assets/image%20%28195%29.png)

Alignof -&gt; data objects in memory are aligned at specific location 

_\_attribute\__\(\(packed\)\)

![](../../.gitbook/assets/image%20%28197%29.png)

![](../../.gitbook/assets/image%20%28196%29.png)

why multi-thread is slow ?

if they all access same data, if one thread changes the variable, it invalidates the value for other threads, and there will be cache miss for other thread \(core\)

atomic is sometimes slower than mutexes

![](../../.gitbook/assets/image%20%28192%29.png)



