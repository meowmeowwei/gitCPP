---
description: >-
  https://www.ideserve.co.in/learn/time-and-space-complexity-of-recursive-algorithms
---

# Recursion

Recursion Time Complexity

```cpp
// Time Complexity O(n) -> the function is called n times

int recursiveFun1(int n)
{
    if (n <= 0)
        return 1;
    else
        return 1 + recursiveFun1(n-1);
}


//O(n) -> called N/5 times but still consider O(n)

int recursiveFun2(int n)
{
    if (n <= 0)
        return 1;
    else
        return 1 + recursiveFun2(n-5);
}


//O(logN) base 5, divide by 5 each time

int recursiveFun3(int n)
{
    if (n <= 0)
        return 1;
    else
        return 1 + recursiveFun3(n/5);
}

// O(2^n) each time it call itself twice again

void recursiveFun4(int n, int m, int o)
{
    if (n <= 0)
    {
        printf("%d, %d\n",m, o);
    }
    else
    {
        recursiveFun4(n-1, m+1, o);
        recursiveFun4(n-1, m, o+1);
    }
}

// O(n^2)

int recursiveFun5(int n)
{
    for (i = 0; i < n; i += 2) {
        // do something
    }

    if (n <= 0)
        return 1;
    else
        return 1 + recursiveFun5(n-5);
}

```

Space Complexity 

{% embed url="https://www.ideserve.co.in/learn/time-and-space-complexity-of-recursive-algorithms" %}

![](../.gitbook/assets/image%20%28164%29.png)

Using this analogy for recursive call sequence, it should follow that maximum number of stack frames that could be present in memory at any point of time is equal to maximum depth of recursion tree. In the recursion tree, when the call corresponding to leaf node state is getting executed, its call sequence could be represented by the path from the root node in recursion tree to that leaf node. For example, in the recursion tree for computing 5th fibonacci number, when left and bottom most state f\(1\) is getting executed, the call sequence which led to this state would be f\(5\)-&gt;f\(4\)-&gt;f\(3\)-&gt;f\(2\)-&gt;f\(1\) and all the corresponding stack frames would be present in the memory and when f\(1\) is returned its stack frame would be removed from the memory\(or call stack\).

