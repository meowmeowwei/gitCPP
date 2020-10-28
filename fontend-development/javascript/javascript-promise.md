---
description: 'https://docs.w3cub.com/javascript/global_objects/promise/'
---

# JavaScript Promise

## Promise

The `Promise` object represents the eventual completion \(or failure\) of an asynchronous operation, and its resulting value.



```javascript

const promise = new Promise (function (resolve, reject){
	let random = Math.round(Math.random() * 10);

	if(random % 2 === 0){
		setTimeout(function(){resolve(random)}, 1000)
	}
	else{
		setTimeout(function(){reject(random)}, 1000)
	}
})

promise.then(console.log(promise))
.then(function(res){console.log(res)})
.catch(function(err){console.log(err)})


```

