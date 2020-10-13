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

In Angular Framework, the most used and important data binding techniques are known as Two-Way Data Binding. Two-way binding is mainly used in the input type field or any form element where the user can provide input values from the browser or provides any value or changes any control value through the browser. On the other side, the same is automatically updated into the component variables and vice versa. Similarly, in Angular 8 we have a directive called ngModel, and it needs to be used as below:

![](../../../.gitbook/assets/image%20%28320%29.png)

ngModel performs both property binding and event binding. Actually, the property binding of the ngModel \(i.e. \[ngModel\]\) performs the activity to update the input element with a value. Whereas \(ngModel\) \( \(ngModelChange\) event\) instructs the outside world when any change occurred in the DOM Element.



```typescript

//app.module.ts need to import FormsModule


@NgModule({ declarations: [ AppComponent
], imports: [ BrowserModule,FormsModule ],


// component.html need to have [(ngmodel)]


 <div>  
  <div>  
      <span>Enter Your Name </span>  
      <input [(ngModel)]="val" type="text"/>  
  </div>  
  <div>  
      <span>Your Name :- </span>  
      <span>{{val}}</span>  
  </div>  
</div>  
 
 
 
 
 //component.ts need to have the variable declared 
 
 
 export class AppComponent {  
    
  public val: string = "";  
}   
 
 
 
 
 
 
```



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



**Input & Output example 2**

```typescript
//input case 

// MessageComponent 


export class MessageComponent {  
  
    @Input() public message :string = '';  
  
    @Input('alert-pop') public message1 :string= ''  
    
    public showAlert():void{  
        alert(this.message1);  
    }  
}  

//Message HTML, the value will come from parent class 

<div>  
    Message : <h2>{{message}}</h2>  
    <input type="button" value="Show Alert" (click)="showAlert()"/>  
</div>  


// Parent class - App Component 


export class AppComponent {  
    
  public val: string = "This is alert popup message";  
  
}

// Parent inject it into child, using properties binding

<div>  
  <message-info [message]="'Demostration of Input Property of a Component'" [alertPop]="val"></message-info>  
</div> 
```

**// Output Case**

```typescript

//Message Component need to bind the callback method with EventEmitter


    @Output() onSignup  = new EventEmitter<any>();  
  
    public data:any={};  
    
    public onSubmit() :void{  
      this.onSignup.emit(this.data);  
    } 


//Message Component HTML need to collect and provide button to submit


<div>  
    Message : <h2>{{message}}</h2>  
    <input type="button" value="Show Alert" (click)="showAlert()"/>  
    <br/><br/>  
    Provide Full Name : <input type="text" [(ngModel)]="data.name">  
    <br/>  
    Provide Email Id : <input type="email" [(ngModel)]="data.email">  
    <br>  
    <input type="button" value="Sign Up" (click)="onSubmit()"/>  
</div>  


// AppComponent needs to have the onSignUp style 

  public onSignup(data:any):void{  
    let strMessage:string ="Thanks for Signup " + data.name + ". ";  
    strMessage += "Email id " + data.email + " has been registered successfully.";  
    alert(strMessage);  
  } 
  
  
// AppComponet HTML


  <div>  
    <message-info [message]="'Demostration of Input Property of a Component'" [alert-pop]="val" (onSignup)="onSignup($event)"></message-info>      
</div>  
```

\*\*\*\*

\*\*\*\*

