---
description: 'https://www.youtube.com/watch?v=CVpUuw9XSjY'
---

# React edux

Redux is a predictable state container for JavaScript apps.

It helps you write applications that behave consistently, run in different environments \(client, server, and native\), and are easy to test. On top of that, it provides a great developer experience, such as [live code editing combined with a time traveling debugger](https://github.com/reduxjs/redux-devtools).

You can use Redux together with [React](https://reactjs.org/), or with any other view library. It is tiny \(2kB, including dependencies\), but has a large ecosystem of addons available.



1\) Actions

return data/type, which reducers will listen to the event and act according..

```jsx
//action folder index.js


export const increment = () =>{
    return {
        type: 'INCREMENT'
    }
}

export const decrement = () =>{
    return {
        type: 'DECREMENT'
    }
}

```

2\) Reducers 

listen to action and perform processing on the store / state

```jsx
//reducers folder 

counter.js 


const counterReducer = (state =0, action) =>{
    switch(action.type){
        case 'INCREMENT':
            return state +1;
        case 'DECREMENT':
            return state -1;

        default:
            return state;
    }
};

export default counterReducer;

```

3\) Create a store and inject into the App from index.js 

```jsx


import {createStore, combineReducers} from 'redux';

import rootReducers from './reducers';

import {Provider} from 'react-redux';

const store = createStore(rootReducers,  window.__REDUX_DEVTOOLS_EXTENSION__ && window.__REDUX_DEVTOOLS_EXTENSION__());


ReactDOM.render(

  <Provider store={store}>
  <React.StrictMode>

    <App />
  </React.StrictMode>
  </Provider>,
  document.getElementById('root')
);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();
```

4\) in App.js,  import and fetch state object using useSelector , dispatch using useDispatch\(\)

```jsx


import React from 'react-redux';
import {useSelector, useDispatch} from 'react-redux';
import {increment, decrement} from './actions'
function App() {

  const counter = useSelector(state => state.counter);
  const islogged = useSelector(state => state.islogged);
  const dispatch =  useDispatch()

  return (
    <div className="App">
      <h1>Counter {counter}</h1>
      <button onClick={()=>dispatch(increment())}>+</button>
      <button onClick={()=>dispatch(decrement())}>-</button>
      {islogged?<h3>Valuable Information I shoulnt' see  </h3>: ''}
      
    </div>
  );
}

export default App;



```

