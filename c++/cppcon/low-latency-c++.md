---
description: Low Latency C++ - CPP Con 2017
---

# low latency c++

\*\*\*\*

https://www.youtube.com/watch?v=NH1Tta7purM

1. Role of C++

* 0 overhead abstraction 
* But still need to consider, compiler version, machine architecture, 3rd party libraries, and build and link flags 

1. Tools for checking compiler machine instructions \( [godbolt.org](http://godbolt.org)\)
2. Machine of hyper threading configuration performs slower than machine without 

Techniques 

1. Slowpath removal 

![Pasted Graphic.tiff](blob:https://app.gitbook.com/b9e25b28-c240-440c-8949-5498b98cefd7)

1. Avoid template-based configuration 

No branching, less pressure on instruction cache and data cache

![Pasted Graphic 1.tiff](blob:https://app.gitbook.com/4ae58050-7e19-4035-b8f6-57472ca7ae10)

![Pasted Graphic 2.tiff](blob:https://app.gitbook.com/73f3990e-e3b4-42be-b073-474179413056)

![Pasted Graphic 3.tiff](blob:https://app.gitbook.com/4547f050-48d2-418c-a900-a602eec8cf12)

1. Use Lambda functions

![Pasted Graphic 4.tiff](blob:https://app.gitbook.com/a18e4305-4e78-4ee3-82f2-889bf05ee7f7)

1. Memory Allocation 

![Pasted Graphic 5.tiff](blob:https://app.gitbook.com/0553b184-8076-4aee-80ee-fff3d76e68d1)

1. Exception in C++

![Pasted Graphic 6.tiff](blob:https://app.gitbook.com/b44d5146-5481-4c3d-8fa4-4168b34aaea8)

1. Prefer templates to branches \(if statements\)

Do it in the hot path

![Pasted Graphic 7.tiff](blob:https://app.gitbook.com/34da284b-84d5-4b61-b42e-44e8e493cc9f)

![Pasted Graphic 8.tiff](blob:https://app.gitbook.com/e62afdb4-d353-457f-819c-2fdae0ecf405)

7.avoid multi-threading

![Pasted Graphic 9.tiff](blob:https://app.gitbook.com/f09b0a22-e4ff-40eb-8f68-554073b706a8)

![Pasted Graphic 10.tiff](blob:https://app.gitbook.com/54f174c5-6b01-4b2b-a162-602e0e1be282)

1. Data lookup

Anyway , the application will read the whole cache line, then might as well put the value inside there 

![Pasted Graphic 11.tiff](blob:https://app.gitbook.com/a208d63d-1e1e-4430-ac38-227de37454f3)

![Pasted Graphic 11.tiff](blob:https://app.gitbook.com/a208d63d-1e1e-4430-ac38-227de37454f3)

1. Fast associate containers

Use STL un-ordered map 

Link list not in contagious memory 

![Pasted Graphic 13.tiff](blob:https://app.gitbook.com/32e9e499-021a-448f-8817-330a528dd4d5)

1. Always\_inline and no inline

![Pasted Graphic 14.tiff](blob:https://app.gitbook.com/160be142-bb9b-4a05-aa5d-fbf1cde4bc6c)

1. Keeping cache hot

Keep instruction cache hot

![Pasted Graphic 15.tiff](blob:https://app.gitbook.com/4edb00e9-cc37-4b35-b0a4-1ea0952b9441)

![Pasted Graphic 16.tiff](blob:https://app.gitbook.com/8a91f643-24a9-440a-b650-0a4b2f026a2b)

1. Don’t share cache

![Pasted Graphic 17.tiff](blob:https://app.gitbook.com/ecf5d318-6bcf-4dfa-bc1f-99ecbfd3cf9d)

1. Small string optimisation support 

![Pasted Graphic 18.tiff](blob:https://app.gitbook.com/7bae14a3-b363-4d96-8329-89f5e4362f38)

1. Overhead of static local variable 

Guarantee it only get initialise once 

![Pasted Graphic 19.tiff](blob:https://app.gitbook.com/617e44c6-1aa0-45c4-8cc8-c848b51b7945)

1. Std::function may allocate 

![Pasted Graphic 20.tiff](blob:https://app.gitbook.com/20433075-3715-47f8-ab15-948504d7f97e)

1. Pow can be slow

![Pasted Graphic 21.tiff](blob:https://app.gitbook.com/06b8243b-a70e-4c45-be86-adee27da0226)

Measurement of low latency system 

![Pasted Graphic 22.tiff](blob:https://app.gitbook.com/b4fb758e-f7ca-4e43-b1e8-bfedfc4eb048)

![Pasted Graphic 23.tiff](blob:https://app.gitbook.com/25a9de7e-dc28-45e4-9ed5-c74b19792c7e)

