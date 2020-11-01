---
description: >-
  https://www.digitalocean.com/community/tutorials/how-to-build-a-react-to-do-app-with-react-hooks
---

# React Hooks

Allowing application to use functional component to set the state -&gt; useState



src/App.js

```text
import React from 'react';
import logo from './logo.svg';
import './App.css';

function App() {
  const [todos, setTodos] = React.useState([
    { text: "Learn about React" },
    { text: "Meet friend for lunch" },
    { text: "Build really cool todo app" }
  ]);

  return (
    // ...
  );
}

export default App;
```

The component is a functional component. In past versions of React, functional components were unable to handle state, but now, by using Hooks, they can.

* The first parameter, `todos`, is what you are going to name your state.
* The second parameter, `setTodos`, is what you are going to use to set the state.

The hook of `useState` is what React uses to hook into the state or lifecycle of the component. You will then create an array of objects and you will have the beginnings of your state.



```javascript

import React from "react";
import "./App.css";


function Todo({ todo, index, completeToDo, deleteToDo }) {
  return (
    <div style={{textDecoration: todo.isCompleted? 'line-through':''}} className="todo">
      {todo.text}
      <div>
        <button onClick={()=>completeToDo(index)}>Complete</button>
        <button onClick={()=>deleteToDo(index)}>Delete</button>
      </div>
    </div>
  );
};

function TodoForm({addTodo}){

  const [value, setValue] = React.useState('');

  const handleSubmit = e => {
    e.preventDefault();
    if(!value)
    return;
    addTodo(value);
    setValue('');
  }

  return (
    <form onSubmit = {handleSubmit}>
      <input type="text" className="input" placeholder="Add to do" value={value} onChange={e =>setValue(e.target.value)}/>
    </form>
  )

}


function App()  {

  const [todos, setTodos] = React.useState([
    { text: "Learn about React" ,
      isCompleted: false
    },
    { text: "Meet friends for lunch" ,
    isCompleted: false
    },
    { text: "eat apple" ,
    isCompleted: false
    }
  ]);

  const addToDo = text =>{
    const newTodos = [...todos, {text}];
    setTodos(newTodos);
  }

  const completeToDo = index =>{
    const newTodos = [...todos];
    newTodos[index].isCompleted = true;
    setTodos(newTodos);
  }

  const deleteToDo = index =>{
    const newTodos = [...todos];
    newTodos.splice(index,1)
    setTodos(newTodos);
  }


  return (
    <div className="app">
      <div className="todo-list">
        {todos.map((todo, index) => (
          <Todo
            key={index}
            index={index}
            todo={todo}
            completeToDo={completeToDo}
            deleteToDo={deleteToDo}
          />
        ))}
        <TodoForm addTodo={addToDo}/>
      </div>
    </div>
  );
  
}

export default App;




```

