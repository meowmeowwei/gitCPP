# Redux





Action - sends data from application to Redux Store \(conventionally an object with two properties, type and payload\)

* Action Creator - function that returns an action 

```javascript


export const rateColor = (id, rating) =>({type: C.RATE_COLOR,id,rating})



store.dispatch( rateColor("441e0p2-9ab4-0p523-30e4-8001l8yf2412", 5) )
```

* Reducer - a function that takes two parameter \(state , action\) . can treat it as event action listener-&gt; consists of switch statements and return a copy of entire state
* Store - keeps redux application state 

```javascript


const store = createStore(
combineReducers({ colors, sort }),
initialState
)
```

* Dispatch - a method available on the store object used to update Redux state. .. 

```javascript


store.dispatch(
{type: "RATE_COLOR",id: "2222e1p5-3abl-0p523-30e4-8001l8yf2222",rating: 5}
)
```

* Subscribing to Stores \(subscribe handler functions that are invoked everytime\) 

```javascript


store.subscribe(
() =>console.log('color count:', store.getState().colors.length)
)

// the subscribe function returns a function which you can use to unsubscribe later



const unsubscribeLogger = store.subscribe(logState)
// Invoke when ready to unsubscribe the listener
unsubscribeLogger()Connect - function that connect React to Redux
```



Middleware -&gt; serves as a glue between two different layers or different piece of softwares 

