#include <iostream>
using namespace std;

class ListNode {
	public:
	ListNode * prev;
	ListNode * next;
	int value;
	bool died; 
	ListNode (ListNode * a, ListNode * b, int val){
		prev = a;
		next = b;
		value = val;
		died = false;
	}


};

ListNode * displayList(ListNode * head){
	while(head->died){
		head = head->next;
	}

	cout << head->value<< " ";

    ListNode * current = head->next;

    while (current->value != head->value ){
    	cout << current -> value << " ";
   
    	current = current->next;
    }


	return head;
}

ListNode * removeJump(ListNode * head, int jump){
	auto target = head;

	for ( int i =1; i <= jump; i ++){
		target = target->next;
	}
	target->prev->next = target->next;
	target->next->prev = target->prev;
	target->died = true;
    return target->next;
}

int main() {
	ios_base::sync_with_stdio(false);
	cin.tie(NULL);
	
	// read input
	cout << "Enter Number of Players"<<endl;

	int totalNum =0;

	cin >> totalNum;

	// intialize the game 

	ListNode * head = new ListNode (NULL, NULL, 0);

	ListNode * prev = head;

    ListNode * current;
	for (int i = 1; i < totalNum ; i++){
		current = new ListNode( prev, NULL, i);
		prev->next = current;
		prev = current;
	}
	current->next = head;

	
	cout << "enter the jump deletion"<<endl;
	
	long jumps;
	ListNode * player = head;
	while (cin >> jumps) {
		player = removeJump(player, jumps);
		head = displayList(head);
		cout << endl<< "enter the next jump"<<endl;
	}

	
	
	
	return 0;
}
