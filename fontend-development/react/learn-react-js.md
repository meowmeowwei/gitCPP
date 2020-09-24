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

3\) Styling the CSS

add className rather than class in the HTML tag, because JSX accept className

```javascript

import React from 'react';
import './App.css';

function App() {
  return (
    <div >

       <header className="navbar">This is a header</header>
    
    </div>
  )
}

export default App;


// note -> className can only be added to react elements, not react components 
```

in the css.. just need to do .className to add style....e.g. .navbar

```javascript

.navbar{
  background-color:yellow;
}

```

4\) adding javascript in JSX ...use { }

```javascript


function App() {

  const name = "sunwei";
  return (
    <div >

       <header className="navbar">hello {name}</header>
    
    </div>
  )
}
```

5\) dynamic setting inline style in JSX

![](../../.gitbook/assets/image%20%28250%29.png)

6\) component reusage, passing in the properties, so that you can use the same one

```javascript
//declare the properties as task in the TodoItem

function App() {


  return (
    <div>
      <TodoItem task="hello"/>
      <TodoItem task="hello2"/>
      <TodoItem task="hello3"/>

    </div>
  )
}


```

in ToDoItem, fetch the value from the props

```javascript

function TodoItem(props){
    console.log(props);
    return(
        <div className="todoItem">
        <input type="checkbox" />
        <p>{props.task} </p> // use curly braces 
      </div>
    );
}
```

option2 , pass in the object as properties , good when fetching the file from Json

```javascript
function App() {


  return (
    <div>
      <TodoItem task={{taskName:"hello"}}/>
      <TodoItem task={{taskName:"hello2"}}/>
      <TodoItem task={{taskName:"hello3"}}/>

    </div>
  )
}

// in TODOItem file
function TodoItem(props){
    console.log(props);
    return(
        <div className="todoItem">
        <input type="checkbox" />
        <p>{props.task.taskName} </p>      
      </div>
    );
}
```

7\) using Map to read from Json object 

have a ToDoData.js

```javascript

const ToDoData =[
    {
        taskName : "shower"
    },
    {
        taskName : "eat lunch"
    },
    {
        taskName : "eat dinner"
    }
]

export default ToDoData;
```

import and generate TodoItem from each data using javascript map function

```javascript

import ToDoData from "./ToDoData";

function App() {


  const todoItems = ToDoData.map(function(item){
    return <TodoItem key ={item.id} item={item}/>
  })

  return (
    <div>
      {todoItems}

    </div>
  )
}

export default App;

//TotoItem

function TodoItem(props){
    console.log(props);
    return(
        <div className="todoItem">
        <input type="checkbox" checked={props.item.completed}/> //checked box
        <p>{props.item.taskName} </p>      
      </div>
    );
}
```



8\) class based component 

```javascript

class Header extends React.Component{
  render(){
    return(
      <header>
        <p>Welcome, {this.props.username}</p>  // must use this.props 
      </header>
    )
  }
}

class App extends React.Component{ //must extend from React.Component 
  render(){ // must call render and return  
    return(
    <div>
      <Header username="sunwei" /> // pass in the props
    </div>
    )
  }
}

```

9\) state , needs to be always in class based component 

if you pass props to other component, they cant change and update props

when state info is sent and updated later on, all components who received the state from parent via props will be updated automatically

```javascript

class App extends React.Component{
  constructor(){ //need to have constructor , need to call super and set the state 
    super();
    this.state = {
      answer: "Yes"
    }
  }

  render(){
    return(
    <div>
      <h1> is state important : {this.state.answer}</h1>
      <Header answer={this.state.answer}/>
    </div>
    )
  }
}


```

10\) handling events

```javascript

function handleClick(){
  console.log("clicked");
}


class App extends React.Component {

  constructor(){
    super();

    this.state = ToDoData.map(function(item){
      return <TodoItem key ={item.id} item={item}/>
    })
  }

  render(){
    return (
      <div>
        <button onClick={handleClick}>click me</button>
      </div> //onClick here can lead to the functioncall... note {handleClick} 
    )
  }
  
}

```

11\) state management

```javascript

class App extends React.Component {

  constructor(){
    super();

    this.state={
      count:0
    }

    this.handleClick = this.handleClick.bind(this);  // need to bind in constructor
  }


  handleClick(){
    this.setState((prevState)=>{  // can access previous state  
      return {
        count : prevState.count+1
      }
    })
  }
  
  render(){
    return (
      <div>
       <h1>{this.state.count}</h1>
       <button onClick={this.handleClick}>Change</button> // must call this.handleclick
      </div>
    )
  }


```

you can pass the method down to the function component 

App.js

```javascript
class App extends React.Component {

  constructor(){
    super();

    this.state={
      todos:ToDoData
    }

    this.handleClick = this.handleClick.bind(this);  // need to bind in constructor
  }

  handleClick(id){

    this.setState((prevState)=>{
      const updateTodos = prevState.todos.map(todo =>{
        if(todo.id === id){
          todo.completed = !todo.completed;
        }
        return todo;
      })
      return {todos : updateTodos}
    })
  }
  
  render(){

    const todoItems = this.state.todos.map(item=> <TodoItem key={item.id} item={item} handleClick={this.handleClick}/>)
    return (
      <div>
        {todoItems}
       </div>
    )
  }
}


```

```javascript



function TodoItem (props){
      return(
        <div className="todoItem">
         
        <input type="checkbox"   onChange={(event)=>props.handleClick(props.item.id)}/> 
        <p>{props.item.taskName} </p>      
      </div>
    );
    
    // note it's taking in event in onChange
}

```

