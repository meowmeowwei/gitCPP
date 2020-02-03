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

