# Ambrosia

Ultra low latency programming in Java 

{% embed url="https://cedt-confluence.nam.nsroot.net/confluence/pages/viewpage.action?spaceKey=Chronology&title=Ambrosia+Microservices" %}

{% embed url="https://www.youtube.com/watch?v=BD9cRbxWQx8" %}



1 second = 1000 mili-seconds = 1000000 microseconds = 1000000000 nanoseconds 

Achieving low latency 

* hardware
* colocation 
* software experience 

challenges of Java

* garbage collection \(world comes to stop\)
* Warm-up 
* unpredictable compilation \(decompile and recompile ,branching\)
* dont have control of memory layout \(such as C struct\) 
* certain CPU instructions not available 

Fastest -&gt; FPGA - space between java and FPGA is contracting

Programming in Hardware

* FPGA and ASIC
* slow to market 
* Expensive

![low latency programming ](../.gitbook/assets/image%20%28201%29.png)

1. **API** shouldnt force allocation 

 usual Map logic , get and put, when you do get, you tried to the take the value out from off-heap memory and creating a new object

using chronicle-map, the data are stored in memory-mapped file,

names.getUsing\(key, name\) -&gt; populate the name stringbuilder object with more details 

    2. dont use String, implement char sequence 

String tend to create more new object, you can implement charSequence which is what String currently implementing 

![](../.gitbook/assets/image%20%28199%29.png)

    3. CPU activities are usually free 

* sometime caching result \(memory access\) may take longer than doing fresh computation on the CPU



![](../.gitbook/assets/image%20%28200%29.png)



Low latency MircoServices 

* Fast Transport \(shared memory , chronicle Queue 0.5 microseconds or Aeron, dont use TCP \)
* Single Threaded \( A CPU linked to the microservice, no sychnroization , no complicated object pooling\)
* Record inputs and outputs
* map your microserices onto your hardware, thread affinity  



Hard area of low latency system

* Wait free \(off heap\) data structures 
* Resilience/High availablility 
* measurement 



![](../.gitbook/assets/image%20%28108%29.png)

![](../.gitbook/assets/image%20%28177%29.png)

![](../.gitbook/assets/image%20%28163%29.png)



