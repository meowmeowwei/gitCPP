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

if they are not defined, default memory allocation is 1/64 of the memory on the computer up to 1GB ... 







