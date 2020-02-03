---
description: pg 219/708
---

# Chapter 2 - Linked List

1\) 

careful , differentiate unordered\_map vs map 

```text
	Node * removeDuplicate(){
		unordered_set<int> actualSet;

		Node * prev = head;
		Node * curr = head;

		do{
			if(curr != nullptr ){
				if(actualSet.find(curr->value)== actualSet.end()){
					actualSet.insert(curr->value);
					prev = curr;
					curr = curr->next;

				}
				else{
					if(curr == head){
						head = curr-> next;
						return head;
					}


					prev->next = curr->next;
					curr = prev->next;

				}
			}
			else{
				return head;
			}
		}while(curr!=nullptr);

	

	return head;
 }

 Node * removeDwithRunner(){
 	auto * current = head;

 	while(current){
 		auto * runner = current;

 		while(runner->next){
 			if(runner->next->value == current->value){
 				runner->next = runner->next->next;
 				
 			}
 			else{
 				runner = runner->next;
 			}
 		}
 		current = current ->next;
 	}
 	return head;

 }

};
```

2\) use recursion to find the kth smallet 

```text
int recursion(Node * node, int index ){
	if(!node)
		return 0;

	int i = recursion(node->next, index) +1;

	if(i==index)
		cout << "kth item from the index is "<< node->value;

	return index;
}


 int returnKthFromLastUsingRecursion(int index){
 	return recursion(head, index);
 }
```

