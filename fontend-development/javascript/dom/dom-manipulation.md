---
description: Shopping List
---

# DOM manipulation

```javascript

var button = document.getElementById("enter");
var input = document.getElementById("userinput");

var list = document.getElementById("todos")

button.addEventListener("click", function(){
	var li = document.createElement("li");
	li.appendChild(document.createTextNode(input.value));
	list.appendChild(li);
	input.value = "";
})



input.addEventListener("keypress", function(){
	if(event.keyCode!=13)
		return
	var li = document.createElement("li");
	li.appendChild(document.createTextNode(input.value));
	list.appendChild(li);
	input.value = "";
})
```

