---
description: 'https://www.youtube.com/watch?v=Fdf5aTYRW0E'
---

# Angular - Youtube -ToDoApp

[git hub location ](https://github.com/bradtraversy/angular-crash-todolist)



Architecture 

appComponent -&gt; todos.components-&gt; todoItem.component



**1\) Creating Service -&gt; ng c s todo**

the to do service will be used for getting the toDoItem objects 

```typescript

// todo.service.ts


import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class TodoService {

  constructor() { }


  getTodos(){
    return [ 
      {
        id:1,
        title:'Todo 1',
        completed:false
      },
      {
        id:2,
        title:'Todo 2',
        completed:false
      },
      {
        id:3,
        title:'Todo 3',
        completed:true
      }
    ]
  }
}

```

in the todos.component ,then we import in the todoService 

```typescript
//Todo.component

import { TodoService } from './../../services/todo.service';
import { Component, OnInit } from '@angular/core';
import {Todo} from '../../Todo';

@Component({
  selector: 'app-todos',
  templateUrl: './todos.component.html',
  styleUrls: ['./todos.component.css']
})
export class TodosComponent implements OnInit {


  todos:Todo[];

  constructor(private todoService:TodoService) {

  }

  ngOnInit(): void {
    
  }

}
```

**2\) for service to use http modules to fetch and post to backend**

```typescript

//import HttpClientModule in app.modules.ts


import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {HttpClientModule} from '@angular/common/http'

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { TodosComponent } from './components/todos/todos.component';
import { TodoItemComponent } from './components/todo-item/todo-item.component';

@NgModule({
  declarations: [
    AppComponent,
    TodosComponent,
    TodoItemComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }


```

for fetching it , you need to import HttpClient, HttpHeaders and Observable 

```typescript

//services.component


import { Todo } from './../Todo';
import { Injectable } from '@angular/core';
import {Observable} from 'rxjs'
import { HttpClient, HttpHeaders} from '@angular/common/http'



@Injectable({
  providedIn: 'root'
})
export class TodoService {

  todosurl:string =  'http://jsonplaceholder.typicode.com/todos'
  constructor(private http:HttpClient) { }


  getTodos():Observable<Todo[]>{
    return this.http.get<Todo[]>(this.todosurl)
  }
}

```

```typescript

//todosComponent

//need to use subscribe to get the values 

  ngOnInit(): void {
    this.todoService.getTodos().subscribe(todos =>{
      this.todos = todos;
    });
  }

```

**3\) post method**

```typescript


  //Toggle Completed

  toggleCompleted(todo:Todo):Observable<any>{
    const url = `${this.todosurl}/${todo.id}`
    return this.http.put(url, todo, httpOptions)
  }

```

4\) use Output and emitter , when you click delete button in todo-item.component to emit back the delete action

```typescript
//todoitem compoenent 

 
 
  export class TodoItemComponent implements OnInit {

  @Input() todo: Todo;

  @Output() deleteTodo:EventEmitter<Todo> = new EventEmitter();

  constructor(private TodoService:TodoService) { }

  ngOnInit(): void {
  }

  //Set dynamic classes
  setClasses(){
    let classes = {
      todo:true,
      'is-complete':this.todo.completed
    }
    return classes;
  }

  onToggle(todo){
    //Toggle in UI
    todo.completed = !todo.completed;

    //Toggle in server

    this.TodoService.toggleCompleted(todo).subscribe(todo=>console.log(todo))
  }

  onDelete(todo){
    this.todos = this.todos.filter(t=>t.id!==todo.id);

    this.todoService.deleteTodo(todo).subscribe();
  }
}

//HTML

    <button (click)="onDelete(todo)" class="del">z</button>
    </p>
```







