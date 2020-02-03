# Reversing a LinkedList

{% embed url="https://www.geeksforgeeks.org/reverse-a-linked-list/" %}

```text
while (curr){

    next = curr -> next;
    curr -> next = prev;
    prev = curr;
    curr = next;

}

return prev;
```

