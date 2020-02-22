---
description: 'https://www.internalpointers.com/post/beginner-s-look-smart-pointers-modern-c'
---

# Smart Pointers

C++ Primer Pg 450

```text
int main(){

	unique_ptr<int> p1(new int(5));

	//unique_ptr<int> p2 = p1;  not allowed, can only have one copy

	shared_ptr<int> p3 = make_shared<int>(100); // can have multiple copies, internally has reference counter
	shared_ptr<int> p4 = p3;

	cout<<*p4<<endl;

	// circular dependencies 

	std::shared_ptr<Player> jasmine = std::make_shared<Player>();
  	std::shared_ptr<Player> albert  = std::make_shared<Player>();

  	jasmine->companion = albert; // (1)
  	albert->companion  = jasmine; // (2)


  	// weak pointer -> a shared pointer that doesnt increase reference count. it holds non-owning reference or 
  	// a weak reference, to an object managed by another shared pointer

  	// need to use lock to access the actual original pointer


  	std::shared_ptr<int> p_shared = std::make_shared<int>(100);
	std::weak_ptr<int>   p_weak(p_shared);
	// ...
	std::shared_ptr<int> p_shared_orig = p_weak.lock();
	//


}
```

Shared Pointer 

-&gt; each object has two pointers \(one for actual object, one for reference counting\)

{% embed url="https://thispointer.com/learning-shared\_ptr-part-1-usage-details/" %}



