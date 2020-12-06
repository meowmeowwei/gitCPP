---
description: node.js library
---

# Express.JS

```javascript

const express = require ('express')

const app = express();

app.use((req, res, next)=>{      // middleware, process before anything else 
	console.log('<h1>hello<h1>')
	next()   // need to call next for it to continue 
})

app.get('/', (req, res) => {
	const user ={
		name: 'sally',
		hobby: 'soccer'
	}
	res.send(user)
});
app.listen(3000);



```

