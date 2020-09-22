---
description: 'https://www.youtube.com/watch?v=DLX62G4lc44'
---

# Learn React JS

1\) Functional component 

```javascript

function MyApp(){ //functinal component, just need to return the values 
  return (<ul><li>sunwei</li></ul>);
}

ReactDOM.render(
  <React.StrictMode><MyApp /></React.StrictMode>,
  document.getElementById('root')
);


```

2\) put component into separate files , e.g. MyInfo

```javascript

import React from 'react';

function MyInfo(){  //this is JSX, so you need to import React 
    return(<div>
    <h1>SunWei</h1>
    <p>I am 32 years old </p>
    <ol>
      <li>2</li>
      <li>1</li>
    </ol>
    </div>)
  }

export default MyInfo;
```

then in index.js

```javascript

import MyInfo from './MyInfo';


ReactDOM.render(
  <React.StrictMode><MyInfo /></React.StrictMode>,
  document.getElementById('root')
);

```

