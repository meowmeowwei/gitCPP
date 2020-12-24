# Java Interview

**1\) Core algorithm** 

* [difference between Comparable and Comparator ?](https://www.tutorialspoint.com/difference-between-comparable-and-comparator-in-java)

both are interface that can be used to sort elements of collection.

for comparable, the object itself needs to implements it and override compareTo method, then collection will call collection.sort \(objectList\)

for comparator, need to initialise a new object of comparator that compares. then collection will call collection.sort\(list, new comparator\(\)\);

* [final key word](https://www.geeksforgeeks.org/final-keyword-java/)

when a variable is declared final, it's value cant be modified 

final class means can not do inheritance 

if it's a reference object means reference can not change, but internal values can be modified 

\*\*\*\*

**2. Data Structure** 

* arrayList \(internally backed by array, default size 10\)
* linkedlist \(object with internal reference pointer to same object\)
* queue \(first in first out\) 
* deque \(double ended queue\)
* trees 
* HashMap \(implemented with a hashtable\)
* TreeMap \(implemented with a binary tree data structure, sorted to natural order \) 
* Set \(implemented using hashSet\) 



* [treeMap vs Hashmap ](https://stackoverflow.com/questions/2444359/what-is-the-difference-between-a-hashmap-and-a-treemap)

[`TreeMap`](http://java.sun.com/javase/6/docs/api/java/util/TreeMap.html) is an example of a [`SortedMap`](http://java.sun.com/javase/6/docs/api/java/util/SortedMap.html), which means that the order of the keys can be sorted, and when iterating over the keys, you can expect that they will be in order.

[`HashMap`](http://java.sun.com/javase/6/docs/api/java/util/HashMap.html) on the other hand, makes no such guarantee. Therefore, when iterating over the keys of a `HashMap`, you can't be sure what order they will be in.

`HashMap` will be more efficient in general, so use it whenever you don't care about the order of the keys.



**3.**[ **Design Pattens**](https://www.tutorialspoint.com/design_pattern/decorator_pattern.htm)\*\*\*\*

* Builder Pattern \(helps to constructor domain-legal object and reject if any information is missing\) 
* Strategy Patten \(have a common strategy interface, multiple implementation details, inject at runtime\)
* Decorator Pattern \(add functionality to existing object without altering its structure\) 
* Flyweight Pattern \(many objects sharing same value, example, Integer.valueOf\(\) fetch pre-cache values\)
* Singleton Pattern 

