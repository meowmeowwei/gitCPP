---
description: 'https://www.w3schools.com/nodejs/nodejs_get_started.asp'
---

# Node JS

runtime env to run javascript outside website 

### What is Node.js?

* Node.js is an open source server environment
* Node.js is free
* Node.js runs on various platforms \(Windows, Linux, Unix, Mac OS X, etc.\)
* Node.js uses JavaScript on the server



### What is NPM? \(node package manager\) 

NPM is a package manager for Node.js packages, or modules if you like.  

\(e.g. require\(http\)\)-&gt; http is a module

[www.npmjs.com](https://www.npmjs.com/) hosts thousands of free packages to download and use.

The NPM program is installed on your computer when you install Node.js





As mentioned earlier, node.js is a JavaScript runtime designed to run on the server. Here’s what the earlier example would look like using node.js modules. Instead of loading all of **`moment.min.js`** with an HTML script tag, you can load it directly in the JavaScript file as follows:

```text
// index.js
var moment = require('moment');console.log("Hello from JavaScript!");
console.log(moment().startOf('day').fromNow());
```

This is all great for node.js, but if you tried to use the above code in the browser, you’d get an error saying `require` is not defined. The browser doesn’t have access to the file system, which means loading modules in this way is very tricky — loading files has to be done dynamically, either synchronously \(which slows down execution\) or asynchronously \(which can have timing issues\).



1\) Require style

2\) ES6 style

need a package.json that defines "type":"module",

//script2.js

```text
export const largeNumber = 356
```

//test1.js

```text


import {largeNumber} from './script2.js'

const a = largeNumber;
const b = 6;


console.log(a+b);

```

