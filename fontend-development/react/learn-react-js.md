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

12\) life cycle method

![](../../.gitbook/assets/image%20%28251%29.png)

```javascript

  componentDidMount(){
    //get the data i need 
    console.log("componentDidMount, first time it is rendered, used for initilizing some API stuff")
  }

  shouldComponentUpdate(nextProps, nextState){
    //return true if want it to update
    //return false if not
  }

  componentWillUnmount(){
    //to do cleanup or teardown 
    
  }


```

13\) Conditional Rendering

```javascript
//TEST.js

    render(){
        return(
            <div>
                <Conditional isLoading={this.state.isLoading}/>
            </div>
        )
    }


// Conditional.js


function Conditional(props){
    
    return (
       props.isLoading ===true ? <h1>true</h1> : <h1>false</h1>
    )
}

```

practise for conditional rendering

```javascript

import React from "react"
import Conditional from "././Conditional"

class Test extends React.Component{
    constructor(){
        super()
        this.state ={
            isLoggedIn : false
        }
        
        this.onButtonClick = this.onButtonClick.bind(this);
    }

    onButtonClick(){
        this.setState((prevState)=>{
            if(prevState.isLoggedIn==true){
                return {isLoggedIn : false}
            }
            else{
                return {isLoggedIn : true}
            }
        })
    }


    render(){
        return(
            <div>
               <button onClick={this.onButtonClick}>{this.state.isLoggedIn==false?"LogIn":"LogOut"}</button>
               <h1>User is {this.state.isLoggedIn==false ?"notLogin":"loggedIn"}</h1>
            </div>
        )
    }

}

export default Test

```

14\) fetching data from API

[https://medium.com/@armando\_amador/how-to-make-http-requests-using-fetch-api-and-promises-b0ca7370a444](https://medium.com/@armando_amador/how-to-make-http-requests-using-fetch-api-and-promises-b0ca7370a444)

```javascript

    constructor(){
        super()
        this.state ={
            character : {}
        }
    }
        

    componentDidMount(){
        fetch("https://swapi.dev/api/people/1/")
        .then(response => response.json()) //response parse to json 
        .then(data => {
            this.setState({character:data}) //data is set in state  
        })
    }
   

    render(){
        return(
            <div>
               <h1>{this.state.character.name}</h1>
            </div>
        )
    }



```

15\) Forms

```javascript

class Test extends React.Component{
    constructor(){
        super()
        this.state ={
            firstName:"",
            lastName:""
        }

        this.handleChange = this.handleChange.bind(this);
    }

    handleChange(event){
        this.setState({
           [event.target.name]:event.target.value})
    }
        

    render(){
        return(
            <div>
               <form>
                   <input type="text" name="firstName" placeholder="FirstName" onChange={this.handleChange}></input>
                   <input type="text" name="lastName" placeholder="LastName" onChange={this.handleChange}></input>
                   <h1>{this.state.firstName}</h1>
                   <h1>{this.state.lastName}</h1>
               </form>
            </div>
        )
    }

```

```javascript

    render(){
        return(
            <div>
               <form>
                    <textarea value={"some default"}/>
                    <input type="checkbox" checked={false} name="isFriendly"/>
                    <input type="radio" />
                    <select value = {this.state.favColor} name="favColor">
                                <option value="yellow">Yellow</option>
                                <option value="red">Red</option>
                            </select>
               </form>
            </div>
        )
    }
```

exercise

```javascript

import React from "react"
import Conditional from "././Conditional"

class Test extends React.Component{
    constructor(){
        super()
        this.state ={
                firstName:"",
                lastName:"",
                age:"",
                gender:"male",
                destination:"",
        
                    isVegan : false,
                    isKosher : false,
                    isLactoseFree : false
                
        }

        this.handleChange = this.handleChange.bind(this);


    }

    handleChange(event){
        const {name, value, type, checked} = event.target;

        type==="checkbox" ? this.setState({
           
                [name] :checked
            
        })
        :
        this.setState({
            [name]:value
        })
    }
  
        

    render(){
        return(
            <div>
               <form>
                   <input name="firstName" value={this.state.firstName} onChange={this.handleChange} placeholder="First Name" /> <br/>
                   <input name="lastName" value={this.state.lastName} onChange={this.handleChange} placeholder="Last Name" /> <br/>
                   <input name="age" value={this.state.age} onChange={this.handleChange} placeholder="Age" /> <br/>
                   <label>
                       <input type="radio" name="gender" value="male" checked={this.state.gender==="male"} onChange={this.handleChange}/> Male
                       <input type="radio" name="gender" value="female" checked={this.state.gender==="female"} onChange={this.handleChange}/> Female
                   </label><br/>

                   <select value={this.state.destination} name="destination" onChange={this.handleChange}>
                       <option value="shanghai">shanghai</option>
                       <option value="beijing"> beijing</option>
                   </select><br/>

                    <label>
                        <input type="checkbox" name="isVegan" onChange={this.handleChange} checked={this.state.isVegan}></input>isVegan
                        <input type="checkbox" name="isKosher" onChange={this.handleChange} checked={this.state.isKosher}></input>isKosher
                        <input type="checkbox" name="isLactoseFree" onChange={this.handleChange} checked={this.state.isLactoseFree}></input>isLactoseFree

                    </label>

               </form>


            <br></br>
            <h2>Entered Information</h2>
            <p2>Your Name: {this.state.firstName} {this.state.lastName}</p2>
            <br></br>
            <p2>Your Age: {this.state.age} </p2>
            <br></br>
            <p2>Your gender: {this.state.gender} </p2>
            <br></br>
            <p2>Your destination: {this.state.destination} </p2>
            <br></br>
            
            </div>


        )
    }

}

export default Test

```

