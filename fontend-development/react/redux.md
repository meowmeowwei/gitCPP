---
description: 'https://www.youtube.com/watch?v=CVpUuw9XSjY'
---

# React Redux

[Redux Tutorial](https://www.taniarascia.com/redux-react-guide/) 

[https://www.taniarascia.com/redux-react-guide/](https://www.taniarascia.com/redux-react-guide/)

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



{% embed url="https://redux.js.org/tutorials/essentials/part-1-overview-concepts" %}



For Redux specifically, we can break these steps into more detail:

* Initial setup:
  * A Redux store is created using a root reducer function
  * The store calls the root reducer once, and saves the return value as its initial `state`
  * When the UI is first rendered, UI components access the current state of the Redux store, and use that data to decide what to render. They also subscribe to any future store updates so they can know if the state has changed.
* Updates:
  * Something happens in the app, such as a user clicking a button
  * The app code dispatches an action to the Redux store, like `dispatch({type: 'counter/increment'})`
  * The store runs the reducer function again with the previous `state` and the current `action`, and saves the return value as the new `state`
  * The store notifies all parts of the UI that are subscribed that the store has been updated
  * Each UI component that needs data from the store checks to see if the parts of the state they need have changed.
  * Each component that sees its data has changed forces a re-render with the new data, so it can update what's shown on the screen

Here's what that data flow looks like visually:

![Redux data flow diagram](https://redux.js.org/assets/images/ReduxDataFlowDiagram-49fa8c3968371d9ef6f2a1486bd40a26.gif)

