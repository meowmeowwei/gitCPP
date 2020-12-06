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

Example 2 with bodyParser

```javascript


const express = require ('express')
const bodyParser = require('body-parser')

const app = express();


app.use(bodyParser.urlencoded({extended:false}))
app.use(bodyParser.json())
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


app.post('/profile', (req, res) => {
	console.log(req.body)
	const user ={
		name: 'sunwei',
		hobby: 'soccer'
	}
	res.send(user)
});
app.listen(3000);


```

