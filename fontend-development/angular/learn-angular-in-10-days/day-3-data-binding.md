---
description: >-
  https://www.c-sharpcorner.com/article/learn-angular-8-step-by-step-in-10-days-data-binding-day-3/
---

# Day 3 - Data Binding

So, the first and foremost advantage of data binding is that it updates the data models automatically in respect of the view. So, when the data model updates, that will automatically update the related view element in the application. In this way, angular provides us a correct data encapsulation on the front end and it also reduced the requirement to perform complex and destructive manipulation of the DOM elements.



### Different Types of Data Binding

  
In Angular 8, there are four different types of Data binding processes available. They are:

* Interpolation 
* Property Binding 
* Two-Way Binding 
* Event Binding

\`\`[`Input and Output` ](https://www.youtube.com/watch?v=DUe8y6QVPMk)\`\`

**Input\(\)** -&gt; for sending data from Parent Component to Child Component 

parent has a value -&gt; parent will pass the hello value and bind into child's state variable 

```markup
<div>  
  <p>Value: {{hello}}</p>
  <app-child-component [state]="hello"></app-child-component>  
</div>  
```

child will have the input declaration on a variable called state 

```text
  @Input() public state:string;  


in child's HTML

<div>  
   Value from Parent:{{state}}
</div>  

```



**Output\(\)** -&gt; for child process to send event to Parent

child needs to have an event emitter to send the value up 

```text

  @Output() event: EventEmitter<string> = new EventEmitter();

  public goodbye = "goodbye";

  sendToParent(){
    this.event.emit(this.goodbye);
  }
```

Child's html need to have a call button to send 

```text

 <button (click)="sendToParent()" class ="primary">SendToParent</button>
```

parent's HTML will have a way to receive event 

```text

  <p>Value from child: {{goodBye}}</p>
  <app-child-component [state]="hello" (event)="setDataFromChild($event)"></app-child-component>  
```

Parent's component will have a logic to set the Data 

```text

  public goodBye:string;
  setDataFromChild(data){
    this.goodBye = data;
  }
```

