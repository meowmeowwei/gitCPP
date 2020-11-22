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
```

