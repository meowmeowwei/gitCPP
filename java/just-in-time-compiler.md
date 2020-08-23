---
description: 'https://aboullaite.me/understanding-jit-compiler-just-in-time-compiler/'
---

# Just In Time Compiler

![](../.gitbook/assets/image%20%28224%29.png)

at runtime, JVM loads class files and performs additional computation. JIT helps improve performance of java program by compiling bytecode into native machine at runtime and do optimisation

JIT is enabled by default. activated when when a method is called.

However, there's limited amount of codes that can be JIT compiled. The JVM keeps all the compiled bytecode in the code cache..when caches fills, the compilation has to stop and on other portion of byte code can be further optimized.  

Oracle HotSpot JVM -&gt; monitor which sequence of byte code are frequently executed \(the hot spot\), and translate only those sequence to machine code for direct execution on hardware.   

