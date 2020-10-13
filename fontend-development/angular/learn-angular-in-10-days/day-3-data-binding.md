---
description: >-
  https://www.c-sharpcorner.com/article/learn-angular-8-step-by-step-in-10-days-data-binding-day-3/
---

# Day 3 - Data Binding

So, the first and foremost advantage of data binding is that it updates the data models automatically in respect of the view. So, when the data model updates, that will automatically update the related view element in the application. In this way, angular provides us a correct data encapsulation on the front end and it also reduced the requirement to perform complex and destructive manipulation of the DOM elements.



### Different Types of Data Binding

  
In Angular 8, there are four different types of Data binding processes available. They are:

* Interpolation

Interpolation data binding is the most popular and easiest way of data binding in Angular 8. This feature is also available in previous Angular framework versions. Actually, the context between the braces is the template expression that Angular first evaluates and then convert into strings. Interpolation uses the braces expression i.e.  to render the bound value to the component template. It can be a static string, numeric value, or an object of your data model. In Angular, we use it like this: . The below example shows how we can use the interpolation in the component to display data in the front end.

```typescript
// in the HTML refer to the object using {{}}

<div>   
    <span>User Name : {{userName}}</span>      
</div>  


// in the component.ts do the setting of variable 

export class AppComponent {
  title:string = 'Welcome to Angular 8 Learning Series...';  
}


```

* Property Binding

Property binding used \[\] to send the data from the component to the HTML template. The most common way to use property binding is to assign any property of the HTML element tag into the \[\] with the component property value, i.e:

```typescript
//in the HTML do the reference using [], which is passed in the properties field 

<button class="btn btn-primary"  
        [disabled]="allowNewServer">Add Server</button>  
        
        
// in appcomponent, you still define the same         

export class Server2Component implements OnInit {  
 allowNewServer = false;  
  
  constructor() {  
    setTimeout(() =>{  
      this.allowNewServer = true;  
    }, 5000);  
  }  
  
  ngOnInit() {  
  }  
  
}  

```

* Two-Way Binding 
* Event Binding

in the event call , button click / mouse over , then we trigger an function 

```typescript

// HTML

<div>  
  <h2>Demo of Event Binding in Angular 8</h2>  
  <input type="button" value="Click" class="btn-block" (click)="showAlert()" />  
  <br /><br />  
  <input type="button" value="Mouse Enter" class="btn-block" (mouseenter)="showAlert()" />  
</div>  


// component 


export class AppComponent {
  allowNewServer = false;  
  
  public showAlert() : void {  
    console.log('You clicked on the button...');  
    alert("Click Event Fired...");  
  } 
}


```





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

