---
description: >-
  https://www.c-sharpcorner.com/article/learn-angular-8-step-by-step-in-10-days-component-day-2/
---

# Day 2 - Building block of Angular

### What is a Component? 

 A Component is basically a class that is defined for any visible element or controls on the screen. Every component class has some properties and by using them, we can manipulate the behavior or looks of the element on the screen. So, we can create, update or destroy our own components as per the requirement at any stage of the application. But **in TypeScript, a component is basically a TypeScript class decorated with an @Component\(\) decorator.** From an **HTML point of view, a component is a user-defined custom HTML tag that can be rendered in the browser to display any type of UI element along with some business logic.**

### @Component Metadata 

 So in Angular, when we want to create any new component, we need to use the @Component decorator. @Component decorator basically classifies a TypeScript class as a component object. Actually, @Component decorator is a function that takes different types of parameters. In the @Component decorator, we can set the values of different properties to finalize or manipulate the behavior of the components. The most commonly used properties of the @Component decorator are as follows:

1. **selector** – A component can be used by the selector expression. Many people treat components like a custom HTML tag because finally when we want to use the component in the HTML file, we need to provide the selector just like an HTML tag. 
2. **template** – The template is the part of the component which is rendered in the browser. In this property, we can pass the HTML tags or code directly as inline code. Sometimes, we call this the inline template. To write multiple lines of HTML code, all code needs to be covered within the tilt \(\`\) symbol. 
3. **templayeUrl** – This is another way of rendering HTML tags in the browser. This property always accepts the HTML file name with its related file path. Sometimes it is known as the external template. The use of this property is much better when we want to design any complex UI within the component. 
4. **moduleId** – This is used to resolve the related path of template URL or style URL for the component objects. It contains the Id of the related modules in which the component is attached or tagged. 
5. **styles / stylesUrls** – Components can be used in their own style by providing custom CSS, or they can refer to external style sheet files, which can be used by multiple components at a time. To provide an inline style, we need to use styles, and to provide an external file path or URL, we need to use styleUrls. 
6. **providers** – In the real-life application, we need to use or inject different types of custom services within the component to implement the business logic for the component. To use any user-defined service within the component, we need to provide the service instance within the provider. Basically, the provider property is always allowed array-type value. So that we can define multiple service instance names that can be provided by comma separation within this property at a time.



### Life Cycle of a Component 

 Just like other frameworks, Angular components have their own life cycle events that are mainly maintained by Angular itself. Below is the list of life cycle events of any Angular components. In Angular, every component has a life-cycle, a number of different stages it goes through from initialization to destruction. There are eight different stages in the component lifecycle. Every stage is called a life cycle hook event. So, we can use these component lifecycle events in different stages of our application to obtains complete controls on the components.

* **ngOnChanges** – This event executes every time a value of an input control within the component has been changed. This event activates first when the value of a bound property has been changed. 
* **ngOnInit** – This event executed at the time of Component initialization. This event is called only once, just after the ngOnChanges\(\) events. This event is mainly used to initialize data in a component. 
* **ngDoCheck** – This event is executed every time when the input properties of a component are checked. We can use this life cycle method to implement the checking on the input values as per our own logic check. 
* **ngAfterContentInit** – This lifecycle method is executed when Angular performs any content projection within the component views. This method executes only once when all the bindings of the component need to be checked for the first time. This event executes just after the ngDoCheck\(\) method. 
* **ngAfterContentChecked** - This life cycle hook method executes every time the content of the component has been checked by the change detection mechanism of Angular. This method is called after the ngAfterContentInit\(\) method. This method is can also be executed on every execution of ngDoCheck\(\) event. 
* **ngAfterViewInit** – This life cycle method executes when the component completes the rendering of its view full. This life cycle method is used to initialize the component’s view and child views. It is called only once, after ngAfterContentChecked\(\). This lifecycle hook method only applies to components. 
* **ngAfterViewChecked** – – This method is always executed after the ngAterViewInit\(\) method. Basically, this life cycle method is executed when the change detection algorithm of the angular component occurs. This method automatically executed every execution time of the ngAfterContentChecked\(\). 
* **ngOnDestroy** – This method will be executed when we want to destroy the Angular components. This method is very useful for unsubscribing the observables and detaching the event handlers to avoid memory leaks. It is called just before the instance of the component being destroyed. This method is called only once, just before the component is removed from the DOM. 



