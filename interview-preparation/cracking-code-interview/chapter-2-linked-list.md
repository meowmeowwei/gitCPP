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

or using two pointers with k distance apart

```text
 int returnKthUsingIterative(int index){
 	auto * p1 = head;
 	auto * p2 = head;

 	for(int i =0; i < index; i++){
 		if(!p1)
 			return -1;
 		p1 = p1->next;
 	}

 	while(p1!=nullptr){
 		p1 = p1->next;
 		p2 = p2->next;
 	}

 	return p2->value;
 }

};
```

3\) deleting middle node

copy the next node value to it, set the next to next node's next

node this method may not work if the node to delete is last node 

```text

void deleteMiddleNode(Node * node){
	if(!node || !node->next){
		return;
	}

	auto * nextNode = node ->next;
	node->value = nextNode->value;
	node->next = nextNode->next;
	return;
}
```

5\) 

```text
LinkList * sumList(Node * a, Node * b){
	LinkList * resultList = new LinkList();

	int valueA =0;
	int valueB =0;

	int sum =0;
	int carry =0; 

	while(a || b ){
		valueA = a ? a->value : 0;
		valueB = b ? b->value : 0;

		cout<< "Value A is "<< valueA <<endl;
		cout<< "Value B is "<< valueB << endl; 

		sum = valueA + valueB + carry;

		if(sum >=10){
			carry = 1;
			sum = sum %10;
		}else{
			carry =0;
		}

		a = a ? a->next: nullptr;
		b = b ? b->next: nullptr;

		resultList->add(sum);


	}

	if(carry)
		resultList->add(carry);

	return resultList; 
}
```

