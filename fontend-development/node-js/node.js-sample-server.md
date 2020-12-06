# Node.JS sample server

```typescript


const http = require('http');

const server = http.createServer((request, response)=>{
	//console.log('I hear you! thanks for the request');
	//console.log('headers', request.headers);
	console.log('methods', request.method);
	console.log('url', request.url);
	response.setHeader('Content-Type', 'application/json');
	const user = {
		name: 'John',
		hobby: 'Skating'
	}
	response.end(JSON.stringify(user));
})

server.listen(3001);


```

