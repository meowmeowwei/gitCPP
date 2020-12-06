---
description: node.js library
---

# Express.JS

```javascript

const express = require ('express')

const app = express();

app.use((req, res, next)=>{
	console.log('<h1>hello<h1>')
	next()
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

