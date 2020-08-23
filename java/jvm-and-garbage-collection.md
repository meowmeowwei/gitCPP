# JVM & Garbage Collection

**Heap Has different Sections** 

* Eden
* Survivor 
* Tenured
* PermGen \( java 8  called Metaspace\)

if an object survives enough garbage collection, it gets promoted to the next level 



**Garbage Collection** 

at first used mark-and-sweep to mark the code references as live... during collection process \(all threads are paused as stop the world\) , reclaim the memory 

at the same time, compaction is happening \(live objects that are accessed frequently are moved together\)

**Stack vs Heap** 

 stack -&gt; primitive values, references and methods ...governed by the scope of the code

heap -&gt; actual object allocation place 



**Defining size of Heap and Stack in Jvm** 

* heap \( -Xmx \) ---&gt; e.g. java -Xmx512m    \( means starting with 512mb heap\)
* stack \(-Xms\) 
* permanent generation size \(-XX:Permsize , -XX:MaxPermSize\) 

if they are not defined, default memory allocation is 1/64 of the memory on the computer up to 1GB ... 



**Memory leak is possible in Java**

e.g. ArrayList you keep referencing to an object but dont pop it .. that value will not be removed 



**Lifecycle of codes in JVM** 

* compiler to compiler it to bytecode in .class file 
* classloader to load the bytecode into the memory of running jvm  \( classes are only loaded on demand\)
* JVM does further checking once bytecode is loaded into memory 
* Just In Time compiler dynamically translate the running bytecode into native instructions so that interpreting the bytecode is not necessary. 

**Specifically calling GC directly in the code** 

* System class gc method \( but it will cause stop of the word\) 
* the JVM will take it as suggestion to try to do it, but no guarantee 



**"finalize" keyword**

inherited from object. called when the jvm is about to garbage collect the object ...



\*\*\*\*[**Weak Reference** ](https://www.geeksforgeeks.org/types-references-java/)\*\*\*\*

\*\*\*\*[**Native Methods**](https://www.baeldung.com/java-native) **and** [**JNI** ](https://www.baeldung.com/jni)\*\*\*\*

\*\*\*\*

**Shutdown Hook**

* have some code run before it exists,. 
* Runtime.getRuntime\(\).addShutdownHook\(new Thread\(\){ //implement a run method here}



Measurements of JVM

* execution time - total time not spent in GC
* pauses - number of time application pauses for GC to happen
* footprint - total amount of memory used by application processes
* promptness - amount of time between object becomes unused and when it's freed

