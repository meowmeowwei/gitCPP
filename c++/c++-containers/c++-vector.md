# C++ Vector

implemented as wrapper around a C style array with defined size 

#### Size and Capacity

The first thing to realize about how the **vector** class works is that a **vector** is more than just a block of memory. Instead, every **vector** has not one but two sizes associated with it. One, called its size, is the number of elements that it contains. The other, called its capacity, is the total amount of memory that is available for storing elements. If **v** is a **vector**, then **v.size\(\)** and **v.capacity\(\)** return **v**’s size and capacity, respectively. You might imagine a vector looking like this

[Vector Expansion Strategy](https://www.drdobbs.com/c-made-easier-how-vectors-grow/184401375)

1. Allocate enough memory for the desired new capacity;
2. Copy the elements from the old memory to the new;
3. Destroy the elements in the old memory; and
4. Deallocate the old memory.

We have just shown that an implementation that wants to be able to allocate large **vector**s in less than quadratic time cannot use a strategy of increasing the **vector**’s capacity by a constant each time it fills up. Instead, the amount of additional memory allocated must grow each time the **vector** grows. This fact suggests a simple strategy: how about starting the **vector** out with a single element, and then doubling its capacity each time we reallocate? Remarkably, it turns out that this strategy allows us to build up an n-element **vector** in O\(n\) time.

To understand how such efficiency is possible, consider the state of a **vector** when we have completely filled it up and are about to reallocate it:

![](http://twimgs.com/ddj/cuj/images/cuj0104koenig/fig2.gif)

Half of the elements were appended to the **vector** since the last reallocation, so they have never been copied. Of the ones that have been copied, half of those have been copied exactly once, half of the remainder have been copied twice, and so on.

In other words, n/2 elements have been copied one or more times, n/4 elements have been copied two or more times, and so on. Therefore, the total number of copies that have been made up to this point is n/2 + n/4 +..., which is approximately n. \(This approximation becomes more accurate as n increases.\) In addition to the copies, n elements have been appended to the **vector**, but the total number of operations is still O\(n\), not O\(n2\).

#### Discussion

The C++ Standard does not mandate that the **vector** class manage its memory in any particular way. What it does is to require that creating an n-element **vector** through repeated calls to **push\_back** take no longer than O\(n\) time. The strategy that we have been discussing is probably the most straightforward that is capable of meeting that requirement.

Erase : can be used to erase values in the vector

insert : can be used to append another vector into it

```cpp
// Complete the rotLeft function below.
vector<int> rotLeft(vector<int> a, int d) {
    vector<int> temp;
    for(int i=0; i <d; i++){
        temp.push_back(a[i]);
       
    }
    a.erase(a.begin(), a.begin()+d);
    a.insert(a.end(), temp.begin(), temp.end());
    return a;
}
```

vector &lt;int&gt; vec;

vect.at\(5\) will throw out\_of\_range exception.. this is better than vec\[5\], but may have small performance issue 

vector performs better for traversal and for sorting and searching than list 



1\) [vector.erase vs remove ](https://stackoverflow.com/questions/19296958/difference-between-stdremove-and-erase-for-vector)

erase will cause all the elements following to be copied forward.

remove will create a copy and copy the needed elements into the destination vector and return.



